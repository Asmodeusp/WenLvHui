package com.sugang.wenlvhui.contract.home.dfms;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.dfms.FoodDetalisBean;

public interface FoodDetalisContract {
    interface FoodDetalisView {
        //地方美食主页
        void showRestaurantDetalisBean(FoodDetalisBean foodDetalisBean);
        //展示错误数据
        void showError(String string);

    }

    interface FoodDetalisPresenter extends BasePresenter<FoodDetalisContract.FoodDetalisView> {
        //推荐
        void getFoodDetalisBean(String food_id);


    }
}
