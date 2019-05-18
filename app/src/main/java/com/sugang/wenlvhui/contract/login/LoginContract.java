package com.sugang.wenlvhui.contract.login;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.login.LoginBean;
import com.sugang.wenlvhui.model.bean.login.RegisterBean;

public interface LoginContract {
    interface LoginView {
        //注册
        void showLoginBean(LoginBean loginBean);

        //展示错误数据
        void showError(String string);

    }

    interface LoginPresenter extends BasePresenter<LoginView> {
        //注册
        void getLoginBean(String username,String password);


    }
}
