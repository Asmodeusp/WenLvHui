package com.sugang.wenlvhui.view.space;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class SpaceFragment extends BaseFragment {

    @BindView(R.id.Space_FenLeiShaiXuanButton)
    AutoLinearLayout SpaceFenLeiShaiXuanButton;
    @BindView(R.id.Space_DiTuFenBuButton)
    AutoLinearLayout SpaceDiTuFenBuButton;
    @BindView(R.id.Space_Recycler)
    RecyclerView SpaceRecycler;


    public SpaceFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_space;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }

    @OnClick({R.id.Space_FenLeiShaiXuanButton, R.id.Space_DiTuFenBuButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Space_FenLeiShaiXuanButton:
                break;
            case R.id.Space_DiTuFenBuButton:
                startActivity(new Intent(getActivity(),Space_MapActivity.class));
                break;
        }
    }
}
