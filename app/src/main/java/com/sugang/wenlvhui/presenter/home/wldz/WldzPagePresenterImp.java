package com.sugang.wenlvhui.presenter.home.wldz;


import com.sugang.wenlvhui.contract.home.wldz.WldzPageContract;
import com.sugang.wenlvhui.model.bean.home.hstj.BookTuijianBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzArtistindexBean;
import com.sugang.wenlvhui.model.service.home.hstj.HstjPageService;
import com.sugang.wenlvhui.model.service.home.wldz.WldzPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WldzPagePresenterImp implements WldzPageContract.WldzPagePresenter {
    WldzPageContract.WldzPageView view;

    @Override
    public void getWldzArtistindexBean(String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("page",page);
        RetrofitUtils.getInstance().getService(WldzPageService.class)
                .GetWldzArtistindexBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WldzArtistindexBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WldzArtistindexBean bookTuijianBean) {
                        if (bookTuijianBean.getMsg() .equals("成功")) {
                            view.showWldzArtistindexBean(bookTuijianBean);
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
    public void actualView(WldzPageContract.WldzPageView wldzPageView) {
        this.view = wldzPageView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
