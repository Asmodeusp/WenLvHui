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
import com.sugang.wenlvhui.view.home.adapter.CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter;
import com.sugang.wenlvhui.view.home.adapter.WlzcXmggListAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class XiangmugonggaoListActivity extends BaseActivity<WlzcXmggListPresenterImp> implements WlzcXmggListContract.WlzcXmggListView {


    @BindView(R.id.XiangmugonggaoList_ReturnButton)
    AutoLinearLayout XiangmugonggaoListReturnButton;
    @BindView(R.id.XiangmugonggaoList_Recycler)
    RecyclerView XiangmugonggaoListRecycler;
    @BindView(R.id.XiangmugonggaoList_RefreshLayout)
    SmartRefreshLayout XiangmugonggaoListRefreshLayout;
    private int id;
    private int page = 1;
    private boolean IsRresh;
    private List<NewsTBean> newsBeans =new ArrayList<>();
    private WlzcXmggListAdapter adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_xiangmugonggao_list;
    }

    @Override
    protected void init() {
        XiangmugonggaoListRecycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new WlzcXmggListAdapter(newsBeans, presenter);
        XiangmugonggaoListRecycler.setAdapter(adapter);
        adapter.getSendISlike(new WlzcXmggListAdapter.SendISlike() {
            @Override
            public void sendLike(int dataId) {
                presenter.iSlike(id + "", "2", dataId + "");
            }
        });
        adapter.setRecyclerViewOnCLickListener(new WlzcXmggListAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(XiangmugonggaoListActivity.this, SPKey.NEWS_TYPE,"项目公告");
                SPUtils.put(XiangmugonggaoListActivity.this, SPKey.NEWS_ID, newsBeans.get(position).getId());
                startActivity(new Intent(XiangmugonggaoListActivity.this, NewsDetailsActivity.class));
            }
        });
        XiangmugonggaoListRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                IsRresh =true;
                presenter.getWlzcXmggListBeanData(id + "", "3", "1");
            }
        });
        XiangmugonggaoListRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                IsRresh =false;
                page++;
                presenter.getWlzcXmggListBeanData(id + "", "3", page+"");
            }
        });

    }

    @Override
    protected void loadDate() {
        id = (int) SPUtils.get(this, SPKey.USER_ID, 0);
        presenter.getWlzcXmggListBeanData(id + "", "3", page + "");
      
    }


    @OnClick(R.id.XiangmugonggaoList_ReturnButton)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void showWlzcXmggListBean(WlzcXmggListBean wlzcXmggListBean) {

        if (wlzcXmggListBean.getData() != null) {
            if (IsRresh) {
                newsBeans.clear();
                newsBeans.addAll(wlzcXmggListBean.getData().getLists());
                adapter.notifyDataSetChanged();
                XiangmugonggaoListRefreshLayout.finishRefresh();
            }else{
                newsBeans.addAll(wlzcXmggListBean.getData().getLists());
                adapter.notifyDataSetChanged();
                XiangmugonggaoListRefreshLayout.finishLoadMore();
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
