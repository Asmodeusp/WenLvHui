package com.sugang.wenlvhui.view.home.travelroute;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class TravelrouteFirstFragment extends BaseFragment {


    @BindView(R.id.TravelrouteFirst_ZMHYButton)
    AutoRelativeLayout TravelrouteFirstZMHYButton;
    @BindView(R.id.TravelrouteFirst_NJHLButton)
    AutoRelativeLayout TravelrouteFirstNJHLButton;
    @BindView(R.id.TravelrouteFirst_RQHBButton)
    AutoRelativeLayout TravelrouteFirstRQHBButton;


    public TravelrouteFirstFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_travelroute_first;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }

    @OnClick({R.id.TravelrouteFirst_ZMHYButton, R.id.TravelrouteFirst_NJHLButton, R.id.TravelrouteFirst_RQHBButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.TravelrouteFirst_ZMHYButton:
                SPUtils.put(getActivity(), SPKey.WLLX_TYPE, "周末嗨游");
                SPUtils.put(getActivity(), SPKey.WLLX_TYPEID, 1);
                SPUtils.put(getActivity(), SPKey.WLLX_TYPE, "农家嗨乐");
                SPUtils.put(getActivity(), SPKey.WLLX_TYPEID, 2);
                startActivity(new Intent(getActivity(), WllxNjhlActivity.class));
                break;
            case R.id.TravelrouteFirst_NJHLButton:
                SPUtils.put(getActivity(), SPKey.WLLX_TYPE, "农家嗨乐");
                SPUtils.put(getActivity(), SPKey.WLLX_TYPEID, 2);
                SPUtils.put(getActivity(), SPKey.WLLX_TYPE, "人气嗨爆");
                SPUtils.put(getActivity(), SPKey.WLLX_TYPEID, 3);
                startActivity(new Intent(getActivity(), WllxNjhlActivity.class));
                break;
            case R.id.TravelrouteFirst_RQHBButton:
                SPUtils.put(getActivity(), SPKey.WLLX_TYPE, "人气嗨爆");
                SPUtils.put(getActivity(), SPKey.WLLX_TYPEID, 3);
                startActivity(new Intent(getActivity(), WllxNjhlActivity.class));
                break;
        }
    }
}
