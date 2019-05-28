package com.sugang.wenlvhui.view.home.culturaltravel;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wlze.WlzcXmggListContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.presenter.home.wlzc.WlzcXmggListPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zxdtRecyAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ZixundongtailistActivity extends BaseActivity<WlzcXmggListPresenterImp> implements WlzcXmggListContract.WlzcXmggListView {


    @BindView(R.id.Zixundongtailist_ReturnButton)
    AutoLinearLayout ZixundongtailistReturnButton;
    @BindView(R.id.Zixundongtailist_Recycler)
    RecyclerView ZixundongtailistRecycler;
    @BindView(R.id.Zixundongtailist_RefreshLayout)
    SmartRefreshLayout ZixundongtailistRefreshLayout;
    private int page = 1;
    private boolean IsRresh;
    private int id;
    private List<NewsBean> newsBeans =new ArrayList<>();
    private Wlzc_zxdtRecyAdapter wlzc_zxdtRecyAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_zixundongtailist;
    }

    @Override
    protected void init() {
        ZixundongtailistRecycler.setLayoutManager(new LinearLayoutManager(this));
        wlzc_zxdtRecyAdapter = new Wlzc_zxdtRecyAdapter(newsBeans, presenter);
        ZixundongtailistRecycler.setAdapter(wlzc_zxdtRecyAdapter);
        wlzc_zxdtRecyAdapter.setRecyclerViewOnCLickListener(new Wlzc_zxdtRecyAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(ZixundongtailistActivity.this, SPKey.NEWS_TYPE,"资讯动态");
                SPUtils.put(ZixundongtailistActivity.this, SPKey.NEWS_ID, newsBeans.get(position).getId());
                startActivity(new Intent(ZixundongtailistActivity.this, NewsDetailsActivity.class));
            }
        });
        ZixundongtailistRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                IsRresh =true;

                presenter.getWlzcXmggListBeanData(id + "", "2", "1");
            }
        });
        ZixundongtailistRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                IsRresh =false;
                page++;
                presenter.getWlzcXmggListBeanData(id + "", "2", page+"");
            }
        });
    }

    @Override
    protected void loadDate() {
        id = (int) SPUtils.get(this, SPKey.USER_ID, 0);
        presenter.getWlzcXmggListBeanData(id + "", "2", page + "");
    }


    @OnClick(R.id.Zixundongtailist_ReturnButton)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void showWlzcXmggListBean(WlzcXmggListBean wlzcXmggListBean) {
        if (wlzcXmggListBean.getData() != null) {
            if (IsRresh) {
                newsBeans.clear();
                newsBeans.addAll(wlzcXmggListBean.getData().getLists());
                wlzc_zxdtRecyAdapter.notifyDataSetChanged();
                ZixundongtailistRefreshLayout.finishRefresh();
            }else{
                newsBeans.addAll(wlzcXmggListBean.getData().getLists());
                wlzc_zxdtRecyAdapter .notifyDataSetChanged();
                ZixundongtailistRefreshLayout.finishLoadMore();
            }
        }
    }

    @Override
    public void showError(String string) {

    }

    @Override
    public void ShowiSlike(IsLikeBean isLikeBean) {

    }


}
