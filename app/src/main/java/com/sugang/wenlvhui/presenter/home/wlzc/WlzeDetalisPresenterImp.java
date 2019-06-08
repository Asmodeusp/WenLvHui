package com.sugang.wenlvhui.presenter.home.wlzc;

import android.util.Log;

import com.sugang.wenlvhui.contract.home.wlze.WlzeDetalisContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsDetalisBean;
import com.sugang.wenlvhui.model.service.home.wllx.WllxDetailsService;
import com.sugang.wenlvhui.model.service.home.wlze.NewsDetalisService;
import com.sugang.wenlvhui.model.service.other.IsLikeService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WlzeDetalisPresenterImp implements WlzeDetalisContract.WlzeDetalisPresenter {
    WlzeDetalisContract.WlzeDetalisView view;
    @Override
    public void getNewsDetalisBeanData(String userid, String id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid",userid);
        paramMap.put("id",id);

        RetrofitUtils.getInstance().getService(NewsDetalisService.class)
                .GetNewsDetalisBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NewsDetalisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }
                    @Override
                    public void onNext(NewsDetalisBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMes() .equals("成功")) {
                            view.showNewsDetalisBean(wenlvzhengcebean);
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
    public void iSlike(String userid, String textType, String textId) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid",userid);
        paramMap.put("textType",textType);
        paramMap.put("textId",textId);
        RetrofitUtils.getInstance().getService(IsLikeService.class)
                .GetIsLikeBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<IsLikeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }
                    @Override
                    public void onNext(IsLikeBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMes() .equals("成功")) {
                            view.ShowiSlike(wenlvzhengcebean);
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
    public void actualView(WlzeDetalisContract.WlzeDetalisView wlzeDetalisView) {
        this.view = wlzeDetalisView;
    }

    @Override
    public void unActualView() {
        this.view= null;
    }
}
