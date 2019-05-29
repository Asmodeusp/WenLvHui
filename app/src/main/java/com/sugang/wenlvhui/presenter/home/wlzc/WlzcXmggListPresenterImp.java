package com.sugang.wenlvhui.presenter.home.wlzc;

import android.util.Log;

import com.sugang.wenlvhui.contract.home.wlze.WlzcXmggListContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcXmggListService;
import com.sugang.wenlvhui.model.service.other.IsLikeService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WlzcXmggListPresenterImp implements WlzcXmggListContract.WlzcXmggListPresenterImp {
    WlzcXmggListContract.WlzcXmggListView view;
    @Override
    public void getWlzcXmggListBeanData(String userId, String text_type,String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid",userId);
        paramMap.put("type",text_type);
        paramMap.put("page",page);
        paramMap.put("num","10");
        RetrofitUtils.getInstance().getService(WlzcXmggListService.class)
                .GetWlzcXmggListData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WlzcXmggListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WlzcXmggListBean wlzcXmggListBean) {
                        if (wlzcXmggListBean.getMes() .equals("成功")) {
                            view.showWlzcXmggListBean(wlzcXmggListBean);
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
    public void actualView(WlzcXmggListContract.WlzcXmggListView wlzcXmggListView) {
        this.view = wlzcXmggListView;
    }

    @Override
    public void unActualView() {
        this.view =null;
    }
}
