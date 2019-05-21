package com.sugang.wenlvhui.view.home.literarytraining;


import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class WypxDetalisActivity extends BaseActivity {
    @BindView(R.id.WypxDetalis_ReturnButton)
    AutoLinearLayout WypxDetalisReturnButton;
    @BindView(R.id.WypxDetalis_NameText)
    TextView WypxDetalisNameText;
    @BindView(R.id.WypxDetalis_BackgroundImage)
    ImageView WypxDetalisBackgroundImage;
    @BindView(R.id.WypxDetalis_JieshaoButton)
    AutoLinearLayout WypxDetalisJieshaoButton;
    @BindView(R.id.WypxDetalis_ZhaoPianButton)
    AutoLinearLayout WypxDetalisZhaoPianButton;
    @BindView(R.id.WypxDetalis_ShiPinButton)
    AutoLinearLayout WypxDetalisShiPinButton;
    @BindView(R.id.WypxDetalis_PhoneNumberText)
    TextView WypxDetalisPhoneNumberText;
    @BindView(R.id.WypxDetalis_SeePhoneNumberButton)
    TextView WypxDetalisSeePhoneNumberButton;
    @BindView(R.id.WypxDetalis_AddressText)
    TextView WypxDetalisAddressText;
    @BindView(R.id.WypxDetalis_ViewPager)
    ViewPager WypxDetalisViewPager;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wypx_detalis;
    }

    @Override
    protected void init() {
        setContentView(R.id.WypxDetalis_ViewPager,WypxJieshaoFragment.class);
    }

    @Override
    protected void loadDate() {

    }



    @OnClick({R.id.WypxDetalis_ReturnButton, R.id.WypxDetalis_JieshaoButton, R.id.WypxDetalis_ZhaoPianButton, R.id.WypxDetalis_ShiPinButton, R.id.WypxDetalis_SeePhoneNumberButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.WypxDetalis_ReturnButton:
                finish();
                break;
            case R.id.WypxDetalis_JieshaoButton:
                setContentView(R.id.WypxDetalis_ViewPager,WypxJieshaoFragment.class);
                break;
            case R.id.WypxDetalis_ZhaoPianButton:
                setContentView(R.id.WypxDetalis_ViewPager,WypxZhaopianFragment.class);
                break;
            case R.id.WypxDetalis_ShiPinButton:
                setContentView(R.id.WypxDetalis_ViewPager,WypxShipinFragment.class);
                break;
            case R.id.WypxDetalis_SeePhoneNumberButton:

                break;
        }
    }
}
