package com.sugang.wenlvhui.contract.home.wllx;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxPageBean;

public interface WllxPageContract {
    interface WllxPageView {


        void showWllxPageBeanBean(WllxPageBean wllxPageBeanBean);

        //展示错误数据
        void showError(String string);

    }

    interface WllxPagePresenter extends BasePresenter<WllxPageContract.WllxPageView> {


        void getWllxPageBean();
    }
}
