package com.sugang.wenlvhui.presenter.login;

import android.util.Log;

import com.sugang.wenlvhui.contract.login.LoginContract;
import com.sugang.wenlvhui.model.bean.login.LoginBean;
import com.sugang.wenlvhui.model.bean.login.RegisterPhoneBean;
import com.sugang.wenlvhui.model.service.login.LoginService;
import com.sugang.wenlvhui.model.service.login.RegisterPhotoService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenterImp implements LoginContract.LoginPresenter {
    LoginContract.LoginView view;

    @Override
    public void getLoginBean(String username, String password) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("username", username);
        paramMap.put("password", password);
        RetrofitUtils.getInstance().getService(LoginService.class)
                .GetLoginBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {

                        view.showLoginBean(loginBean);
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
    public void actualView(LoginContract.LoginView loginView) {
        this.view = loginView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
