package com.sugang.wenlvhui.view.home.intangiblecultural;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wcfy.ShouYiSerchContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.ProductListBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiSerchBean;
import com.sugang.wenlvhui.presenter.home.wcfy.ShouYiSerchPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.ShouYiRecyclerAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShouyiSerchActivity extends BaseActivity<ShouYiSerchPresenterImp> implements ShouYiSerchContract.ShouYiSerchView {


    @BindView(R.id.ShouyiSerch_ReturnButton)
    AutoLinearLayout ShouyiSerchReturnButton;
    @BindView(R.id.ShouyiSerch_ShouyiSerchButton)
    AutoLinearLayout ShouyiSerchShouyiSerchButton;
    @BindView(R.id.ShouyiSerch_Edtext)
    EditText ShouyiSerchEdtext;
    @BindView(R.id.ShouyiSerch_SousuoRecycler)
    RecyclerView ShouyiSerchSousuoRecycler;
    @BindView(R.id.ShouyiSerch_SousuoRefreshLayout)
    SmartRefreshLayout ShouyiSerchSousuoRefreshLayout;
    int page = 1;
    private List<ProductListBean> product_list = new ArrayList<>();
    private String trim;
    private ShouYiRecyclerAdapter shouYiRecyclerAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_shouyi_serch;
    }

    @Override
    protected void init() {
        ShouyiSerchSousuoRecycler.setLayoutManager(new GridLayoutManager(this,2));
        shouYiRecyclerAdapter = new ShouYiRecyclerAdapter(product_list,0);
        ShouyiSerchSousuoRecycler.setAdapter(shouYiRecyclerAdapter);
        shouYiRecyclerAdapter.setRecyclerViewOnCLickListener(new ShouYiRecyclerAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                startActivity(new Intent(ShouyiSerchActivity.this, ShouyiDetailActivity.class));
                SPUtils.put(ShouyiSerchActivity.this, SPKey.PRODUCT_ID, product_list.get(position).getId());
            }
        });
        ShouyiSerchSousuoRefreshLayout.setEnableRefresh(false);
        ShouyiSerchSousuoRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                page++;
                presenter.getShouYiSerchBean(page+"",trim );

            }
        });
    }

    @Override
    protected void loadDate() {

    }

    @OnClick({R.id.ShouyiSerch_ReturnButton, R.id.ShouyiSerch_ShouyiSerchButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ShouyiSerch_ReturnButton:
                finish();
                break;
            case R.id.ShouyiSerch_ShouyiSerchButton:
                trim = ShouyiSerchEdtext.getText().toString().trim();
                presenter.getShouYiSerchBean("1",trim );
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                ShouyiSerchEdtext.setText("");
                break;
        }
    }

    @Override
    public void showShouYiSerchBean(ShouYiSerchBean shouYiSerchBean) {
        if (shouYiSerchBean.getData() != null) {
            product_list.addAll(shouYiSerchBean.getData().getProduct_list());
            shouYiRecyclerAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void showError(String string) {

    }
}
