package com.sugang.wenlvhui.view.space;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.space.SpaceDongTaiContract;
import com.sugang.wenlvhui.model.bean.space.SpaceDongTaiBean;
import com.sugang.wenlvhui.presenter.space.SpaceDongTaiPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.adaptr.SpaceDongTaiRecyclerAdapter;
import com.sugang.wenlvhui.view.adaptr.SpacePageAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class SpaceDongTaiFragment extends BaseFragment<SpaceDongTaiPresenterImp> implements SpaceDongTaiContract.SpaceDongTaiView {


    @BindView(R.id.SpaceDongTaiRecycler)
    RecyclerView SpaceDongTaiRecycler;
//    @BindView(R.id.SpaceDongTaiRefreshLayout)
//    SmartRefreshLayout SpaceDongTaiRefreshLayout;


    public SpaceDongTaiFragment() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_space_dong_tai;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        int SpaceId = (int) SPUtils.get(getActivity(), SPKey.SPACEID, 0);
        presenter.getSpaceDongTaiBean(SpaceId+"");
    }

    @Override
    public void showSpaceDongTaiBean(SpaceDongTaiBean activityPageBean) {
        SpaceDongTaiRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        SpaceDongTaiRecyclerAdapter spaceDongTaiRecyclerAdapter = new SpaceDongTaiRecyclerAdapter(activityPageBean.getData().getSpace_detail());
        SpaceDongTaiRecycler.setAdapter(spaceDongTaiRecyclerAdapter);
    }

    @Override
    public void showError(String string) {

    }



}
