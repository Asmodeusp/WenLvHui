package com.sugang.wenlvhui.contract.home.wldz;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxDetalisBean;

public interface WldzDetalisContract {
    interface WldzDetalisView {

        //文旅定制主页
        void showWldzDetalisBean(WldzDetalisBean wllxDetalisBean);

        //展示错误数据
        void showError(String string);

    }

    interface WldzDetalisPresenter extends BasePresenter<WldzDetalisContract.WldzDetalisView> {


        //猜你喜欢
        void getWldzDetalisBean(String id);
    }
}
