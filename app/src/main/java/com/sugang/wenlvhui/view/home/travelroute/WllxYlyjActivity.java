package com.sugang.wenlvhui.view.home.travelroute;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wllx.WllxylyjListContract;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxylyjListBean;
import com.sugang.wenlvhui.presenter.home.wllx.WllxylyjListPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.TravelRouteJINPINRecyAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WllxYlyjActivity extends BaseActivity<WllxylyjListPresenterImp> implements WllxylyjListContract.WllxylyjListView {


    @BindView(R.id.WllxYlyj_ReturnButton)
    AutoLinearLayout WllxYlyjReturnButton;
    @BindView(R.id.WllxYlyj_Recycler)
    RecyclerView WllxYlyjRecycler;
    @BindView(R.id.WllxYlyj_RefreshLayout)
    SmartRefreshLayout WllxYlyjRefreshLayout;
    private int page = 1;
    private boolean IsRresh;
    private int userId;
    private List<WllxylyjListBean.DataBean.ListsBean> lists = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wllx_ylyj;
    }

    @Override
    protected void init() {
        WllxYlyjRecycler.setLayoutManager(new LinearLayoutManager(this));
//        travelRouteJINPINRecyAdapter = new TravelRouteJINPINRecyAdapter(brigades);
//        WllxNjhlRecycler.setAdapter(travelRouteJINPINRecyAdapter);
//        travelRouteJINPINRecyAdapter.setRecyclerViewOnCLickListener(new TravelRouteJINPINRecyAdapter.RecyclerViewOnCLickListener() {
//            @Override
//            public void myClick(View view, int position) {
//                SPUtils.put(WllxYlyjActivity.this, SPKey.WLLX_YLYJID, brigades.get(position).getId());
//                startActivity(new Intent(WllxYlyjActivity.this, WllxDetalisActivity.class));
//            }
//        });
        WllxYlyjRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                IsRresh = true;
                presenter.getWllxylyjListBean(userId + "", "10", "1");
            }
        });
        WllxYlyjRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                IsRresh = false;
                page++;
                presenter.getWllxylyjListBean(userId + "", "10", page + "");
            }
        });
    }

    @Override
    protected void loadDate() {
        userId = (int) SPUtils.get(this, SPKey.USER_ID, 0);
        presenter.getWllxylyjListBean(userId + "", "10", page + "");
    }


    @OnClick(R.id.WllxYlyj_ReturnButton)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void showWllxylyjListBeanBean(WllxylyjListBean WllxylyjListBeanBean) {
        if (WllxylyjListBeanBean.getData() != null) {
            lists.addAll(WllxylyjListBeanBean.getData().getLists());
        }
    }

    @Override
    public void showError(String string) {

    }


}
