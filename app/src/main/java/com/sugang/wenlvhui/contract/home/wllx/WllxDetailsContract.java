package com.sugang.wenlvhui.contract.home.wllx;

import com.sugang.wenlvhui.base.BasePresenter;

import com.sugang.wenlvhui.model.bean.home.wllx.WllxDetalisBean;

public interface WllxDetailsContract {
    interface WllxDetailsView {


        void showWllxDetailsBeanBean(WllxDetalisBean WllxDetailsBeanBean);

        //展示错误数据
        void showError(String string);

    }

    interface WllxDetailsPresenter extends BasePresenter<WllxDetailsContract.WllxDetailsView> {

        void getWllxDetailsBean(String id);
    }
}
