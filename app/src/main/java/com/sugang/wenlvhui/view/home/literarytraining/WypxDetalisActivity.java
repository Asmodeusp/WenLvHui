package com.sugang.wenlvhui.view.home.literarytraining;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wypx.WypxDetalisContract;
import com.sugang.wenlvhui.model.bean.ImgsBean;
import com.sugang.wenlvhui.model.bean.VideosBean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxDetalisBean;
import com.sugang.wenlvhui.presenter.home.wypx.WypxDetalisPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.jzvd.JZVideoPlayerStandard;

public class WypxDetalisActivity extends BaseActivity<WypxDetalisPresenterImp> implements WypxDetalisContract.WypxDetalisView {
    @BindView(R.id.WypxDetalis_ReturnButton)
    AutoLinearLayout WypxDetalisReturnButton;
    @BindView(R.id.WypxDetalis_NameText)
    TextView WypxDetalisNameText;
    @BindView(R.id.WypxDetalis_BackgroundImage)
    ImageView WypxDetalisBackgroundImage;
    @BindView(R.id.WypxDetalis_JieshaoButton)
    AutoRelativeLayout WypxDetalisJieshaoButton;
    @BindView(R.id.WypxDetalis_ZhaoPianButton)
    AutoRelativeLayout WypxDetalisZhaoPianButton;
    @BindView(R.id.WypxDetalis_ShiPinButton)
    AutoRelativeLayout WypxDetalisShiPinButton;
    @BindView(R.id.WypxDetalis_PhoneNumberText)
    TextView WypxDetalisPhoneNumberText;
    @BindView(R.id.WypxDetalis_SeePhoneNumberButton)
    TextView WypxDetalisSeePhoneNumberButton;
    @BindView(R.id.WypxDetalis_AddressText)
    TextView WypxDetalisAddressText;
    @BindView(R.id.WypxDetalis_ViewPager)
    FrameLayout WypxDetalisViewPager;
    @BindView(R.id.WypxDetalis_HeadImage)
    ImageView WypxDetalisHeadImage;
    public List<ImgsBean> imgs
            = new ArrayList<>();
    public List<VideosBean> video = new ArrayList<>();
    public String details;

    public String getDetails() {
        return details;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wypx_detalis;
    }

    @Override
    protected void init() {
        SPUtils.put(this,"HQ","WypxDetalisActivity");
        WypxDetalisJieshaoButton.setBackgroundColor(getResources().getColor(R.color.H9));
        WypxDetalisZhaoPianButton.setBackgroundColor(getResources().getColor(R.color.H11));
        WypxDetalisShiPinButton.setBackgroundColor(getResources().getColor(R.color.H11));
        setContentView(R.id.WypxDetalis_ViewPager, WypxJieshaoFragment.class);
        JZVideoPlayerStandard.releaseAllVideos();
    }

    @Override
    protected void loadDate() {
        presenter.getWypxDetalisBeanData((int) SPUtils.get(this, SPKey.SCHOOL_ID, 0) + "");
    }

    @OnClick({R.id.WypxDetalis_ReturnButton, R.id.WypxDetalis_JieshaoButton, R.id.WypxDetalis_ZhaoPianButton, R.id.WypxDetalis_ShiPinButton, R.id.WypxDetalis_SeePhoneNumberButton})
    public void onViewClicked(View view) {

        switch (view.getId()) {
            case R.id.WypxDetalis_ReturnButton:
                JZVideoPlayerStandard.releaseAllVideos();
                finish();
                break;
            case R.id.WypxDetalis_JieshaoButton:
                JZVideoPlayerStandard.releaseAllVideos();
                WypxDetalisJieshaoButton.setBackgroundColor(getResources().getColor(R.color.H9));
                WypxDetalisZhaoPianButton.setBackgroundColor(getResources().getColor(R.color.H11));
                WypxDetalisShiPinButton.setBackgroundColor(getResources().getColor(R.color.H11));
                setContentView(R.id.WypxDetalis_ViewPager, WypxJieshaoFragment.class);
                break;
            case R.id.WypxDetalis_ZhaoPianButton:
                JZVideoPlayerStandard.releaseAllVideos();
                WypxDetalisJieshaoButton.setBackgroundColor(getResources().getColor(R.color.H11));
                WypxDetalisZhaoPianButton.setBackgroundColor(getResources().getColor(R.color.H9));
                WypxDetalisShiPinButton.setBackgroundColor(getResources().getColor(R.color.H11));
                setContentView(R.id.WypxDetalis_ViewPager, WypxZhaopianFragment.class);
                break;

            case R.id.WypxDetalis_ShiPinButton:
                WypxDetalisJieshaoButton.setBackgroundColor(getResources().getColor(R.color.H11));
                WypxDetalisZhaoPianButton.setBackgroundColor(getResources().getColor(R.color.H11));
                WypxDetalisShiPinButton.setBackgroundColor(getResources().getColor(R.color.H9));
                setContentView(R.id.WypxDetalis_ViewPager, WypxShipinFragment.class);
                break;
            case R.id.WypxDetalis_SeePhoneNumberButton:

                break;
        }
    }

    @Override
    public void showWypxDetalisBean(WypxDetalisBean WypxDetalisBean) {
        if (WypxDetalisBean.getData() != null) {
            WypxDetalisBean.DataBean data = WypxDetalisBean.getData();
            WypxDetalisNameText.setText(data.getName());
            Glide.with(this).load(data.getBackImg()).error(R.mipmap.icon).into(WypxDetalisBackgroundImage);
            WypxDetalisAddressText.setText(data.getAddress());
            String phone = data.getPhone();
            if (phone.length() == 11) {
                String maskNumber = phone.substring(0, 3) + "****" + phone.substring(7, phone.length());
                WypxDetalisPhoneNumberText.setText(maskNumber);

            }
            Glide.with(this).load(data.getLogourl()).error(R.mipmap.icon).into(WypxDetalisHeadImage);
            SPUtils.put(this, SPKey.SCHOOL_DEATLIS, data.getDetails());
            imgs.addAll(data.getImgs());
            video.addAll(data.getVideos());
          }
    }

    @Override
    public void showError(String string) {

    }

}
