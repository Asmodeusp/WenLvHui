package com.sugang.wenlvhui.view.home.intangiblecultural;


import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.youth.banner.Banner;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShouyiDetailActivity extends BaseActivity {


    @BindView(R.id.ShouyiDetail_ReturnButton)
    AutoLinearLayout ShouyiDetailReturnButton;
    @BindView(R.id.ShouyiDetail_ShareButton)
    AutoLinearLayout ShouyiDetailShareButton;
    @BindView(R.id.ShouyiDetailFlyBanner)
    Banner ShouyiDetailFlyBanner;
    @BindView(R.id.ShouyiDetail_ProductNameText)
    TextView ShouyiDetailProductNameText;
    @BindView(R.id.ShouyiDetail_Parice)
    TextView ShouyiDetailParice;
    @BindView(R.id.ShouyiDetail_YuanParice)
    TextView ShouyiDetailYuanParice;
    @BindView(R.id.ShouyiDetail_CommentText)
    TextView ShouyiDetailCommentText;
    @BindView(R.id.ShouyiDetail_ShopImage)
    ImageView ShouyiDetailShopImage;
    @BindView(R.id.ShouyiDetail_shopName)
    TextView ShouyiDetailShopName;
    @BindView(R.id.ShouyiDetail_goShopPageButton)
    TextView ShouyiDetailGoShopPageButton;
    @BindView(R.id.ShouyiDetail_ShopRecy)
    RecyclerView ShouyiDetailShopRecy;
    @BindView(R.id.ShouyiDetail_CollectionImage)
    ImageView ShouyiDetailCollectionImage;
    @BindView(R.id.ShouyiDetail_CollectionButton)
    AutoLinearLayout ShouyiDetailCollectionButton;
    @BindView(R.id.ShouyiDetail_JionShopingCarButton)
    AutoLinearLayout ShouyiDetailJionShopingCarButton;
    @BindView(R.id.ShouyiDetail_LiJiGouMaiButton)
    AutoLinearLayout ShouyiDetailLiJiGouMaiButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_shouyi_detail;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }




    @OnClick({R.id.ShouyiDetail_ReturnButton, R.id.ShouyiDetail_ShareButton, R.id.ShouyiDetail_CommentText, R.id.ShouyiDetail_goShopPageButton, R.id.ShouyiDetail_CollectionButton, R.id.ShouyiDetail_JionShopingCarButton, R.id.ShouyiDetail_LiJiGouMaiButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ShouyiDetail_ReturnButton:
                finish();
                break;
            case R.id.ShouyiDetail_ShareButton:
                break;
            case R.id.ShouyiDetail_CommentText:
                break;
            case R.id.ShouyiDetail_goShopPageButton:
                break;
            case R.id.ShouyiDetail_CollectionButton:
                break;
            case R.id.ShouyiDetail_JionShopingCarButton:
                break;
            case R.id.ShouyiDetail_LiJiGouMaiButton:
                break;
        }
    }
}
