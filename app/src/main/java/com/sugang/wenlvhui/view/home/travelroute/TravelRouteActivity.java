package com.sugang.wenlvhui.view.home.travelroute;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.view.home.adapter.HomeVPAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

//文旅路线
public class TravelRouteActivity extends BaseActivity {


    @BindView(R.id.TravelRouteReturnButton)
    AutoLinearLayout TravelRouteReturnButton;
    @BindView(R.id.TravelRouteShaiXuanButton)
    AutoLinearLayout TravelRouteShaiXuanButton;
    @BindView(R.id.TravelRoute_SerchEd)
    TextView TravelRouteSerchEd;
    @BindView(R.id.TravelRoute_FirstImage)
    ImageView TravelRouteFirstImage;
    @BindView(R.id.TravelRoute_Viewpager)
    ViewPager TravelRouteViewpager;
    @BindView(R.id.Line_One)
    View LineOne;
    @BindView(R.id.Line_Two)
    View LineTwo;
    @BindView(R.id.TravelRoute_JINPINRecy)
    RecyclerView TravelRouteJINPINRecy;
     ArrayList<Fragment> fragments =new ArrayList<>();
    @Override
    protected int getLayoutId() {
        return R.layout.activity_travel_route;
    }

    @Override
    protected void init() {
        TravelrouteFirstFragment featureOneFragment = new TravelrouteFirstFragment();
        TravelrouteSecondFragment featureTwoFragment = new TravelrouteSecondFragment();
        fragments.add(featureOneFragment);
        fragments.add(featureTwoFragment);
        HomeVPAdapter homeVPAdapter = new HomeVPAdapter(this.getSupportFragmentManager(), fragments);
        TravelRouteViewpager.setAdapter(homeVPAdapter);
        TravelRouteViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if (i==0) {
                    LineOne.setBackgroundColor(getResources().getColor(R.color.H2));
                    LineTwo.setBackgroundColor(getResources().getColor(R.color.H1));
                }else{
                    LineOne.setBackgroundColor(getResources().getColor(R.color.H1));
                    LineTwo.setBackgroundColor(getResources().getColor(R.color.H2));
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



    @OnClick({R.id.TravelRouteReturnButton, R.id.TravelRouteShaiXuanButton, R.id.TravelRoute_SerchEd, R.id.TravelRoute_FirstImage})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.TravelRouteReturnButton:
                finish();
                break;
            case R.id.TravelRouteShaiXuanButton:
                break;
            case R.id.TravelRoute_SerchEd:
                break;
            case R.id.TravelRoute_FirstImage:
                break;
        }
    }
}
