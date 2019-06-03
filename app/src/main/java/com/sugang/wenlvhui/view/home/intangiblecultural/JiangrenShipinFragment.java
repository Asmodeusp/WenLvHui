package com.sugang.wenlvhui.view.home.intangiblecultural;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.model.bean.VideosBean;
import com.sugang.wenlvhui.view.home.adapter.ShipinFragmentRecyclerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class JiangrenShipinFragment extends BaseFragment {


    @BindView(R.id.JiangrenShipinRecy)
    RecyclerView JiangrenShipinRecy;
    Unbinder unbinder;

    public JiangrenShipinFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_jiangren_shipin;
    }

    @Override
    protected void init() {
        JiangrenShipinRecy.setLayoutManager(new LinearLayoutManager(getActivity()));
        ArrayList<VideosBean> videosBeans = ((JaingRenDetalisActivity) getActivity()).videosBeans;
        JiangrenShipinRecy.setAdapter(new ShipinFragmentRecyclerAdapter(videosBeans));
    }

    @Override
    protected void loadDate() {

    }


}
