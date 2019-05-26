package com.sugang.wenlvhui.contract.home.wypx;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxDetalisBean;

public interface WypxDetalisContract {
    interface  WypxDetalisView{
        //文旅政策主页
        void showWypxDetalisBean(WypxDetalisBean WypxDetalisBean);
        //        展示错误数据
        void showError(String string);

    }
    interface  WypxDetalisPresenter extends BasePresenter<WypxDetalisView> {
        //文旅政策主页
        void getWypxDetalisBeanData(String id);

    }
}
