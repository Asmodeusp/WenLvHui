package com.sugang.wenlvhui.contract.home.wldz;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzSerchBean;

public interface WldzSerchContract {
    interface WldzSerchView {

        //文旅定制主页
        void showWldzSerchBean(WldzSerchBean wllxDetalisBean);

        //展示错误数据
        void showError(String string);

    }

    interface WldzSerchPresenter extends BasePresenter<WldzSerchContract.WldzSerchView> {


        //猜你喜欢
        void getWldzSerchBean(String key,String page);
    }
}
