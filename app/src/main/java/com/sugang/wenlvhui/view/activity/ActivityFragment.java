package com.sugang.wenlvhui.view.activity;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.activity.ActivityPageContract;
import com.sugang.wenlvhui.model.bean.activity.ActivityListBean;
import com.sugang.wenlvhui.model.bean.activity.ActivityPageBean;
import com.sugang.wenlvhui.model.bean.activity.PolicyBean;
import com.sugang.wenlvhui.presenter.activity.ActivityPagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.ActivityReyclerAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import cn.jzvd.JZVideoPlayerStandard;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActivityFragment extends BaseFragment<ActivityPagePresenterImp> implements ActivityPageContract.ActivityPageView {


    @BindView(R.id.Activity_HeadImage)
    ImageView ActivityHeadImage;
    @BindView(R.id.Activity_HuiMinButton)
    AutoLinearLayout ActivityHuiMinButton;
    @BindView(R.id.Activity_YanChuButton)
    AutoLinearLayout ActivityYanChuButton;
    @BindView(R.id.Activity_SheQuButton)
    AutoLinearLayout ActivitySheQuButton;
    @BindView(R.id.CircleText)
    TextView CircleText;
    @BindView(R.id.Activity_QinZiButton)
    AutoLinearLayout ActivityQinZiButton;
    @BindView(R.id.Activity_LiShiButton)
    AutoLinearLayout ActivityLiShiButton;
    @BindView(R.id.group)
    AutoLinearLayout group;
    @BindView(R.id.Activity_ZhiNengPaiXuButton)
    AutoLinearLayout ActivityZhiNengPaiXuButton;
    @BindView(R.id.Activity_ZhuangTaiPaiXuButton)
    AutoLinearLayout ActivityZhuangTaiPaiXuButton;
    @BindView(R.id.Activity_LeiBiePaiXuButton)
    AutoLinearLayout ActivityLeiBiePaiXuButton;
    @BindView(R.id.Activity_RILIButton)
    AutoLinearLayout ActivityRILIButton;
    @BindView(R.id.Activity_DITuButton)
    AutoLinearLayout ActivityDITuButton;
    @BindView(R.id.Activity_ZUIXINText)
    TextView ActivityZUIXINText;
    @BindView(R.id.Activity_ZUIREText)
    TextView ActivityZUIREText;
    @BindView(R.id.Activity_ZhiNengPaiXuTextLayout)
    AutoLinearLayout ActivityZhiNengPaiXuTextLayout;
    @BindView(R.id.Activity_WeiKaiShiText)
    TextView ActivityWeiKaiShiText;
    @BindView(R.id.Activity_JinXinZhongText)
    TextView ActivityJinXinZhongText;
    @BindView(R.id.Activity_YiJieshuText)
    TextView ActivityYiJieshuText;
    @BindView(R.id.Activity_ZhuangTaiPaiXuLayout)
    AutoLinearLayout ActivityZhuangTaiPaiXuLayout;
    @BindView(R.id.Activity_HuiminText)
    TextView ActivityHuiminText;
    @BindView(R.id.Activity_YanChuText)
    TextView ActivityYanChuText;
    @BindView(R.id.Activity_SheQuText)
    TextView ActivitySheQuText;
    @BindView(R.id.Activity_QinZiText)
    TextView ActivityQinZiText;
    @BindView(R.id.Activity_LiShiText)
    TextView ActivityLiShiText;
    @BindView(R.id.Activity_LeiBiePaiXuLayout)
    AutoLinearLayout ActivityLeiBiePaiXuLayout;
    @BindView(R.id.Activity_ActivityRefreshLayout)
    SmartRefreshLayout ActivityActivityRefreshLayout;
    @BindView(R.id.Activity_ActivityRecycler)
    RecyclerView ActivityActivityRecycler;
    private boolean one = false;
    private boolean two = false;
    private boolean three = false;
    private boolean first = false;
    private boolean Second = false;
    private boolean third = false;
    private int Userid;
    private int id;
    private List<PolicyBean> lists = new ArrayList<>();
    private int ZhiNengPaiXu = 0;
    private int ZhuangTaiPaiXu = 0;
    private int LeiBiePaiXu = 0;
    private int page = 1;
    private ActivityReyclerAdapter activityReyclerAdapter;


    public ActivityFragment() {

    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_activity;
    }

    @Override
    protected void init() {
        ActivityActivityRefreshLayout.setEnableAutoLoadMore(false);
        ActivityActivityRefreshLayout.setEnableRefresh(false);
        ActivityActivityRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        activityReyclerAdapter = new ActivityReyclerAdapter(lists, getActivity());
        ActivityActivityRecycler.setAdapter(activityReyclerAdapter);
        activityReyclerAdapter.setOnClick(new ActivityReyclerAdapter.OnClickItem() {
            @Override
            public void setClick(View v, int position) {
                SPUtils.put(getActivity(), SPKey.ACTIVITYID, lists.get(position).getId());
                startActivity(new Intent(getActivity(), ActivityDetalisActivity.class));
            }
        });
    }

    @Override
    protected void loadDate() {
        Userid = (int) SPUtils.get(getActivity(), SPKey.USER_ID, 0);
        presenter.getActivityPageBean(Userid + "");
    }

    @Override
    public void showActivityPageBean(ActivityPageBean activityPageBean) {
        if (activityPageBean.getData() != null) {
            ActivityPageBean.DataBean.FirstBean first = activityPageBean.getData().getFirst();
            Glide.with(this).load(first.getImage()).error(R.mipmap.icon).into(ActivityHeadImage);
            id = first.getId();
            lists.clear();
            lists.addAll(activityPageBean.getData().getLists());
            activityReyclerAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void showActivityListBean(ActivityListBean activityListBean) {
        if (activityListBean.getData() != null) {
            lists.clear();
            lists.addAll(activityListBean.getData().getPolicys());
            activityReyclerAdapter.notifyDataSetChanged();
        }

    }

    @Override
    public void showError(String string) {

    }
    @OnClick({R.id.Activity_HeadImage, R.id.Activity_HuiMinButton, R.id.Activity_YanChuButton, R.id.Activity_SheQuButton, R.id.Activity_QinZiButton, R.id.Activity_LiShiButton, R.id.Activity_ZhiNengPaiXuButton, R.id.Activity_ZhuangTaiPaiXuButton, R.id.Activity_LeiBiePaiXuButton, R.id.Activity_RILIButton, R.id.Activity_DITuButton, R.id.Activity_ZUIXINText, R.id.Activity_ZUIREText, R.id.Activity_WeiKaiShiText, R.id.Activity_JinXinZhongText, R.id.Activity_YiJieshuText, R.id.Activity_ZhuangTaiPaiXuLayout, R.id.Activity_HuiminText, R.id.Activity_YanChuText, R.id.Activity_SheQuText, R.id.Activity_QinZiText, R.id.Activity_LiShiText})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Activity_HeadImage:
                JZVideoPlayerStandard.releaseAllVideos();
                SPUtils.put(getActivity(), SPKey.ACTIVITYID, id);
                startActivity(new Intent(getActivity(), ActivityDetalisActivity.class));
                break;
            case R.id.Activity_HuiMinButton:
                JZVideoPlayerStandard.releaseAllVideos();
                SPUtils.put(getActivity(), SPKey.ACTIVITYTYPE, "惠民");
                startActivity(new Intent(getActivity(), ActivityListActivity.class));
                break;
            case R.id.Activity_YanChuButton:
                JZVideoPlayerStandard.releaseAllVideos();
                SPUtils.put(getActivity(), SPKey.ACTIVITYTYPE, "演出");
                startActivity(new Intent(getActivity(), ActivityListActivity.class));
                break;
            case R.id.Activity_SheQuButton:
                JZVideoPlayerStandard.releaseAllVideos();
                SPUtils.put(getActivity(), SPKey.ACTIVITYTYPE, "社区");
                startActivity(new Intent(getActivity(), ActivityListActivity.class));
                break;
            case R.id.Activity_QinZiButton:
                JZVideoPlayerStandard.releaseAllVideos();
                SPUtils.put(getActivity(), SPKey.ACTIVITYTYPE, "亲子");
                startActivity(new Intent(getActivity(), ActivityListActivity.class));
                break;
            case R.id.Activity_LiShiButton:
                JZVideoPlayerStandard.releaseAllVideos();
                SPUtils.put(getActivity(), SPKey.ACTIVITYTYPE, "历史");
                startActivity(new Intent(getActivity(), ActivityListActivity.class));
                break;
            case R.id.Activity_ZhiNengPaiXuButton:
                JZVideoPlayerStandard.releaseAllVideos();
                if (!first) {
                    ActivityZhiNengPaiXuTextLayout.setVisibility(View.VISIBLE);
                    first = true;
                    if (!one) {
                        ActivityZhiNengPaiXuTextLayout.setVisibility(View.VISIBLE);
                        one = true;
                    } else {
                        ActivityZhiNengPaiXuTextLayout.setVisibility(View.INVISIBLE);
                        one = false;
                    }
                } else {
                    ActivityZhiNengPaiXuTextLayout.setVisibility(View.INVISIBLE);
                    first = false;
                    if (!one) {
                        ActivityZhiNengPaiXuTextLayout.setVisibility(View.VISIBLE);
                        one = true;
                    } else {
                        ActivityZhiNengPaiXuTextLayout.setVisibility(View.INVISIBLE);
                        one = false;
                    }
                }

                break;
            case R.id.Activity_ZhuangTaiPaiXuButton:
                JZVideoPlayerStandard.releaseAllVideos();
                if (!Second) {
                    ActivityZhuangTaiPaiXuLayout.setVisibility(View.VISIBLE);
                    Second = true;
                    if (!two) {
                        ActivityZhuangTaiPaiXuLayout.setVisibility(View.VISIBLE);
                        two = true;
                    } else {
                        ActivityZhuangTaiPaiXuLayout.setVisibility(View.INVISIBLE);
                        two = false;
                    }
                } else {
                    Second = false;
                    ActivityZhuangTaiPaiXuLayout.setVisibility(View.INVISIBLE);
                    if (!two) {
                        ActivityZhuangTaiPaiXuLayout.setVisibility(View.VISIBLE);
                        two = true;
                    } else {
                        ActivityZhuangTaiPaiXuLayout.setVisibility(View.INVISIBLE);
                        two = false;
                    }
                }


                break;
            case R.id.Activity_LeiBiePaiXuButton:
                JZVideoPlayerStandard.releaseAllVideos();
                if (!third) {
                    ActivityLeiBiePaiXuLayout.setVisibility(View.VISIBLE);
                    third = true;
                    if (!three) {
                        ActivityLeiBiePaiXuLayout.setVisibility(View.VISIBLE);
                        three = true;
                    } else {
                        ActivityLeiBiePaiXuLayout.setVisibility(View.INVISIBLE);
                        three = false;
                    }
                } else {
                    third = false;
                    ActivityLeiBiePaiXuLayout.setVisibility(View.INVISIBLE);
                    if (!three) {
                        ActivityLeiBiePaiXuLayout.setVisibility(View.VISIBLE);
                        three = true;
                    } else {
                        ActivityLeiBiePaiXuLayout.setVisibility(View.INVISIBLE);
                        three = false;
                    }
                }
                break;
            case R.id.Activity_RILIButton:
                JZVideoPlayerStandard.releaseAllVideos();
                break;
            case R.id.Activity_DITuButton:
                JZVideoPlayerStandard.releaseAllVideos();

                break;
            case R.id.Activity_ZUIXINText:
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                ZhiNengPaiXu = 0;
                ActivityZUIXINText.setTextColor(getResources().getColor(R.color.H2));
                ActivityZUIREText.setTextColor(getResources().getColor(R.color.H3));
                if (one) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityZhiNengPaiXuTextLayout.setVisibility(View.INVISIBLE);
                    one = false;
                }
                break;
            case R.id.Activity_ZUIREText:
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                ActivityZUIXINText.setTextColor(getResources().getColor(R.color.H3));
                ActivityZUIREText.setTextColor(getResources().getColor(R.color.H2));
                ZhiNengPaiXu = 1;
                if (one) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityZhiNengPaiXuTextLayout.setVisibility(View.INVISIBLE);
                    one = false;
                }
                break;
            case R.id.Activity_WeiKaiShiText:
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                ActivityWeiKaiShiText.setTextColor(getResources().getColor(R.color.H2));
                ActivityJinXinZhongText.setTextColor(getResources().getColor(R.color.H3));
                ActivityYiJieshuText.setTextColor(getResources().getColor(R.color.H3));
                ZhuangTaiPaiXu = 0;
                if (two) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityZhuangTaiPaiXuLayout.setVisibility(View.INVISIBLE);
                    two = false;
                }
                break;
            case R.id.Activity_JinXinZhongText:
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                ActivityWeiKaiShiText.setTextColor(getResources().getColor(R.color.H3));
                ActivityJinXinZhongText.setTextColor(getResources().getColor(R.color.H2));
                ActivityYiJieshuText.setTextColor(getResources().getColor(R.color.H3));

                ZhuangTaiPaiXu = 1;
                if (two) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityZhuangTaiPaiXuLayout.setVisibility(View.INVISIBLE);
                    two = false;
                }
                break;
            case R.id.Activity_YiJieshuText:
                ActivityWeiKaiShiText.setTextColor(getResources().getColor(R.color.H3));
                ActivityJinXinZhongText.setTextColor(getResources().getColor(R.color.H3));
                ActivityYiJieshuText.setTextColor(getResources().getColor(R.color.H2));
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                ZhuangTaiPaiXu = 2;
                if (two) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityZhuangTaiPaiXuLayout.setVisibility(View.INVISIBLE);
                    two = false;
                }
                break;

            case R.id.Activity_HuiminText:
                ActivityHuiminText.setTextColor(getResources().getColor(R.color.H2));
                ActivityYanChuText.setTextColor(getResources().getColor(R.color.H3));
                ActivitySheQuText.setTextColor(getResources().getColor(R.color.H3));
                ActivityQinZiText.setTextColor(getResources().getColor(R.color.H3));
                ActivityLiShiText.setTextColor(getResources().getColor(R.color.H3));
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                LeiBiePaiXu = 1;
                if (three) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityLeiBiePaiXuLayout.setVisibility(View.INVISIBLE);
                    three = false;
                }
                break;
            case R.id.Activity_YanChuText:
                ActivityHuiminText.setTextColor(getResources().getColor(R.color.H3));
                ActivityYanChuText.setTextColor(getResources().getColor(R.color.H2));
                ActivitySheQuText.setTextColor(getResources().getColor(R.color.H3));
                ActivityQinZiText.setTextColor(getResources().getColor(R.color.H3));
                ActivityLiShiText.setTextColor(getResources().getColor(R.color.H3));
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                LeiBiePaiXu = 2;
                if (three) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityLeiBiePaiXuLayout.setVisibility(View.INVISIBLE);
                    three = false;
                }
                break;
            case R.id.Activity_SheQuText:
                ActivityHuiminText.setTextColor(getResources().getColor(R.color.H3));
                ActivityYanChuText.setTextColor(getResources().getColor(R.color.H3));
                ActivitySheQuText.setTextColor(getResources().getColor(R.color.H2));
                ActivityQinZiText.setTextColor(getResources().getColor(R.color.H3));
                ActivityLiShiText.setTextColor(getResources().getColor(R.color.H3));
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                LeiBiePaiXu = 3;
                if (three) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityLeiBiePaiXuLayout.setVisibility(View.INVISIBLE);
                    three = false;
                }
                break;
            case R.id.Activity_QinZiText:
                ActivityHuiminText.setTextColor(getResources().getColor(R.color.H3));
                ActivityYanChuText.setTextColor(getResources().getColor(R.color.H3));
                ActivitySheQuText.setTextColor(getResources().getColor(R.color.H3));
                ActivityQinZiText.setTextColor(getResources().getColor(R.color.H2));
                ActivityLiShiText.setTextColor(getResources().getColor(R.color.H3));
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                LeiBiePaiXu = 4;
                if (three) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityLeiBiePaiXuLayout.setVisibility(View.INVISIBLE);
                    three = false;
                }
                break;
            case R.id.Activity_LiShiText:
                ActivityHuiminText.setTextColor(getResources().getColor(R.color.H3));
                ActivityYanChuText.setTextColor(getResources().getColor(R.color.H3));
                ActivitySheQuText.setTextColor(getResources().getColor(R.color.H3));
                ActivityQinZiText.setTextColor(getResources().getColor(R.color.H3));
                ActivityLiShiText.setTextColor(getResources().getColor(R.color.H2));
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityActivityRefreshLayout.setEnableAutoLoadMore(true);
                LeiBiePaiXu = 5;
                if (three) {
                    presenter.getActivityListBean(LeiBiePaiXu + "", ZhuangTaiPaiXu + "", ZhiNengPaiXu + "", Userid + "", "1", "10");
                    ActivityLeiBiePaiXuLayout.setVisibility(View.INVISIBLE);
                    three = false;
                }
                break;
        }
    }
}
