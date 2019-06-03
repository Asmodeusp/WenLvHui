package com.sugang.wenlvhui.contract.home.dfms;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantDetalisBean;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantPageBean;

public interface RestaurantDetalisContract {
    interface RestaurantDetalisView {
        //地方美食主页
        void showRestaurantDetalisBean(RestaurantDetalisBean restaurantDetalisBean);
        //展示错误数据
        void showError(String string);

        void ShowiSlike(IsLikeBean isLikeBean);
    }

    interface RestaurantDetalisPresenter extends BasePresenter<RestaurantDetalisView> {
        //推荐
        void getRestaurantDetalisBean(String restaurant_id);
        void iSlike(String userid,String textType,String textId);

    }
    
}
