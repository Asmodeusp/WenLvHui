package com.sugang.wenlvhui.presenter.login;

import com.sugang.wenlvhui.contract.login.RegisterPhoneContract;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.model.bean.login.RegisterPhoneBean;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcXmggListService;
import com.sugang.wenlvhui.model.service.login.RegisterPhotoService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RegisterPhonePresenterImp implements RegisterPhoneContract.RegisterPhonePresenter {
    RegisterPhoneContract.RegisterPhoneView view;

    @Override
    public void getRegisterPhoneBean(String Phone) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("phone", Phone);
        RetrofitUtils.getInstance().getService(RegisterPhotoService.class)
                .GetRegisterPhoneBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RegisterPhoneBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RegisterPhoneBean wlzcXmggListBean) {
                        view.showRegisterPhoneBean(wlzcXmggListBean);
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
    public void actualView(RegisterPhoneContract.RegisterPhoneView registerPhoneView) {
        this.view = registerPhoneView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
