package com.sugang.wenlvhui.view.home.intangiblecultural;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wcfy.JiangRenSerchContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangrenSerchBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShopsBean;
import com.sugang.wenlvhui.presenter.home.wcfy.JiangRenSerchPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.JaingRenRecyAdapter;
import com.sugang.wenlvhui.view.home.adapter.ShouYiRecyclerAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class JiangrenSerchActivity extends BaseActivity <JiangRenSerchPresenterImp> implements JiangRenSerchContract.JiangRenSerchView {


    @BindView(R.id.JiangrenSerch_ReturnButton)
    AutoLinearLayout JiangrenSerchReturnButton;
    @BindView(R.id.JiangrenSerch_JiangrenSerchButton)
    AutoLinearLayout JiangrenSerchJiangrenSerchButton;
    @BindView(R.id.JiangrenSerch_Edtext)
    EditText JiangrenSerchEdtext;
    @BindView(R.id.JiangrenSerch_SousuoRecycler)
    RecyclerView JiangrenSerchSousuoRecycler;
    @BindView(R.id.JiangrenSerch_SousuoRefreshLayout)
    SmartRefreshLayout JiangrenSerchSousuoRefreshLayout;
    private String trim;
    private List<ShopsBean> shop_list = new ArrayList<>();
    int page =1;
    private JaingRenRecyAdapter jaingRenRecyAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_jiangren_serch;
    }

    @Override
    protected void init() {
        JiangrenSerchSousuoRecycler.setLayoutManager(new LinearLayoutManager(this));
        jaingRenRecyAdapter = new JaingRenRecyAdapter(shop_list);
        jaingRenRecyAdapter.setRecyclerViewOnCLickListener(new JaingRenRecyAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(JiangrenSerchActivity.this,SPKey.SHOP_DETAILS,shop_list.get(position).getShopsDetail());
                SPUtils.put(JiangrenSerchActivity.this, SPKey.SHOP_ID,shop_list.get(position).getId());
                startActivity(new Intent(JiangrenSerchActivity.this,JaingRenDetalisActivity.class));
            }
        });
        JiangrenSerchSousuoRecycler.setAdapter(jaingRenRecyAdapter);
        JiangrenSerchSousuoRefreshLayout.setEnableRefresh(false);
        JiangrenSerchSousuoRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                page++;
                presenter.getJiangRenSerchBean(page+"",trim );

            }
        });
    }

    @Override
    protected void loadDate() {

    }



    @OnClick({R.id.JiangrenSerch_ReturnButton, R.id.JiangrenSerch_JiangrenSerchButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.JiangrenSerch_ReturnButton:
                finish();
                break;
            case R.id.JiangrenSerch_JiangrenSerchButton:
                trim = JiangrenSerchEdtext.getText().toString().trim();
                presenter.getJiangRenSerchBean("1", trim);
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                JiangrenSerchEdtext.setText("");
                break;
        }
    }

    @Override
    public void showJiangRenSerchBean(JiangrenSerchBean shouYiPageBean) {
        if (shouYiPageBean.getData()!=null) {
            shop_list .addAll(shouYiPageBean.getData().getShop_list()) ;
            jaingRenRecyAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void showError(String string) {

    }
}
