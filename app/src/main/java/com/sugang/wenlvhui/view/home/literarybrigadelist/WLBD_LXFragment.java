package com.sugang.wenlvhui.view.home.literarybrigadelist;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.home.wlbd.WlbdContract;
import com.sugang.wenlvhui.model.bean.home.wlbd.WlbdHsBean;
import com.sugang.wenlvhui.presenter.home.wlbd.wlbdPresenterImp;
import com.sugang.wenlvhui.view.home.adapter.WlbdAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class WLBD_LXFragment extends BaseFragment<wlbdPresenterImp> implements WlbdContract.WlbdView {


    @BindView(R.id.WLBD_LXRecycler)
    RecyclerView WLBDLXRecycler;
    public WLBD_LXFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wlbd__lx;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        presenter.getWlbdBean("7");
//        presenter.getWlbdBean("2");
    }

    @Override
    public void showWlbdHsBean(WlbdHsBean wlbdHsBean) {
        if (wlbdHsBean.getData()!=null) {
            List<WlbdHsBean.DataBean.BangdanBean> bangdan = wlbdHsBean.getData().getBangdan();
            WLBDLXRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
            WlbdAdapter wlbdAdapter = new WlbdAdapter(bangdan);
            WLBDLXRecycler.setAdapter(wlbdAdapter);
            wlbdAdapter.setRecyclerViewOnCLickListener(new WlbdAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {

                }
            });
        }
    }

    @Override
    public void showError(String string) {

    }


}
