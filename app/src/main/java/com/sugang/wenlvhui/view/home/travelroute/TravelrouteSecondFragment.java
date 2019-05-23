package com.sugang.wenlvhui.view.home.travelroute;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class TravelrouteSecondFragment extends BaseFragment {


    @BindView(R.id.TravelrouteFirst_YLLXButton)
    AutoRelativeLayout TravelrouteFirstYLLXButton;
    @BindView(R.id.TravelrouteFirst_YXYButton)
    AutoRelativeLayout TravelrouteFirstYXYButton;
    @BindView(R.id.TravelrouteFirst_YLYJButton)
    AutoRelativeLayout TravelrouteFirstYLYJButton;

    public TravelrouteSecondFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_travelroute_second;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }
    @OnClick({R.id.TravelrouteFirst_YLLXButton, R.id.TravelrouteFirst_YXYButton, R.id.TravelrouteFirst_YLYJButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.TravelrouteFirst_YLLXButton:
                startActivity(new Intent(getActivity(),WllxYllxActivity.class));
                break;
            case R.id.TravelrouteFirst_YXYButton:
                startActivity(new Intent(getActivity(),WllxYxyActivity.class));
                break;
            case R.id.TravelrouteFirst_YLYJButton:
                startActivity(new Intent(getActivity(),WllxYlyjActivity.class));
                break;
        }
    }
}
