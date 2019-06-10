package com.sugang.wenlvhui.view.home.travelroute;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wllx.WllxSerchContract;
import com.sugang.wenlvhui.model.bean.home.wllx.BrigadesBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxSerchBean;
import com.sugang.wenlvhui.presenter.home.wllx.WllxSerchPresenter;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.TravelRouteJINPINRecyAdapter;
import com.sugang.wenlvhui.view.home.adapter.WldzArtistAdapter;
import com.sugang.wenlvhui.view.home.culturaltravelcustomization.WldzDetalisActivity;
import com.sugang.wenlvhui.view.home.culturaltravelcustomization.WldzSerchActivity;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WllxSerchActivity extends BaseActivity<WllxSerchPresenter> implements WllxSerchContract.WllxSerchView {


    @BindView(R.id.WllxSerch_ReturnButton)
    AutoLinearLayout WllxSerchReturnButton;
    @BindView(R.id.WllxSerch_WllxSerchButton)
    AutoLinearLayout WllxSerchWllxSerchButton;
    @BindView(R.id.WllxSerch_Edtext)
    EditText WllxSerchEdtext;
    @BindView(R.id.WllxSerch_SousuoRecycler)
    RecyclerView WllxSerchSousuoRecycler;
    @BindView(R.id.WllxSerch_SousuoRefreshLayout)
    SmartRefreshLayout WllxSerchSousuoRefreshLayout;
    int page = 1;
    private String trim;
    private List<BrigadesBean> brigades =new ArrayList<>();
    private TravelRouteJINPINRecyAdapter travelRouteJINPINRecyAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wllx_serch;
    }

    @Override
    protected void init() {

        WllxSerchSousuoRefreshLayout.finishRefresh();
        WllxSerchSousuoRecycler.setLayoutManager(new GridLayoutManager(this,2));
        travelRouteJINPINRecyAdapter = new TravelRouteJINPINRecyAdapter(brigades);
        travelRouteJINPINRecyAdapter.notifyDataSetChanged();
        WllxSerchSousuoRecycler.setAdapter(travelRouteJINPINRecyAdapter);
        travelRouteJINPINRecyAdapter.setRecyclerViewOnCLickListener(new TravelRouteJINPINRecyAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(WllxSerchActivity.this, SPKey.WLLX_ID, brigades.get(position).getId());
                startActivity(new Intent(WllxSerchActivity.this, WllxDetalisActivity.class));
            }
        });

        WllxSerchSousuoRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                page++;
                presenter.getWllxSerchBean(trim, "10",page + "");
            }
        });
    }

    @Override
    protected void loadDate() {

    }

    @OnClick({R.id.WllxSerch_ReturnButton, R.id.WllxSerch_WllxSerchButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.WllxSerch_ReturnButton:
                finish();
                break;
            case R.id.WllxSerch_WllxSerchButton:
                trim = WllxSerchEdtext.getText().toString().trim();
                presenter.getWllxSerchBean(trim, "10",page + "");
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                WllxSerchEdtext.setText("");
                break;
        }
    }

    @Override
    public void showWllxSerchBeanBean(WllxSerchBean WllxSerchBeanBean) {
        brigades.addAll(WllxSerchBeanBean.getData().getBrigades());
        travelRouteJINPINRecyAdapter.notifyDataSetChanged();
        WllxSerchSousuoRefreshLayout.finishLoadMore();
    }

    @Override
    public void showError(String string) {

    }
}
