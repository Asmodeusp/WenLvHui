package com.sugang.wenlvhui.view.home.culturaltravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//文旅政策
public class CulturalTravelPolicyActivity extends BaseActivity {
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

    @Override
    protected int getLayoutId() {
        return R.layout.activity_cultural_travel_policy;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }



    @OnClick({R.id.CulturalTravelPolicy_ReturnButton, R.id.CulturalTravelPolicy_HeadImage, R.id.CulturalTravelPolicy_SerchEd, R.id.CulturalTravelPolicy_XiangMuGongGaoMoreButton, R.id.CulturalTravelPolicy_ZiXunDongTaiMoreButton, R.id.CulturalTravelPolicy_ZhenCeJieDuRMoreButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.CulturalTravelPolicy_ReturnButton:
                finish();
                break;
            case R.id.CulturalTravelPolicy_HeadImage:
                break;
            case R.id.CulturalTravelPolicy_SerchEd:
                startActivity(new Intent(this,SerchActivity.class));
                break;
            case R.id.CulturalTravelPolicy_XiangMuGongGaoMoreButton:
                startActivity(new Intent(this,XiangmugonggaoListActivity.class));
                break;
            case R.id.CulturalTravelPolicy_ZiXunDongTaiMoreButton:
                startActivity(new Intent(this,ZixundongtailistActivity.class));
                break;
            case R.id.CulturalTravelPolicy_ZhenCeJieDuRMoreButton:
                startActivity(new Intent(this,ZhengcejiedulistActivity.class));
                break;
        }
    }
}
