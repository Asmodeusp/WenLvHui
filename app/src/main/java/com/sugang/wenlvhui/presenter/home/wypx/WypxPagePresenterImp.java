package com.sugang.wenlvhui.presenter.home.wypx;

import android.util.Log;

import com.sugang.wenlvhui.contract.home.wypx.WypxPageContract;
import com.sugang.wenlvhui.model.bean.home.wlze.Wenlvzhengcebean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxPageBean;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcpageService;
import com.sugang.wenlvhui.model.service.home.wypx.WypxPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WypxPagePresenterImp implements WypxPageContract.WypxPagePresenter {
    WypxPageContract.WypxPageView view;
    @Override
    public void getWypxPageBeanData(String type, String page, String num, String userid) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid",userid);
        paramMap.put("type",type);
        paramMap.put("page",page);
        paramMap.put("num",num);
        RetrofitUtils.getInstance().getService(WypxPageService.class)
                .GetWypxPageBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WypxPageBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WypxPageBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMes() .equals("成功")) {
                            view.showWypxPageBean(wenlvzhengcebean);
                        } else {
                            view.showError(wenlvzhengcebean.getMes());
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
    public void actualView(WypxPageContract.WypxPageView wypxPageView) {
            this.view = wypxPageView;
    }

    @Override
    public void unActualView() {
        this.view = null;

    }
}
