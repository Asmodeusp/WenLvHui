package com.sugang.wenlvhui.presenter.home.dfms;

import com.sugang.wenlvhui.contract.home.dfms.DfmsPageContract;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantPageBean;
import com.sugang.wenlvhui.model.bean.home.hstj.BookTuijianBean;
import com.sugang.wenlvhui.model.service.home.dfms.DfmsPageService;
import com.sugang.wenlvhui.model.service.home.hstj.HstjPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class DfmsPagePresenterImp  implements DfmsPageContract.DfmsPagePresenter {
    DfmsPageContract.DfmsPageView view;
    @Override
    public void getRestaurantPageBean() {
        RetrofitUtils.getInstance().getService(DfmsPageService.class)
                .GetRestaurantPageData()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RestaurantPageBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RestaurantPageBean bookTuijianBean) {
                        if (bookTuijianBean.getMsg() .equals("成功")) {
                            view.showRestaurantPageBean(bookTuijianBean);
                        } else {
                            view.showError(bookTuijianBean.getMsg());
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
    public void actualView(DfmsPageContract.DfmsPageView dfmsPageView) {
       this. view = dfmsPageView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
