package com.sugang.wenlvhui.view.home;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.view.home.adapter.HomeVPAdapter;
import com.sugang.wenlvhui.view.home.features.FeatureOneFragment;
import com.sugang.wenlvhui.view.home.features.FeatureTwoFragment;
import com.youth.banner.Banner;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends BaseFragment {


    @BindView(R.id.HomePager_Banner)
    Banner HomePagerBanner;
    @BindView(R.id.HomePager_ViewPager)
    ViewPager HomePagerViewPager;

    ArrayList<Fragment> fragments = new ArrayList<>();
    @BindView(R.id.Featrue_One)
    View FeatrueOne;
    @BindView(R.id.Featrue_Two)
    View FeatrueTwo;


    public HomePageFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_page;


    }

    @Override
    protected void init() {
        FeatureOneFragment featureOneFragment = new FeatureOneFragment();
        FeatureTwoFragment featureTwoFragment = new FeatureTwoFragment();
        fragments.add(featureOneFragment);
        fragments.add(featureTwoFragment);
        HomeVPAdapter homeVPAdapter = new HomeVPAdapter(getActivity().getSupportFragmentManager(), fragments);
        HomePagerViewPager.setAdapter(homeVPAdapter);
        HomePagerViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if (i==0) {
                    FeatrueOne.setBackgroundColor(getResources().getColor(R.color.H2));
                    FeatrueTwo.setBackgroundColor(getResources().getColor(R.color.H1));
                }else{
                    FeatrueOne.setBackgroundColor(getResources().getColor(R.color.H1));
                    FeatrueTwo.setBackgroundColor(getResources().getColor(R.color.H2));
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


}
