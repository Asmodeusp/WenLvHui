package com.sugang.wenlvhui.presenter.home.wllx;

import com.sugang.wenlvhui.contract.home.wllx.WllxListContract;
import com.sugang.wenlvhui.contract.home.wllx.WllxPageContract;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.model.service.home.wllx.WllxListService;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcXmggListService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WllxListPresenterImp implements WllxListContract.WllxListPresenter {
    WllxListContract.WllxListView view;

    @Override
    public void getWllxListBean(String type, String page, String num) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("type",type);
        paramMap.put("page",page);
        paramMap.put("num",num);
        RetrofitUtils.getInstance().getService(WllxListService.class)
                .GetWllxListBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WllxListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WllxListBean wlzcXmggListBean) {
                        if (wlzcXmggListBean.getMes() .equals("成功")) {
                            view.showWllxListBeanBean(wlzcXmggListBean);
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

    @Override
    public void actualView(WllxListContract.WllxListView wllxListView) {
        this.view = wllxListView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
