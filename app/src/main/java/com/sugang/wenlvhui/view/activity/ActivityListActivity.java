package com.sugang.wenlvhui.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.activity.ActivityPageContract;
import com.sugang.wenlvhui.model.bean.activity.ActivityListBean;
import com.sugang.wenlvhui.model.bean.activity.ActivityPageBean;
import com.sugang.wenlvhui.model.bean.activity.PolicyBean;
import com.sugang.wenlvhui.presenter.activity.ActivityPagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.ActivityReyclerAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityListActivity extends BaseActivity<ActivityPagePresenterImp> implements ActivityPageContract.ActivityPageView {


    @BindView(R.id.ActivityListReturnButton)
    AutoLinearLayout ActivityListReturnButton;
    @BindView(R.id.ActivityList_Text)
    TextView ActivityListText;
    @BindView(R.id.ActivityListRecycler)
    RecyclerView ActivityListRecycler;
    @BindView(R.id.ActivityListRefreshLayout)
    SmartRefreshLayout ActivityListRefreshLayout;
    private int userid;
    private int page = 1;
    private int type = 1;
    ArrayList<PolicyBean> policyBeans = new ArrayList<>();
    private ActivityReyclerAdapter activityReyclerAdapter;
    private boolean IsRresh;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_list;
    }

    @Override
    protected void init() {
        ActivityListRecycler.setLayoutManager(new LinearLayoutManager(this));
        activityReyclerAdapter = new ActivityReyclerAdapter(policyBeans, this);
        ActivityListRecycler.setAdapter(activityReyclerAdapter);
        activityReyclerAdapter.setOnClick(new ActivityReyclerAdapter.OnClickItem() {
            @Override
            public void setClick(View v, int position) {
                SPUtils.put(ActivityListActivity.this, SPKey.ACTIVITYID, policyBeans.get(position).getId());
                startActivity(new Intent(ActivityListActivity.this, ActivityDetalisActivity.class));
            }
        });
        ActivityListRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                IsRresh =false;
                page++;
                presenter.getActivityListBean(type+"", "", "", userid + "", page + "", "10");
            }
        });
        ActivityListRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                presenter.getActivityListBean(type+"", "", "", userid + "", "1", "10");
                IsRresh =true;
            }
        });
    }

    @Override
    protected void loadDate() {
        String Type = (String) SPUtils.get(this, SPKey.ACTIVITYTYPE, "");
        userid = (int) SPUtils.get(this, SPKey.USER_ID, 0);
        if (Type.equals("惠民")) {
            type=1;
            ActivityListText.setText("惠民");
            presenter.getActivityListBean("1", "", "", userid + "", page + "", "10");
        } else if (Type.equals("演出")) {
            type =2;
            ActivityListText.setText("演出");
            presenter.getActivityListBean("2", "", "", userid + "", page + "", "10");
        } else if (Type.equals("社区")) {
            type =3;
            ActivityListText.setText("社区");
            presenter.getActivityListBean("3", "", "", userid + "", page + "", "10");
        } else if (Type.equals("亲子")) {
            type=4;
            ActivityListText.setText("亲子");
            presenter.getActivityListBean("4", "", "", userid + "", page + "", "10");
        } else {
            type =5;
            ActivityListText.setText("历史");
            presenter.getActivityListBean("5", "", "", userid + "", page + "", "10");
        }
    }

    @Override
    public void showActivityPageBean(ActivityPageBean activityPageBean) {

    }

    @Override
    public void showActivityListBean(ActivityListBean activityListBean) {
        if (activityListBean.getData()!=null) {
            if (IsRresh) {
                policyBeans.clear();
                policyBeans.addAll(activityListBean.getData().getPolicys());
                activityReyclerAdapter.notifyDataSetChanged();
                ActivityListRefreshLayout.finishRefresh();
            }else{
                policyBeans.addAll(activityListBean.getData().getPolicys());
                activityReyclerAdapter.notifyDataSetChanged();
                ActivityListRefreshLayout.finishLoadMore();
            }


        }
    }

    @Override
    public void showError(String string) {

    }

    @OnClick(R.id.ActivityListReturnButton)
    public void onViewClicked() {
        finish();
    }
}
