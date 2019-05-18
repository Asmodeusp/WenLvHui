package com.sugang.wenlvhui.contract.login;


import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.login.RegisterPhoneBean;

public interface RegisterPhoneContract {
    interface RegisterPhoneView {
        //验证手机号是否注册
        void showRegisterPhoneBean(RegisterPhoneBean bookTuijianBean);

        //展示错误数据
        void showError(String string);

    }

    interface RegisterPhonePresenter extends BasePresenter<RegisterPhoneView> {
        //验证手机号是否注册
        void getRegisterPhoneBean(String Phone);


    }
}
