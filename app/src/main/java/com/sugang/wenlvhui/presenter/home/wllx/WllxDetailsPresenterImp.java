package com.sugang.wenlvhui.presenter.home.wllx;

import com.sugang.wenlvhui.contract.home.wllx.WllxDetailsContract;
import com.sugang.wenlvhui.contract.home.wllx.WllxListContract;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;
import com.sugang.wenlvhui.model.service.home.wllx.WllxDetailsService;
import com.sugang.wenlvhui.model.service.home.wllx.WllxListService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WllxDetailsPresenterImp implements WllxDetailsContract.WllxDetailsPresenter {
    WllxDetailsContract.WllxDetailsView view;


    @Override
    public void actualView(WllxDetailsContract.WllxDetailsView wllxDetailsView) {
        this.view =wllxDetailsView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }

    @Override
    public void getWllxDetailsBean(String id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("id",id);

        RetrofitUtils.getInstance().getService(WllxDetailsService.class)
                .GetWllxDetalisBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WllxDetalisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WllxDetalisBean wlzcXmggListBean) {
                        if (wlzcXmggListBean.getMes() .equals("成功")) {
                            view.showWllxDetailsBeanBean(wlzcXmggListBean);
                        } else {
                            view.showError(wlzcXmggListBean.getMes());
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
}
