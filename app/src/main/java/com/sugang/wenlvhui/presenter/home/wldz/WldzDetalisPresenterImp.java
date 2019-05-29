package com.sugang.wenlvhui.presenter.home.wldz;

import com.sugang.wenlvhui.contract.home.wldz.WldzDetalisContract;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzArtistindexBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzDetalisBean;
import com.sugang.wenlvhui.model.service.home.wldz.WldzDetalisService;
import com.sugang.wenlvhui.model.service.home.wldz.WldzPageService;
import com.sugang.wenlvhui.model.service.home.wllx.WllxDetailsService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WldzDetalisPresenterImp implements WldzDetalisContract.WldzDetalisPresenter {
    WldzDetalisContract.WldzDetalisView view;

    @Override
    public void getWldzDetalisBean(String id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("id",id);
        RetrofitUtils.getInstance().getService(WldzDetalisService.class)
                .GetWldzDetalisBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WldzDetalisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WldzDetalisBean wldzDetalisBean) {
                        if (wldzDetalisBean.getMes() .equals("成功")) {
                            view.showWldzDetalisBean(wldzDetalisBean);
                        } else {
                            view.showError(wldzDetalisBean.getMes());
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
    public void actualView(WldzDetalisContract.WldzDetalisView wldzDetalisView) {
        this.view = wldzDetalisView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
