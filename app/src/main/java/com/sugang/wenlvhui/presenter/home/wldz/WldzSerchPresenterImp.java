package com.sugang.wenlvhui.presenter.home.wldz;

import com.sugang.wenlvhui.contract.home.wldz.WldzSerchContract;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzSerchBean;
import com.sugang.wenlvhui.model.service.home.wldz.WldzDetalisService;
import com.sugang.wenlvhui.model.service.home.wldz.WldzSerchService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WldzSerchPresenterImp implements WldzSerchContract.WldzSerchPresenter {
    WldzSerchContract.WldzSerchView view;
    @Override
    public void getWldzSerchBean(String key, String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("key",key);
        paramMap.put("page",page);
        paramMap.put("num","10");
        RetrofitUtils.getInstance().getService(WldzSerchService.class)
                .GetWldzSerchBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WldzSerchBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WldzSerchBean wldzDetalisBean) {
                        if (wldzDetalisBean.getMes() .equals("成功")) {
                            view.showWldzSerchBean(wldzDetalisBean);
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
    public void actualView(WldzSerchContract.WldzSerchView wldzSerchView) {
        this.view =wldzSerchView;
    }

    @Override
    public void unActualView() {
        this.view =null;
    }
}
