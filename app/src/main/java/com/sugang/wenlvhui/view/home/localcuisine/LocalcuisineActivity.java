package com.sugang.wenlvhui.view.home.localcuisine;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.dfms.DfmsPageContract;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantPageBean;
import com.sugang.wenlvhui.presenter.home.dfms.DfmsPagePresenterImp;
import com.sugang.wenlvhui.view.home.adapter.LocalcuisineBCRecyAdapter;
import com.sugang.wenlvhui.view.home.adapter.LocalcuisineTSRecyAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//地方美食
public class LocalcuisineActivity extends BaseActivity<DfmsPagePresenterImp> implements DfmsPageContract.DfmsPageView {


    @BindView(R.id.LocalcuisineReturnButton)
    AutoLinearLayout LocalcuisineReturnButton;
    @BindView(R.id.LocalcuisineQuyuButton)
    AutoLinearLayout LocalcuisineQuyuButton;
    @BindView(R.id.Localcuisine_SerchEd)
    TextView LocalcuisineSerchEd;
    @BindView(R.id.Localcuisine_BCRecy)
    RecyclerView LocalcuisineBCRecy;
    @BindView(R.id.Localcuisine_TSRecy)
    RecyclerView LocalcuisineTSRecy;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_localcuisine;
    }

    @Override
    protected void init() {


    }

    @Override
    protected void loadDate() {
        presenter.getRestaurantPageBean();
    }



    @OnClick({R.id.LocalcuisineReturnButton, R.id.LocalcuisineQuyuButton, R.id.Localcuisine_SerchEd})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.LocalcuisineReturnButton:
                finish();
                break;
            case R.id.LocalcuisineQuyuButton:
                break;
            case R.id.Localcuisine_SerchEd:
                break;
        }
    }

    @Override
    public void showRestaurantPageBean(RestaurantPageBean restaurantPageBean) {
        if (restaurantPageBean.getData()!=null) {
            LocalcuisineBCRecy.setLayoutManager(new LinearLayoutManager(this));
            LocalcuisineBCRecyAdapter localcuisineBCRecyAdapter = new LocalcuisineBCRecyAdapter(restaurantPageBean.getData().getBichi());
            LocalcuisineBCRecy.setAdapter(localcuisineBCRecyAdapter);
            localcuisineBCRecyAdapter.setRecyclerViewOnCLickListener(new LocalcuisineBCRecyAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {

                }
            });
            for (RestaurantPageBean.DataBean.TeseBean teseBean : restaurantPageBean.getData().getTese()) {
                for (RestaurantPageBean.DataBean.TeseBean.FoodListBean foodListBean : teseBean.getFoodList()) {
                    if (foodListBean.getImgOrVideo()==2) {
                        teseBean.setType(1);
                        break;
                    }
                }

            }

            LocalcuisineTSRecy.setLayoutManager(new LinearLayoutManager(this));
            LocalcuisineTSRecyAdapter localcuisineTSRecyAdapter = new LocalcuisineTSRecyAdapter(restaurantPageBean.getData().getTese(), this);
            LocalcuisineTSRecy.setAdapter(localcuisineTSRecyAdapter);
        }

    }

    @Override
    public void showError(String string) {

    }
}
