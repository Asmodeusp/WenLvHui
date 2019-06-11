package com.sugang.wenlvhui.view.home.literarybrigadelist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class WLBD_MsFragment extends BaseFragment<wlbdPresenterImp> implements WlbdContract.WlbdView {


    @BindView(R.id.WLBD_MsRecy)
    RecyclerView WLBDMsRecy;


    public WLBD_MsFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wlbd__ms;
    }

    @Override
    protected void init() {
    }

    @Override
    protected void loadDate() {
        presenter.getWlbdBean("8");
    }

    @Override
    public void showWlbdHsBean(WlbdHsBean wlbdHsBean) {
        if (wlbdHsBean.getData()!=null) {
            List<WlbdHsBean.DataBean.BangdanBean> bangdan = wlbdHsBean.getData().getBangdan();
            WLBDMsRecy.setLayoutManager(new LinearLayoutManager(getActivity()));
            WlbdAdapter wlbdAdapter = new WlbdAdapter(bangdan);
            WLBDMsRecy.setAdapter(wlbdAdapter);
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
