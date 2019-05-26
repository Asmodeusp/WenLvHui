package com.sugang.wenlvhui.view.home.literarytraining;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wypx.WypxPageContract;
import com.sugang.wenlvhui.contract.home.wypx.WypxPageContract.WypxPageView;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxPageBean;
import com.sugang.wenlvhui.presenter.home.wypx.WypxPagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.LiteraryTrainingDetailsRecyclerAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class LiteraryTrainingDetailsActivity extends BaseActivity<WypxPagePresenterImp>implements WypxPageContract.WypxPageView {


    @BindView(R.id.LiteraryTrainingDetails_ReturnButton)
    AutoLinearLayout LiteraryTrainingDetailsReturnButton;
    @BindView(R.id.LiteraryTrainingDetails_HeadText)
    TextView LiteraryTrainingDetailsHeadText;
    @BindView(R.id.LiteraryTrainingDetailsRecycler)
    RecyclerView LiteraryTrainingDetailsRecycler;
    private String wenyi_type;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_literary_training_details;
    }

    @Override
    protected void init() {
        LiteraryTrainingDetailsHeadText.setText(wenyi_type);
    }

    @Override
    protected void loadDate() {
        wenyi_type = (String) SPUtils.get(this, SPKey.WENYIPEIXUN_TYPE, "");
        Integer userId = (Integer) SPUtils.get(this, SPKey.USER_ID, 0);
        presenter.getWypxPageBeanData(wenyi_type,"1","10",userId+"");
    }


    @OnClick(R.id.LiteraryTrainingDetails_ReturnButton)
    public void onViewClicked() {
        finish();
    }


    @Override
    public void showWypxPageBean(final WypxPageBean wypxPageBean) {
        if (wypxPageBean.getData()!=null) {
            LiteraryTrainingDetailsRecycler.setLayoutManager(new LinearLayoutManager(this));
            LiteraryTrainingDetailsRecyclerAdapter literaryTrainingDetailsRecyclerAdapter = new LiteraryTrainingDetailsRecyclerAdapter(wypxPageBean.getData().getSchools());
            LiteraryTrainingDetailsRecycler.setAdapter(literaryTrainingDetailsRecyclerAdapter);
            literaryTrainingDetailsRecyclerAdapter.setRecyclerViewOnCLickListener(new LiteraryTrainingDetailsRecyclerAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(LiteraryTrainingDetailsActivity.this,SPKey.SCHOOL_ID,wypxPageBean.getData().getSchools().get(position).getId());
                    startActivity(new Intent(LiteraryTrainingDetailsActivity.this,WypxDetalisActivity.class));
                }
            });

        }

    }

    @Override
    public void showError(String string) {

    }
}
