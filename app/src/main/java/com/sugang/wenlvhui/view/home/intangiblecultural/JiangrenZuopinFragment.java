package com.sugang.wenlvhui.view.home.intangiblecultural;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.model.bean.VideosBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenDetalisBean;
import com.sugang.wenlvhui.view.home.adapter.JiangrenZuopinRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class JiangrenZuopinFragment extends BaseFragment {


    @BindView(R.id.JiangrenZuopinRecycler)
    RecyclerView JiangrenZuopinRecycler;
    Unbinder unbinder;

    public JiangrenZuopinFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_jiangren_zuopin;
    }

    @Override
    protected void init() {
        List<JiangRenDetalisBean.DataBean.ShopBean.ProductListBean> productList = ((JaingRenDetalisActivity) getActivity()).productList;
        JiangrenZuopinRecycler.setLayoutManager(new GridLayoutManager(getActivity(),2));
        JiangrenZuopinRecyclerAdapter jiangrenZuopinRecyclerAdapter = new JiangrenZuopinRecyclerAdapter(productList);
        JiangrenZuopinRecycler.setAdapter(jiangrenZuopinRecyclerAdapter);
    }

    @Override
    protected void loadDate() {

    }


}
