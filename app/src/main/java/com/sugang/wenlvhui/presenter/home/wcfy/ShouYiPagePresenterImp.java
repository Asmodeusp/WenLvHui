package com.sugang.wenlvhui.presenter.home.wcfy;

import android.util.Log;

import com.sugang.wenlvhui.contract.home.wcfy.ShouYiPageContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiPageBean;
import com.sugang.wenlvhui.model.service.home.wcfy.JiangRenPageService;
import com.sugang.wenlvhui.model.service.home.wcfy.ShouYiPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ShouYiPagePresenterImp implements ShouYiPageContract.ShouYiPagePresenter {
    ShouYiPageContract.ShouYiPageView view;
    @Override
    public void getShouYiPageBean(String user_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("user_id",user_id);
        RetrofitUtils.getInstance().getService(ShouYiPageService.class)
                .GetShouYiPageBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShouYiPageBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ShouYiPageBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMsg() .equals("成功")) {
                            view.showShouYiPageBean(wenlvzhengcebean);
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
    public void actualView(ShouYiPageContract.ShouYiPageView shouYiPageView) {
        this.view =shouYiPageView;
    }

    @Override
    public void unActualView() {
        this.view =null;
    }
}
