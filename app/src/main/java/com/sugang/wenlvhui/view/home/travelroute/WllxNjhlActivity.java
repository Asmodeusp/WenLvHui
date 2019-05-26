package com.sugang.wenlvhui.view.home.travelroute;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wllx.WllxListContract;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;
import com.sugang.wenlvhui.presenter.home.wllx.WllxListPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.TravelRouteJINPINRecyAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WllxNjhlActivity extends BaseActivity<WllxListPresenterImp> implements WllxListContract.WllxListView {


    @BindView(R.id.WllxNjhlRecycler)
    RecyclerView WllxNjhlRecycler;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wllx_njhl;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }

    @Override
    public void showWllxListBeanBean(WllxListBean WllxListBeanBean) {
        if (WllxListBeanBean.getData() != null) {
            final WllxListBean.DataBean data = WllxListBeanBean.getData();
            WllxNjhlRecycler.setLayoutManager(new GridLayoutManager(this, 2));
            TravelRouteJINPINRecyAdapter travelRouteJINPINRecyAdapter = new TravelRouteJINPINRecyAdapter(data.getBrigades());
            WllxNjhlRecycler.setAdapter(travelRouteJINPINRecyAdapter);
            travelRouteJINPINRecyAdapter.setRecyclerViewOnCLickListener(new TravelRouteJINPINRecyAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(WllxNjhlActivity.this, SPKey.WLLX_ID, data.getBrigades().get(position).getId());
                    startActivity(new Intent(WllxNjhlActivity.this, WllxDetalisActivity.class));
                }
            });
        }
    }

    @Override
    public void showError(String string) {

    }
}
