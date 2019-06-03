package com.sugang.wenlvhui.presenter.space;

import com.sugang.wenlvhui.contract.space.SpaceDongTaiContract;
import com.sugang.wenlvhui.model.bean.space.SpaceDongTaiBean;
import com.sugang.wenlvhui.model.service.space.SpaceDongTaiService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class SpaceDongTaiPresenterImp implements SpaceDongTaiContract.SpaceDongTaiPresenter {
    SpaceDongTaiContract.SpaceDongTaiView view;

    @Override
    public void getSpaceDongTaiBean(String space_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("space_id", space_id);
        RetrofitUtils.getInstance().getService(SpaceDongTaiService.class)
                .getSpaceDongTaiBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SpaceDongTaiBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SpaceDongTaiBean loginBean) {
                        if (loginBean.getMsg().equals("成功")) {
                            view.showSpaceDongTaiBean(loginBean);
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
    public void actualView(SpaceDongTaiContract.SpaceDongTaiView spacePageView) {
        this.view = spacePageView;
    }

    @Override
    public void unActualView() {
        this.view = null ;
    }
}
