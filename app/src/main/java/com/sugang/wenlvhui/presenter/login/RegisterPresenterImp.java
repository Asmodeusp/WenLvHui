package com.sugang.wenlvhui.presenter.login;

import android.util.Log;

import com.sugang.wenlvhui.contract.login.RegisterContract;
import com.sugang.wenlvhui.model.bean.login.RegisterBean;
import com.sugang.wenlvhui.model.bean.login.RegisterPhoneBean;
import com.sugang.wenlvhui.model.service.login.RegisterPhotoService;
import com.sugang.wenlvhui.model.service.login.RegisterService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RegisterPresenterImp implements RegisterContract.RegisterPresenter {
    RegisterContract.RegisterView view;
    @Override
    public void getRegisterBean(String Phone, String password) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("phone", Phone);
        paramMap.put("password", password);
        RetrofitUtils.getInstance().getService(RegisterService.class)
                .GetRegisterBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RegisterBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RegisterBean registerBean) {

                        if (registerBean.getMsg().equals("注册成功")) {
                            view.showRegisterBean(registerBean);
                        }else{
                            view.showError(registerBean.getMsg());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void actualView(RegisterContract.RegisterView registerView) {
        this.view = registerView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
