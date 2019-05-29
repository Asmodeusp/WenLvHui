package com.sugang.wenlvhui.view.home.culturaltravel;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
import com.sugang.wenlvhui.model.bean.home.wlze.NewsTBean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.presenter.home.wlzc.WlzcXmggListPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zcjdListAdapter;
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zcjdRecyAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ZhengcejiedulistActivity extends BaseActivity<WlzcXmggListPresenterImp> implements WlzcXmggListContract.WlzcXmggListView {


    @BindView(R.id.Zhengcejiedulist_ReturnButton)
    AutoLinearLayout ZhengcejiedulistReturnButton;
    @BindView(R.id.Zhengcejiedulist_Recycler)
    RecyclerView ZhengcejiedulistRecycler;
    @BindView(R.id.Zhengcejiedulist_RefreshLayout)
    SmartRefreshLayout ZhengcejiedulistRefreshLayout;
    private int page = 1;
    private boolean IsRresh;
    private int id;
    private List<NewsTBean> newsBeans =new ArrayList<>();
    private Wlzc_zcjdListAdapter wlzc_zcjdRecyAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_zhengcejiedulist;
    }

    @Override
    protected void init() {
        ZhengcejiedulistRecycler.setLayoutManager(new LinearLayoutManager(this));
        wlzc_zcjdRecyAdapter = new Wlzc_zcjdListAdapter(newsBeans, presenter);
        ZhengcejiedulistRecycler.setAdapter(wlzc_zcjdRecyAdapter);
        wlzc_zcjdRecyAdapter.setRecyclerViewOnCLickListener(new Wlzc_zcjdListAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(ZhengcejiedulistActivity.this, SPKey.NEWS_TYPE,"政策解读");
                SPUtils.put(ZhengcejiedulistActivity.this, SPKey.NEWS_ID, newsBeans.get(position).getId());
                startActivity(new Intent(ZhengcejiedulistActivity.this, NewsDetailsActivity.class));
            }
        });
        ZhengcejiedulistRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                IsRresh =true;

                presenter.getWlzcXmggListBeanData(id + "", "2", "1");
            }
        });
        ZhengcejiedulistRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
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

    @OnClick(R.id.Zhengcejiedulist_ReturnButton)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void showWlzcXmggListBean(WlzcXmggListBean wlzcXmggListBean) {

        if (wlzcXmggListBean.getData() != null) {
            if (IsRresh) {
                newsBeans.clear();
                newsBeans.addAll(wlzcXmggListBean.getData().getLists());
                wlzc_zcjdRecyAdapter.notifyDataSetChanged();
                ZhengcejiedulistRefreshLayout.finishRefresh();
            }else{
                newsBeans.addAll(wlzcXmggListBean.getData().getLists());
                wlzc_zcjdRecyAdapter.notifyDataSetChanged();
                ZhengcejiedulistRefreshLayout.finishLoadMore();
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
