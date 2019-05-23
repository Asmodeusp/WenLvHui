package com.sugang.wenlvhui.view.home.literarybrigadelist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.view.home.adapter.HomeVPAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//文旅榜单
public class LiteraryBrigadeListActivity extends BaseActivity {

    @BindView(R.id.LiteraryBrigadeList_ReturnButton)
    AutoLinearLayout LiteraryBrigadeListReturnButton;
    @BindView(R.id.WLBD_WYText)
    TextView WLBDWYText;
    @BindView(R.id.WLBD_WYButton)
    AutoLinearLayout WLBDWYButton;
    @BindView(R.id.WLBD_MSText)
    TextView WLBDMSText;
    @BindView(R.id.WLBD_MSButton)
    AutoLinearLayout WLBDMSButton;
    @BindView(R.id.WLBD_GCText)
    TextView WLBDGCText;
    @BindView(R.id.WLBD_GCButton)
    AutoLinearLayout WLBDGCButton;
    @BindView(R.id.WLBD_RQText)
    TextView WLBDRQText;
    @BindView(R.id.WLBD_RQButton)
    AutoLinearLayout WLBDRQButton;
    @BindView(R.id.WLBD_HSText)
    TextView WLBDHSText;
    @BindView(R.id.WLBD_HSButton)
    AutoLinearLayout WLBDHSButton;
    @BindView(R.id.WLBD_LXText)
    TextView WLBDLXText;
    @BindView(R.id.WLBD_LXButton)
    AutoLinearLayout WLBDLXButton;
    @BindView(R.id.WLBD_viewpager)
    ViewPager WLBDViewpager;
    ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_literary_brigade_list;
    }

    @Override
    protected void init() {
        fragments.add(new WLBD_GCFragment());
        fragments.add(new WLBD_HsFragment());
        fragments.add(new WLBD_LXFragment());
        fragments.add(new WLBD_MsFragment());
        fragments.add(new WLBD_RQFragment());
        fragments.add(new WLBD_WYFragment());
        WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H2));
        WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
        WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
        WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
        WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
        WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
        WLBDWYText.setTextColor(getResources().getColor(R.color.H8));
        WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
        WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
        WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
        WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
        WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
        HomeVPAdapter homeVPAdapter = new HomeVPAdapter(getSupportFragmentManager(), fragments);
        WLBDViewpager.setAdapter(homeVPAdapter);
        WLBDViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if (i == 0) {
                    WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H2));
                    WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDWYText.setTextColor(getResources().getColor(R.color.H8));
                    WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                } else if (i == 1) {
                    WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H2));
                    WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDMSText.setTextColor(getResources().getColor(R.color.H8));
                    WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                } else if (i == 2) {
                    WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H2));
                    WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDGCText.setTextColor(getResources().getColor(R.color.H8));
                    WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                } else if (i == 3) {
                    WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H2));
                    WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDRQText.setTextColor(getResources().getColor(R.color.H8));
                    WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                } else if (i == 4) {
                    WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H2));
                    WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDHSText.setTextColor(getResources().getColor(R.color.H8));
                    WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                } else if (i == 5) {
                    WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                    WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H2));
                    WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                    WLBDLXText.setTextColor(getResources().getColor(R.color.H8));
                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.LiteraryBrigadeList_ReturnButton, R.id.WLBD_WYButton, R.id.WLBD_MSButton, R.id.WLBD_GCButton, R.id.WLBD_RQButton, R.id.WLBD_HSButton, R.id.WLBD_LXButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.LiteraryBrigadeList_ReturnButton:
                finish();
                break;
            case R.id.WLBD_WYButton:
                WLBDViewpager.setCurrentItem(0);
                WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H2));
                WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDWYText.setTextColor(getResources().getColor(R.color.H8));
                WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                break;
            case R.id.WLBD_MSButton:
                WLBDViewpager.setCurrentItem(1);
                WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H2));
                WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                WLBDMSText.setTextColor(getResources().getColor(R.color.H8));
                WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                break;
            case R.id.WLBD_GCButton:
                WLBDViewpager.setCurrentItem(2);
                WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H2));
                WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDGCText.setTextColor(getResources().getColor(R.color.H8));
                WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                break;
            case R.id.WLBD_RQButton:
                WLBDViewpager.setCurrentItem(3);
                WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H2));
                WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                WLBDRQText.setTextColor(getResources().getColor(R.color.H8));
                WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                break;
            case R.id.WLBD_HSButton:
                WLBDViewpager.setCurrentItem(4);
                WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H2));
                WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                WLBDHSText.setTextColor(getResources().getColor(R.color.H8));
                WLBDLXText.setTextColor(getResources().getColor(R.color.H5));
                break;
            case R.id.WLBD_LXButton:
                WLBDViewpager.setCurrentItem(5);
                WLBDWYButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDMSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDGCButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDRQButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDHSButton.setBackgroundColor(getResources().getColor(R.color.H8));
                WLBDLXButton.setBackgroundColor(getResources().getColor(R.color.H2));
                WLBDWYText.setTextColor(getResources().getColor(R.color.H5));
                WLBDMSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDGCText.setTextColor(getResources().getColor(R.color.H5));
                WLBDRQText.setTextColor(getResources().getColor(R.color.H5));
                WLBDHSText.setTextColor(getResources().getColor(R.color.H5));
                WLBDLXText.setTextColor(getResources().getColor(R.color.H8));
                break;
        }
    }
}
