package com.sugang.wenlvhui.view.home.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class WllxVPAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;


    public WllxVPAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.isEmpty() ? 0 : fragments.size();
    }

}