package com.sugang.wenlvhui.presenter.home.wypx;

import com.sugang.wenlvhui.contract.home.wypx.WypxDetalisContract;
import com.sugang.wenlvhui.contract.home.wypx.WypxPageContract;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxPageBean;
import com.sugang.wenlvhui.model.service.home.wypx.WypxDetalisService;
import com.sugang.wenlvhui.model.service.home.wypx.WypxPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WypxDetalisPresenterImp implements WypxDetalisContract.WypxDetalisPresenter {
    WypxDetalisContract.WypxDetalisView view;

    @Override
    public void getWypxDetalisBeanData(String id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("id", id);

        RetrofitUtils.getInstance().getService(WypxDetalisService.class)
                .GetWypxDetalisBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WypxDetalisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WypxDetalisBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMes().equals("成功")) {
                            view.showWypxDetalisBean(wenlvzhengcebean);
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
    public void actualView(WypxDetalisContract.WypxDetalisView wypxDetalisView) {
        this.view =wypxDetalisView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
