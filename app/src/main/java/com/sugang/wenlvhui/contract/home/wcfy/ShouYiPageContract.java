package com.sugang.wenlvhui.contract.home.wcfy;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiPageBean;

public interface ShouYiPageContract {
    interface ShouYiPageView {

        //文旅定制主页
        void showShouYiPageBean(ShouYiPageBean shouYiPageBean);

        //展示错误数据
        void showError(String string);

    }

    interface ShouYiPagePresenter extends BasePresenter<ShouYiPageView> {
        //猜你喜欢
        void getShouYiPageBean(String user_id);
    }
}
