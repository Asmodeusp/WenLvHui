package com.sugang.wenlvhui.view.home.culturaltravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wlze.WlzcXmggListContract;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.presenter.home.wlzc.WlzcXmggListPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zxdtRecyAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ZixundongtailistActivity extends  BaseActivity<WlzcXmggListPresenterImp> implements WlzcXmggListContract.WlzcXmggListView{


    @BindView(R.id.Zixundongtailist_ReturnButton)
    AutoLinearLayout ZixundongtailistReturnButton;
    @BindView(R.id.Zixundongtailist_Recycler)
    RecyclerView ZixundongtailistRecycler;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_zixundongtailist;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        presenter.getWlzcXmggListBeanData("1","1");
    }


    @OnClick(R.id.Zixundongtailist_ReturnButton)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void showWlzcXmggListBean(WlzcXmggListBean wlzcXmggListBean) {
        if (wlzcXmggListBean.getData()!=null) {
            final List<NewsBean> all_text = wlzcXmggListBean.getData().getAll_text();
            ZixundongtailistRecycler.setLayoutManager(new LinearLayoutManager(this));
            Wlzc_zxdtRecyAdapter wlzc_zxdtRecyAdapter = new Wlzc_zxdtRecyAdapter(all_text);
            ZixundongtailistRecycler.setAdapter(wlzc_zxdtRecyAdapter);
            wlzc_zxdtRecyAdapter.setRecyclerViewOnCLickListener(new Wlzc_zxdtRecyAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(ZixundongtailistActivity.this, SPKey.NEWS_ID,all_text.get(position).getId());
                    startActivity(new Intent(ZixundongtailistActivity.this,NewsDetailsActivity.class));
                }
            });
        }
    }

    @Override
    public void showError(String string) {

    }
}
