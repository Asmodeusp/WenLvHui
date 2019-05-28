package com.sugang.wenlvhui.view.home.culturaltravel;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wlze.WlzePageContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.Wenlvzhengcebean;
import com.sugang.wenlvhui.presenter.home.wlzc.WlzePagePresenter;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter;
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zcjdRecyAdapter;
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zxdtRecyAdapter;
import com.zhy.autolayout.AutoLinearLayout;


import java.util.List;
import butterknife.BindView;
import butterknife.OnClick;

//文旅政策
public class CulturalTravelPolicyActivity extends BaseActivity<WlzePagePresenter> implements WlzePageContract.WlzePageView {
    //返回
    @BindView(R.id.CulturalTravelPolicy_ReturnButton)
    AutoLinearLayout CulturalTravelPolicyReturnButton;
    //头部照片
    @BindView(R.id.CulturalTravelPolicy_HeadImage)
    ImageView CulturalTravelPolicyHeadImage;
    //搜索框
    @BindView(R.id.CulturalTravelPolicy_SerchEd)
    TextView CulturalTravelPolicySerchEd;
    //项目公告更多
    @BindView(R.id.CulturalTravelPolicy_XiangMuGongGaoMoreButton)
    ImageView CulturalTravelPolicyXiangMuGongGaoMoreButton;
    //项目公告Recycler
    @BindView(R.id.CulturalTravelPolicy_XiangMuGongGaoRecycler)
    RecyclerView CulturalTravelPolicyXiangMuGongGaoRecycler;
    //资讯动态更多
    @BindView(R.id.CulturalTravelPolicy_ZiXunDongTaiMoreButton)
    ImageView CulturalTravelPolicyZiXunDongTaiMoreButton;
    //咨询动态Recycler
    @BindView(R.id.CulturalTravelPolicy_ZiXunDongTaiRecycler)
    RecyclerView CulturalTravelPolicyZiXunDongTaiRecycler;
    //政策解读更多
    @BindView(R.id.CulturalTravelPolicy_ZhenCeJieDuRMoreButton)
    ImageView CulturalTravelPolicyZhenCeJieDuRMoreButton;
    //政策解读Recycler
    @BindView(R.id.CulturalTravelPolicy_ZhenCeJieDuRecycler)
    RecyclerView CulturalTravelPolicyZhenCeJieDuRecycler;
    private int id;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_cultural_travel_policy;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        id = (int) SPUtils.get(this, SPKey.USER_ID, 0);
        presenter.getWenlvzhengcebeanData(id+"");

    }


    @OnClick({R.id.CulturalTravelPolicy_ReturnButton, R.id.CulturalTravelPolicy_HeadImage, R.id.CulturalTravelPolicy_SerchEd, R.id.CulturalTravelPolicy_XiangMuGongGaoMoreButton, R.id.CulturalTravelPolicy_ZiXunDongTaiMoreButton, R.id.CulturalTravelPolicy_ZhenCeJieDuRMoreButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.CulturalTravelPolicy_ReturnButton:
                finish();
                break;
            case R.id.CulturalTravelPolicy_HeadImage:
                SPUtils.put(CulturalTravelPolicyActivity.this, SPKey.NEWS_ID,id);
                startActivity(new Intent(CulturalTravelPolicyActivity.this,NewsDetailsActivity.class));
                break;
            case R.id.CulturalTravelPolicy_SerchEd:
                startActivity(new Intent(this, SerchActivity.class));
                break;
            case R.id.CulturalTravelPolicy_XiangMuGongGaoMoreButton:
                startActivity(new Intent(this, XiangmugonggaoListActivity.class));
                break;
            case R.id.CulturalTravelPolicy_ZiXunDongTaiMoreButton:
                startActivity(new Intent(this, ZixundongtailistActivity.class));
                break;
            case R.id.CulturalTravelPolicy_ZhenCeJieDuRMoreButton:
                startActivity(new Intent(this, ZhengcejiedulistActivity.class));
                break;
        }
    }

    @Override
    public void showWenlvzhengcebean(final Wenlvzhengcebean wenlvzhengcebean) {

        if (wenlvzhengcebean.getData()!=null) {
            Glide.with(this).load(wenlvzhengcebean.getData().getFirst().getImage()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(CulturalTravelPolicyHeadImage);
            id = wenlvzhengcebean.getData().getFirst().getId();
            //项目公告
            CulturalTravelPolicyXiangMuGongGaoRecycler.setLayoutManager(new LinearLayoutManager(this));
            final List<NewsBean> peoject = wenlvzhengcebean.getData().getProject();
            CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter adapter = new CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter(peoject,presenter);
            adapter.setRecyclerViewOnCLickListener(new CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter.RecyclerViewOnCLickListener() {

                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(CulturalTravelPolicyActivity.this, SPKey.NEWS_TYPE,"项目公告");
                    SPUtils.put(CulturalTravelPolicyActivity.this, SPKey.NEWS_ID,peoject.get(position).getId());
                    startActivity(new Intent(CulturalTravelPolicyActivity.this,NewsDetailsActivity.class));
                }
            });
            CulturalTravelPolicyXiangMuGongGaoRecycler.setAdapter(adapter);
            //资讯动态
            CulturalTravelPolicyZiXunDongTaiRecycler.setLayoutManager(new LinearLayoutManager(this));
            final List<NewsBean> zixun = wenlvzhengcebean.getData().getConsul();
            Wlzc_zxdtRecyAdapter wlzc_zxdtRecyAdapter = new Wlzc_zxdtRecyAdapter(zixun,presenter);
            wlzc_zxdtRecyAdapter.setRecyclerViewOnCLickListener(new Wlzc_zxdtRecyAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(CulturalTravelPolicyActivity.this, SPKey.NEWS_TYPE,"资讯动态");
                    SPUtils.put(CulturalTravelPolicyActivity.this, SPKey.NEWS_ID,zixun.get(position).getId());
                    startActivity(new Intent(CulturalTravelPolicyActivity.this,NewsDetailsActivity.class));
                }
            });
            CulturalTravelPolicyZiXunDongTaiRecycler.setAdapter(wlzc_zxdtRecyAdapter);
            //政策解读
            CulturalTravelPolicyZhenCeJieDuRecycler.setLayoutManager(new LinearLayoutManager(this));
            final List<NewsBean> zhengce = wenlvzhengcebean.getData().getPolicy();
            Wlzc_zcjdRecyAdapter wlzc_zcjdRecyAdapter = new Wlzc_zcjdRecyAdapter(zhengce,presenter);
            wlzc_zcjdRecyAdapter.setRecyclerViewOnCLickListener(new Wlzc_zcjdRecyAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(CulturalTravelPolicyActivity.this, SPKey.NEWS_TYPE,"政策解读");
                    SPUtils.put(CulturalTravelPolicyActivity.this, SPKey.NEWS_ID,zhengce.get(position).getId());
                    startActivity(new Intent(CulturalTravelPolicyActivity.this,NewsDetailsActivity.class));
                }
            });
            CulturalTravelPolicyZhenCeJieDuRecycler.setAdapter(wlzc_zcjdRecyAdapter);
        }else{
            Toast.makeText(this, wenlvzhengcebean.getMsg(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void ShowiSlike(IsLikeBean isLikeBean) {

    }

    @Override
    public void showError(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();

    }
}
