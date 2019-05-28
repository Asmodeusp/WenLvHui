package com.sugang.wenlvhui.view.home.travelroute;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wllx.WllxListContract;
import com.sugang.wenlvhui.model.bean.home.wllx.BrigadesBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;
import com.sugang.wenlvhui.presenter.home.wllx.WllxListPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.TravelRouteJINPINRecyAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WllxNjhlActivity extends BaseActivity<WllxListPresenterImp> implements WllxListContract.WllxListView {


    @BindView(R.id.WllxNjhlRecycler)
    RecyclerView WllxNjhlRecycler;
    @BindView(R.id.WllxNjhl_ReturnButton)
    AutoLinearLayout WllxNjhlReturnButton;
    @BindView(R.id.WllxNjhlTYPEText)
    TextView WllxNjhlTYPEText;
    @BindView(R.id.WllxNjhlRecyclerRefreshLayout)
    SmartRefreshLayout WllxNjhlRecyclerRefreshLayout;
    private List<BrigadesBean> brigades = new ArrayList<>();
    private int typeId;
    private int Page = 1;
    private boolean IsRresh;
    private TravelRouteJINPINRecyAdapter travelRouteJINPINRecyAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wllx_njhl;
    }

    @Override
    protected void init() {
        WllxNjhlRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        travelRouteJINPINRecyAdapter = new TravelRouteJINPINRecyAdapter(brigades);
        WllxNjhlRecycler.setAdapter(travelRouteJINPINRecyAdapter);
        travelRouteJINPINRecyAdapter.setRecyclerViewOnCLickListener(new TravelRouteJINPINRecyAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(WllxNjhlActivity.this, SPKey.WLLX_ID, brigades.get(position).getId());
                startActivity(new Intent(WllxNjhlActivity.this, WllxDetalisActivity.class));
            }
        });
        WllxNjhlRecyclerRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                IsRresh = true;
                presenter.getWllxListBean(typeId + "", "1", "10");
            }
        });
        WllxNjhlRecyclerRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                IsRresh = false;
                Page++;
                presenter.getWllxListBean(typeId + "", Page + "", "10");
            }
        });
    }

    @Override
    protected void loadDate() {
        typeId = (int) SPUtils.get(this, SPKey.WLLX_TYPEID, 1);
        String TypeName = (String) SPUtils.get(this, SPKey.WLLX_TYPE, "");
        WllxNjhlTYPEText.setText(TypeName);
        presenter.getWllxListBean(typeId + "", Page + "", "10");
    }

    @Override
    public void showWllxListBeanBean(WllxListBean WllxListBeanBean) {
        if (WllxListBeanBean.getData() != null) {
            if (IsRresh) {
                brigades.clear();
                brigades.addAll(WllxListBeanBean.getData().getBrigades());
                travelRouteJINPINRecyAdapter.notifyDataSetChanged();
                WllxNjhlRecyclerRefreshLayout.finishRefresh();
            } else {
                brigades.addAll(WllxListBeanBean.getData().getBrigades());
                travelRouteJINPINRecyAdapter.notifyDataSetChanged();
                WllxNjhlRecyclerRefreshLayout.finishLoadMore();
            }

        }
    }

    @Override
    public void showError(String string) {

    }


    @OnClick(R.id.WllxNjhl_ReturnButton)
    public void onViewClicked() {
        finish();
    }
}
