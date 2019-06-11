package com.sugang.wenlvhui.view.circle;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.cirle.CirclePageContract;
import com.sugang.wenlvhui.model.bean.circle.CircleCNXHBean;
import com.sugang.wenlvhui.presenter.circle.CirclePagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.adaptr.CardAdapter;
import com.sugang.wenlvhui.view.adaptr.CirlceCNXHAdapter;
import com.sugang.wenlvhui.view.ui.CardScaleHelper;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CircleFragment extends BaseFragment<CirclePagePresenterImp> implements CirclePageContract.CirclePageView {


    @BindView(R.id.Circle_PublishButton)
    AutoLinearLayout CirclePublishButton;
    @BindView(R.id.Circle_MyCirleButton)
    AutoLinearLayout CircleMyCirleButton;
    @BindView(R.id.Circle_MyFollowButton)
    AutoLinearLayout CircleMyFollowButton;
    @BindView(R.id.Circle_SearchEdText)
    TextView CircleSearchEdText;
    @BindView(R.id.Circle_CaiNiXiHuanRefreshButton)
    ImageView CircleCaiNiXiHuanRefreshButton;
    @BindView(R.id.Circle_CaiNiXiHuanMoreButton)
    ImageView CircleCaiNiXiHuanMoreButton;
    @BindView(R.id.Circle_CaiNiXiHuanRecyclerView)
    RecyclerView CircleCaiNiXiHuanRecyclerView;
    int page = 1;
    @BindView(R.id.quanziimage)
    CircleImageView quanziimage;
    @BindView(R.id.guanzhuimage)
    CircleImageView guanzhuimage;
    Unbinder unbinder;
    @BindView(R.id.quanzi)
    RecyclerView quanzi;
    private CardScaleHelper mCardScaleHelper = null;
    private Runnable mBlurRunnable;
    private int mLastPos = -1;
    public CircleFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_circle;
    }

    @Override
    protected void init() {
        Glide.with(getActivity()).load("http://img3.duitang.com/uploads/item/201605/07/20160507191419_J2m8R.thumb.700_0.jpeg").into(quanziimage);
        Glide.with(getActivity()).load("http://img3.imgtn.bdimg.com/it/u=3638646766,1109984103&fm=26&gp=0.jpg").into(guanzhuimage);
    }

    @Override
    protected void loadDate() {
        int userId = (int) SPUtils.get(getActivity(), SPKey.USER_ID, 0);
        presenter.getCircleCNXHBean(userId + "", page + "");
    }

    @OnClick({R.id.Circle_PublishButton, R.id.Circle_MyCirleButton, R.id.Circle_MyFollowButton, R.id.Circle_CaiNiXiHuanRefreshButton, R.id.Circle_CaiNiXiHuanMoreButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Circle_PublishButton:
                break;
            case R.id.Circle_MyCirleButton:
                startActivity(new Intent(getActivity(),MyCircleActivity.class));
                break;
            case R.id.Circle_MyFollowButton:
                startActivity(new Intent(getActivity(),MyFollowActivity.class));
                break;
            case R.id.Circle_CaiNiXiHuanRefreshButton:
                break;
            case R.id.Circle_CaiNiXiHuanMoreButton:
                startActivity(new Intent(getActivity(),MoreCirleActivity.class));
                break;
        }
    }

    @Override
    public void showCirclePageBean(CircleCNXHBean circleCNXHBean) {
        if (circleCNXHBean.getData() != null) {
            List<CircleCNXHBean.DataBean.PolicyListBean> policy_list = circleCNXHBean.getData().getPolicy_list();
            List<CircleCNXHBean.DataBean.PolicyListBean> CNXH =new ArrayList<>();
            List<CircleCNXHBean.DataBean.PolicyListBean> quanzibean =new ArrayList<>();
            for (int i = 0; i < policy_list.size(); i++) {
                if (i<=5) {
                    CNXH.add(policy_list.get(i));
                }else{
                    quanzibean.add(policy_list.get(i));
                }
            }
            final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
            quanzi.setLayoutManager(linearLayoutManager);
            quanzi.setAdapter(new CardAdapter(quanzibean));
            // mRecyclerView绑定scale效果
            mCardScaleHelper = new CardScaleHelper();
            mCardScaleHelper.setCurrentItemPos(1);
            mCardScaleHelper.attachToRecyclerView(quanzi);
            CircleCaiNiXiHuanRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
            CirlceCNXHAdapter cirlceCNXHAdapter = new CirlceCNXHAdapter(CNXH);
            CircleCaiNiXiHuanRecyclerView.setAdapter(cirlceCNXHAdapter);

        }

    }

    @Override
    public void showError(String string) {

    }


}
