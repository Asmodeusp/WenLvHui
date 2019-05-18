package com.sugang.wenlvhui.contract.login;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.login.RegisterBean;
import com.sugang.wenlvhui.model.bean.login.RegisterPhoneBean;

public interface RegisterContract {
    interface RegisterView {
        //注册
        void showRegisterBean(RegisterBean registerBean);

        //展示错误数据
        void showError(String string);

    }

    interface RegisterPresenter extends BasePresenter<RegisterView> {
        //注册
        void getRegisterBean(String Phone,String password);


    }
}
