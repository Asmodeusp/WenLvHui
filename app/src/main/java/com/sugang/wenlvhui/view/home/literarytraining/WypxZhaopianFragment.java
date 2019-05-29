package com.sugang.wenlvhui.view.home.literarytraining;


import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.model.bean.ImgsBean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxDetalisBean;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.ZhaopianFragmentRecyclerAdapter;
import com.sugang.wenlvhui.view.home.culturaltravelcustomization.WldzDetalisActivity;

import java.util.ArrayList;

import butterknife.BindView;

public class WypxZhaopianFragment extends BaseFragment {


    @BindView(R.id.ZhaopianFragmentRecycler)
    RecyclerView ZhaopianFragmentRecycler;
    ArrayList<ImgsBean> urls = new ArrayList<>();

    public WypxZhaopianFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wypx_zhaopian;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        String hq = (String) SPUtils.get(getActivity(), "HQ", "");
        if (hq.equals("WypxDetalisActivity")) {
            urls.addAll(((WypxDetalisActivity) getActivity()).imgs);
        }
        if (hq.equals("WldzDetalisActivity")) {
            urls.addAll(((WldzDetalisActivity) getActivity()).imgs);
        }

        ZhaopianFragmentRecycler.setLayoutManager(new GridLayoutManager(getActivity(),3));
        ZhaopianFragmentRecyclerAdapter zhaopianFragmentRecyclerAdapter = new ZhaopianFragmentRecyclerAdapter(urls);
        ZhaopianFragmentRecycler.setAdapter(zhaopianFragmentRecyclerAdapter);

    }


}
