package com.sugang.wenlvhui.view.home;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

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

    }

    @Override
    protected void loadDate() {


    }


}
