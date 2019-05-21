package com.sugang.wenlvhui.presenter.home.wcfy;

import android.util.Log;

import com.sugang.wenlvhui.contract.home.wcfy.JiangRenPageContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.model.service.home.wcfy.JiangRenPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class JiangRenPagePresenterImp implements JiangRenPageContract.JiangRenPagePresenter {
    JiangRenPageContract.JiangRenPageView view;
    @Override
    public void getJiangRenPageBean(String user_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("user_id",user_id);
        RetrofitUtils.getInstance().getService(JiangRenPageService.class)
                .GetJiangRenPageBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<JiangRenPageBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(JiangRenPageBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMsg() .equals("成功")) {
                            view.showJiangRenPageBean(wenlvzhengcebean);
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
    public void actualView(JiangRenPageContract.JiangRenPageView jiangRenPageView) {
        this.view = jiangRenPageView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
