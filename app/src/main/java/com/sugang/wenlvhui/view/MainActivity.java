package com.sugang.wenlvhui.view;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.scwang.smartrefresh.header.waterdrop.Circle;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.view.activity.ActivityFragment;
import com.sugang.wenlvhui.view.circle.CircleFragment;
import com.sugang.wenlvhui.view.home.HomePageFragment;
import com.sugang.wenlvhui.view.myself.MyselfFragment;
import com.sugang.wenlvhui.view.space.SpaceFragment;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.Container)
    AutoFrameLayout Container;
    @BindView(R.id.HomeButton)
    AutoLinearLayout HomeButton;
    @BindView(R.id.SpaceButton)
    AutoLinearLayout SpaceButton;
    @BindView(R.id.ActivityButton)
    AutoLinearLayout ActivityButton;
    @BindView(R.id.CircleButton)
    AutoLinearLayout CircleButton;
    @BindView(R.id.MyselfButton)
    AutoLinearLayout MyselfButton;
    @BindView(R.id.HomeImageView)
    ImageView HomeImageView;
    @BindView(R.id.HomeText)
    TextView HomeText;
    @BindView(R.id.SpaceImageView)
    ImageView SpaceImageView;
    @BindView(R.id.SpaceText)
    TextView SpaceText;
    @BindView(R.id.ActivityImageView)
    ImageView ActivityImageView;
    @BindView(R.id.ActivityText)
    TextView ActivityText;
    @BindView(R.id.CircleImageView)
    ImageView CircleImageView;
    @BindView(R.id.CircleText)
    TextView CircleText;
    @BindView(R.id.MyselfImageView)
    ImageView MyselfImageView;
    @BindView(R.id.MyselfText)
    TextView MyselfText;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        setContentView(R.id.Container, HomePageFragment.class);
        setSpaceTextAndImage(R.color.H1, R.color.H1, R.color.H1, R.color.H1,R.color.H2, R.mipmap.myself, R.mipmap.circle, R.mipmap.space, R.mipmap.activity,R.mipmap.home_pass);
    }

    @Override
    protected void loadDate() {

    }

    @OnClick({R.id.HomeButton, R.id.SpaceButton, R.id.ActivityButton, R.id.CircleButton, R.id.MyselfButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.HomeButton:
                setContentView(R.id.Container, HomePageFragment.class);
                setSpaceTextAndImage(R.color.H1, R.color.H1, R.color.H1, R.color.H1,R.color.H2, R.mipmap.myself, R.mipmap.circle, R.mipmap.space, R.mipmap.activity,R.mipmap.home_pass);
                break;
            case R.id.SpaceButton:
                setContentView(R.id.Container, SpaceFragment.class);
                setSpaceTextAndImage(R.color.H2, R.color.H1, R.color.H1, R.color.H1,R.color.H1, R.mipmap.myself, R.mipmap.circle, R.mipmap.space_pass, R.mipmap.activity,R.mipmap.home);
                break;
            case R.id.ActivityButton:
                setContentView(R.id.Container, ActivityFragment.class);
                setSpaceTextAndImage(R.color.H1, R.color.H1, R.color.H1, R.color.H2,R.color.H1, R.mipmap.myself, R.mipmap.circle, R.mipmap.space, R.mipmap.activity_pass,R.mipmap.home);
                break;
            case R.id.CircleButton:
                setContentView(R.id.Container, CircleFragment.class);
                setSpaceTextAndImage(R.color.H1, R.color.H1, R.color.H2, R.color.H1, R.color.H1, R.mipmap.myself, R.mipmap.circle_pass, R.mipmap.space, R.mipmap.activity,R.mipmap.home);
                break;
            case R.id.MyselfButton:
                setContentView(R.id.Container, MyselfFragment.class);
                setSpaceTextAndImage(R.color.H1, R.color.H2, R.color.H1, R.color.H1,R.color.H1, R.mipmap.myself_pass, R.mipmap.circle, R.mipmap.space, R.mipmap.activity,R.mipmap.home);
                break;
        }
    }

    private void setSpaceTextAndImage(int SpaceTextColor, int MyselfTextColor, int CircleTextcolor, int ActivityTextcolor,int HomeTextColor, int MyselfImageViewResources, int CircleImageViewResources, int SpaceImageViewResources, int ActivityImageViewResources ,int HomeImageViewResources) {
        SpaceText.setTextColor(getResources().getColor(SpaceTextColor));
        HomeText.setTextColor(getResources().getColor(HomeTextColor));
        MyselfText.setTextColor(getResources().getColor(MyselfTextColor));
        CircleText.setTextColor(getResources().getColor(CircleTextcolor));
        ActivityText.setTextColor(getResources().getColor(ActivityTextcolor));
        MyselfImageView.setImageResource(MyselfImageViewResources);
        CircleImageView.setImageResource(CircleImageViewResources);
        SpaceImageView.setImageResource(SpaceImageViewResources);
        HomeImageView.setImageResource(HomeImageViewResources);
        ActivityImageView.setImageResource(ActivityImageViewResources);
    }





}
