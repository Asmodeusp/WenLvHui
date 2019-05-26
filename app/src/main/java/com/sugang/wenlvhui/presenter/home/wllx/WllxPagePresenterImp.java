package com.sugang.wenlvhui.presenter.home.wllx;

import com.sugang.wenlvhui.contract.home.wllx.WllxPageContract;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxPageBean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.model.service.home.wllx.WllxPageService;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcXmggListService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WllxPagePresenterImp  implements WllxPageContract.WllxPagePresenter{
    WllxPageContract.WllxPageView view;
    @Override
    public void getWllxPageBean() {
        RetrofitUtils.getInstance().getService(WllxPageService.class)
                .GetWllxPageBean()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WllxPageBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WllxPageBean wlzcXmggListBean) {
                        if (wlzcXmggListBean.getMes() .equals("成功")) {
                            view.showWllxPageBeanBean(wlzcXmggListBean);
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
    public void actualView(WllxPageContract.WllxPageView wllxPageView) {
        this.view = wllxPageView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
