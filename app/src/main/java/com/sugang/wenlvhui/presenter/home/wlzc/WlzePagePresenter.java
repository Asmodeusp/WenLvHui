package com.sugang.wenlvhui.presenter.home.wlzc;

import android.util.Log;

import com.sugang.wenlvhui.contract.home.wlze.WlzePageContract;
import com.sugang.wenlvhui.model.bean.home.wlze.Wenlvzhengcebean;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcpageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WlzePagePresenter implements WlzePageContract.WlzePagePresenter {
    WlzePageContract.WlzePageView view;

    @Override
    public void getWenlvzhengcebeanData(String userId) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("user_id",userId);
        RetrofitUtils.getInstance().getService(WlzcpageService.class)
                .GetWenlvPageData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Wenlvzhengcebean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Wenlvzhengcebean wenlvzhengcebean) {
                        Log.d("WlzePagePresenter", wenlvzhengcebean.getMsg());
                        if (wenlvzhengcebean.getMsg() .equals("成功")) {
                            view.showWenlvzhengcebean(wenlvzhengcebean);
                        } else {
                            view.showError(wenlvzhengcebean.getMsg());
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
    public void actualView(WlzePageContract.WlzePageView wlzePageView) {
        this.view = wlzePageView;

    }

    @Override
    public void unActualView() {
        this.view = null;

    }
}
