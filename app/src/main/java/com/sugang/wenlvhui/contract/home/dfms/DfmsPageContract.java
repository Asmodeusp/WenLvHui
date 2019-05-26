package com.sugang.wenlvhui.contract.home.dfms;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantPageBean;


public interface DfmsPageContract {
    interface DfmsPageView {
        //地方美食主页
        void showRestaurantPageBean(RestaurantPageBean restaurantPageBean);
        //展示错误数据
        void showError(String string);

    }

    interface DfmsPagePresenter extends BasePresenter<DfmsPageView> {
        //推荐
        void getRestaurantPageBean();

    }
}
