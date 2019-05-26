package com.sugang.wenlvhui.contract.home.wllx;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;

public interface WllxListContract {
    interface WllxListView {


        void showWllxListBeanBean(WllxListBean WllxListBeanBean);

        //展示错误数据
        void showError(String string);

    }

    interface WllxListPresenter extends BasePresenter<WllxListContract.WllxListView> {


        void getWllxListBean(String type, String page, String num);
    }
}
