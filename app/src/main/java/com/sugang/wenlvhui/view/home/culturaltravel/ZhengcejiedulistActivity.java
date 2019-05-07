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
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zcjdRecyAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ZhengcejiedulistActivity extends BaseActivity<WlzcXmggListPresenterImp> implements WlzcXmggListContract.WlzcXmggListView {


    @BindView(R.id.Zhengcejiedulist_ReturnButton)
    AutoLinearLayout ZhengcejiedulistReturnButton;
    @BindView(R.id.Zhengcejiedulist_Recycler)
    RecyclerView ZhengcejiedulistRecycler;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_zhengcejiedulist;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        presenter.getWlzcXmggListBeanData("1","2");
    }


    @OnClick(R.id.Zhengcejiedulist_ReturnButton)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void showWlzcXmggListBean(WlzcXmggListBean wlzcXmggListBean) {
        if (wlzcXmggListBean.getData()!=null) {
            final List<NewsBean> all_text = wlzcXmggListBean.getData().getAll_text();
            ZhengcejiedulistRecycler.setLayoutManager(new LinearLayoutManager(this));
            Wlzc_zcjdRecyAdapter wlzc_zcjdRecyAdapter = new Wlzc_zcjdRecyAdapter(all_text);
            ZhengcejiedulistRecycler.setAdapter(wlzc_zcjdRecyAdapter);
            wlzc_zcjdRecyAdapter.setRecyclerViewOnCLickListener(new Wlzc_zcjdRecyAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(ZhengcejiedulistActivity.this, SPKey.NEWS_ID,all_text.get(position).getId());
                    startActivity(new Intent(ZhengcejiedulistActivity.this,NewsDetailsActivity.class));
                }
            });
        }

    }

    @Override
    public void showError(String string) {

    }
}
