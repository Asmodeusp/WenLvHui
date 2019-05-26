package com.sugang.wenlvhui.view.home.literarytraining;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.model.bean.VideosBean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxDetalisBean;
import com.sugang.wenlvhui.view.home.adapter.ShipinFragmentRecyclerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.jzvd.JZVideoPlayerStandard;

/**
 * A simple {@link Fragment} subclass.
 */
public class WypxShipinFragment extends BaseFragment {


    @BindView(R.id.WypxShipinFragmentRecycler)
    RecyclerView WypxShipinFragmentRecycler;
    ArrayList<VideosBean> videos = new ArrayList<>();
    public WypxShipinFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wypx_shipin;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        videos.addAll(((WypxDetalisActivity) getActivity()).video);
        WypxShipinFragmentRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        ShipinFragmentRecyclerAdapter shipinFragmentRecyclerAdapter = new ShipinFragmentRecyclerAdapter(videos);
        WypxShipinFragmentRecycler.setAdapter(shipinFragmentRecyclerAdapter);

    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        JZVideoPlayerStandard.releaseAllVideos();
    }
}
