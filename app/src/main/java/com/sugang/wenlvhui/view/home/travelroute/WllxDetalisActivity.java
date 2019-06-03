package com.sugang.wenlvhui.view.home.travelroute;


import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wllx.WllxDetailsContract;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxDetalisBean;
import com.sugang.wenlvhui.presenter.home.wllx.WllxDetailsPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WllxDetalisActivity extends BaseActivity<WllxDetailsPresenterImp> implements WllxDetailsContract.WllxDetailsView {


    @BindView(R.id.WllxDetalis_ReturnButton)
    AutoLinearLayout WllxDetalisReturnButton;
    @BindView(R.id.WllxDetalisHeadText)
    TextView WllxDetalisHeadText;
    @BindView(R.id.WllxDetalis_Image)
    ImageView WllxDetalisImage;
    @BindView(R.id.WllxDetalis_NameText)
    TextView WllxDetalisNameText;
    @BindView(R.id.WllxDetailsStartOne)
    ImageView WllxDetailsStartOne;
    @BindView(R.id.WllxDetailsStartTwo)
    ImageView WllxDetailsStartTwo;
    @BindView(R.id.WllxDetailsStartThree)
    ImageView WllxDetailsStartThree;
    @BindView(R.id.WllxDetailsStartFour)
    ImageView WllxDetailsStartFour;
    @BindView(R.id.WllxDetailsStartFive)
    ImageView WllxDetailsStartFive;
    @BindView(R.id.WllxDetailsKStartOne)
    ImageView WllxDetailsKStartOne;
    @BindView(R.id.WllxDetailsKStartTwo)
    ImageView WllxDetailsKStartTwo;
    @BindView(R.id.WllxDetailsKStartThree)
    ImageView WllxDetailsKStartThree;
    @BindView(R.id.WllxDetailsKStartFour)
    ImageView WllxDetailsKStartFour;
    @BindView(R.id.WllxDetailsKStartFive)
    ImageView WllxDetailsKStartFive;
    @BindView(R.id.kk)
    AutoRelativeLayout kk;
    @BindView(R.id.WllxDetailsAddressText)
    TextView WllxDetailsAddressText;
    @BindView(R.id.WllxDetails_BuyButton)
    TextView WllxDetailsBuyButton;
    @BindView(R.id.WllxDetalis_ChenRenPariceText)
    TextView WllxDetalisChenRenPariceText;
    @BindView(R.id.WllxDetalis_JiatingPariceText)
    TextView WllxDetalisJiatingPariceText;
    @BindView(R.id.WllxDetalis_ChildrenPariceText)
    TextView WllxDetalisChildrenPariceText;
    @BindView(R.id.WllxDetalisCommentNumber)
    TextView WllxDetalisCommentNumber;
    @BindView(R.id.WllxDetalisCommentRecycler)
    RecyclerView WllxDetalisCommentRecycler;
    @BindView(R.id.WllxDetalisCommentButton)
    AutoLinearLayout WllxDetalisCommentButton;
    @BindView(R.id.WllxDetali_XingchenganpaiText)
    TextView WllxDetaliXingchenganpaiText;
    @BindView(R.id.WllxDetali_FeiyongxuzhiText)
    TextView WllxDetaliFeiyongxuzhiText;
    @BindView(R.id.WllxDetali_AnquanjinshiText)
    TextView WllxDetaliAnquanjinshiText;
    private int wllx_id;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wllx_detalis;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        wllx_id = (int) SPUtils.get(WllxDetalisActivity.this, SPKey.WLLX_ID, 1);
        presenter.getWllxDetailsBean(wllx_id + "");
    }

    @Override
    public void showWllxDetailsBeanBean(WllxDetalisBean WllxDetailsBeanBean) {
        if (WllxDetailsBeanBean.getData()!=null) {
            WllxDetalisBean.DataBean data = WllxDetailsBeanBean.getData();
            WllxDetalisHeadText.setText(data.getReservedFields1());
            Glide.with(this).load(data.getImg()).error(R.mipmap.icon).into(WllxDetalisImage);
            WllxDetalisNameText.setText(data.getReservedFields1());
            if (data.getRecommend() == 1) {
                WllxDetailsStartOne.setVisibility(View.VISIBLE);
                WllxDetailsStartTwo.setVisibility(View.GONE);
                WllxDetailsStartThree.setVisibility(View.GONE);
                WllxDetailsStartFour.setVisibility(View.GONE);
                WllxDetailsStartFive.setVisibility(View.GONE);
            } else if (data.getRecommend() == 2) {
                WllxDetailsStartOne.setVisibility(View.VISIBLE);
                WllxDetailsStartTwo.setVisibility(View.VISIBLE);
                WllxDetailsStartThree.setVisibility(View.GONE);
                WllxDetailsStartFour.setVisibility(View.GONE);
                WllxDetailsStartFive.setVisibility(View.GONE);
            } else if (data.getRecommend() == 3) {
                WllxDetailsStartOne.setVisibility(View.VISIBLE);
                WllxDetailsStartTwo.setVisibility(View.VISIBLE);
                WllxDetailsStartThree.setVisibility(View.VISIBLE);
                WllxDetailsStartFour.setVisibility(View.GONE);
                WllxDetailsStartFive.setVisibility(View.GONE);
            } else if (data.getRecommend() == 4) {
                WllxDetailsStartOne.setVisibility(View.VISIBLE);
                WllxDetailsStartTwo.setVisibility(View.VISIBLE);
                WllxDetailsStartThree.setVisibility(View.VISIBLE);
                WllxDetailsStartFour.setVisibility(View.VISIBLE);
                WllxDetailsStartFive.setVisibility(View.GONE);
            } else if (data.getRecommend() == 5) {
                WllxDetailsStartOne.setVisibility(View.VISIBLE);
                WllxDetailsStartTwo.setVisibility(View.VISIBLE);
                WllxDetailsStartThree.setVisibility(View.VISIBLE);
                WllxDetailsStartFour.setVisibility(View.VISIBLE);
                WllxDetailsStartFive.setVisibility(View.VISIBLE);
            }
//            WllxDetailsAddressText.setText(data.);
            WllxDetalisChenRenPariceText.setText(data.getAdult()+"");
            WllxDetalisJiatingPariceText.setText(data.getSetMeal()+"");
            WllxDetalisChildrenPariceText.setText(data.getChildren()+"");
            WllxDetaliXingchenganpaiText.setText(data.getTripArrange());
            WllxDetaliFeiyongxuzhiText.setText(data.getFeeNotice());
            WllxDetaliAnquanjinshiText.setText(data.getSecurityTip());
        }

    }

    @Override
    public void showError(String string) {

    }



    @OnClick({R.id.WllxDetalis_ReturnButton, R.id.WllxDetails_BuyButton, R.id.WllxDetalisCommentButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.WllxDetalis_ReturnButton:
                finish();
                break;
            case R.id.WllxDetails_BuyButton:
                break;
            case R.id.WllxDetalisCommentButton:
                break;
        }
    }
}
