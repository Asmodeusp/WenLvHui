package com.sugang.wenlvhui.view.home.literarytraining;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wypx.WypxPageContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxPageBean;
import com.sugang.wenlvhui.presenter.home.wypx.WypxPagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.LiteraryTrainingDetailsRecyclerAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LiteraryTrainingDetailsActivity extends BaseActivity<WypxPagePresenterImp> implements WypxPageContract.WypxPageView {


    @BindView(R.id.LiteraryTrainingDetails_ReturnButton)
    AutoLinearLayout LiteraryTrainingDetailsReturnButton;
    @BindView(R.id.LiteraryTrainingDetails_HeadText)
    TextView LiteraryTrainingDetailsHeadText;
    @BindView(R.id.LiteraryTrainingDetailsRecycler)
    RecyclerView LiteraryTrainingDetailsRecycler;
    @BindView(R.id.LiteraryTrainingDetailsRecyclerRefresh)
    SmartRefreshLayout LiteraryTrainingDetailsRecyclerRefresh;
    private String wenyi_type;
    private int page = 1;
    private List<WypxPageBean.DataBean.SchoolsBean> schools = new ArrayList<>();
    private LiteraryTrainingDetailsRecyclerAdapter literaryTrainingDetailsRecyclerAdapter;
    private Integer userId;
    private boolean IsRresh;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_literary_training_details;
    }

    @Override
    protected void init() {
        LiteraryTrainingDetailsHeadText.setText(wenyi_type);
        LiteraryTrainingDetailsRecycler.setLayoutManager(new LinearLayoutManager(this));
        literaryTrainingDetailsRecyclerAdapter = new LiteraryTrainingDetailsRecyclerAdapter(schools, presenter);
        LiteraryTrainingDetailsRecycler.setAdapter(literaryTrainingDetailsRecyclerAdapter);
        literaryTrainingDetailsRecyclerAdapter.setRecyclerViewOnCLickListener(new LiteraryTrainingDetailsRecyclerAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(LiteraryTrainingDetailsActivity.this, SPKey.SCHOOL_ID, schools.get(position).getId());
                startActivity(new Intent(LiteraryTrainingDetailsActivity.this, WypxDetalisActivity.class));
            }
        });
        LiteraryTrainingDetailsRecyclerRefresh.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                IsRresh =true;

                presenter.getWypxPageBeanData(wenyi_type, "1", "10", userId + "");
            }
        });
        LiteraryTrainingDetailsRecyclerRefresh.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                IsRresh =false;
                page++;
                presenter.getWypxPageBeanData(wenyi_type, page + "", "10", userId + "");
            }
        });
    }

    @Override
    protected void loadDate() {
        wenyi_type = (String) SPUtils.get(this, SPKey.WENYIPEIXUN_TYPE, "");
        userId = (Integer) SPUtils.get(this, SPKey.USER_ID, 0);
        presenter.getWypxPageBeanData(wenyi_type, page + "", "10", userId + "");

    }


    @OnClick(R.id.LiteraryTrainingDetails_ReturnButton)
    public void onViewClicked() {
        finish();
    }


    @Override
    public void showWypxPageBean(final WypxPageBean wypxPageBean) {
        if (wypxPageBean.getData() != null) {
            if (IsRresh) {
                schools.clear();
                schools.addAll(wypxPageBean.getData().getSchools());
                literaryTrainingDetailsRecyclerAdapter.notifyDataSetChanged();
                LiteraryTrainingDetailsRecyclerRefresh.finishRefresh();
            }else{
                schools.addAll(wypxPageBean.getData().getSchools());
                literaryTrainingDetailsRecyclerAdapter.notifyDataSetChanged();
                LiteraryTrainingDetailsRecyclerRefresh.finishLoadMore();
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
