package com.sugang.wenlvhui.view.home;


import android.support.v4.app.Fragment;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.youth.banner.Banner;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends BaseFragment {


    @BindView(R.id.HomePager_Banner)
    Banner HomePagerBanner;


    public HomePageFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_page;
    }

    @Override
    protected void init() {
       
    }

    @Override
    protected void loadDate() {


    }

}
