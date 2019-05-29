package com.sugang.wenlvhui.view.home.culturaltravelcustomization;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wldz.WldzPageContract;
import com.sugang.wenlvhui.model.bean.home.wldz.ArtistsBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzArtistindexBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsTBean;
import com.sugang.wenlvhui.presenter.home.wldz.WldzPagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.WldzArtistAdapter;
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zxdtListAdapter;
import com.sugang.wenlvhui.view.home.culturaltravel.NewsDetailsActivity;
import com.sugang.wenlvhui.view.home.culturaltravel.ZixundongtailistActivity;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WldzListActivity extends BaseActivity<WldzPagePresenterImp> implements WldzPageContract.WldzPageView {


    @BindView(R.id.WldzListReturnButton)
    AutoLinearLayout WldzListReturnButton;
    @BindView(R.id.WldzListRecy)
    RecyclerView WldzListRecy;
    @BindView(R.id.WldzListRefreshLayout)
    SmartRefreshLayout WldzListRefreshLayout;
    private int page = 1;
    private boolean IsRresh;
    private int id;
    private List<ArtistsBean> newsBeans =new ArrayList<>();
    private WldzArtistAdapter wlzc_zxdtRecyAdapter;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_wldz_list;
    }

    @Override
    protected void init() {
        WldzListRecy.setLayoutManager(new LinearLayoutManager(this));
        wlzc_zxdtRecyAdapter = new WldzArtistAdapter(newsBeans);
        WldzListRecy.setAdapter(wlzc_zxdtRecyAdapter);
        wlzc_zxdtRecyAdapter.setRecyclerViewOnCLickListener(new WldzArtistAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(WldzListActivity.this, SPKey.WLDZ_YIRENTYPE,newsBeans.get(position).getId());
                startActivity(new Intent(WldzListActivity.this,WldzDetalisActivity.class));
            }
        });
        WldzListRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                IsRresh =true;

                presenter.getWldzArtistindexBean( "1", "10");
            }
        });
        WldzListRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                IsRresh =false;
                page++;
                presenter.getWldzArtistindexBean( page+"","10");
            }
        });
    }

    @Override
    protected void loadDate() {
        presenter.getWldzArtistindexBean(page+"",10+"");
    }

    @Override
    public void showWldzArtistindexBean(WldzArtistindexBean wldzArtistindexBean) {
        if (wldzArtistindexBean.getData() != null) {
            if (IsRresh) {
                newsBeans.clear();
                newsBeans.addAll(wldzArtistindexBean.getData().getArtists());
                wlzc_zxdtRecyAdapter.notifyDataSetChanged();
                WldzListRefreshLayout.finishRefresh();
            }else{
                newsBeans.addAll(wldzArtistindexBean.getData().getArtists());
                wlzc_zxdtRecyAdapter .notifyDataSetChanged();
                WldzListRefreshLayout.finishLoadMore();
            }
        }
    }

    @Override
    public void showError(String string) {

    }

    @OnClick(R.id.WldzListReturnButton)
    public void onViewClicked() {
        finish();
    }

    
}
