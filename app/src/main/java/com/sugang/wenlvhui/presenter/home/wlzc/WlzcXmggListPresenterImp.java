package com.sugang.wenlvhui.presenter.home.wlzc;

import com.sugang.wenlvhui.contract.home.wlze.WlzcXmggListContract;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcXmggListService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WlzcXmggListPresenterImp implements WlzcXmggListContract.WlzcXmggListViewPresenterImp {
    WlzcXmggListContract.WlzcXmggListView view;
    @Override
    public void getWlzcXmggListBeanData(String userId, String text_type) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("user_id",userId);
        paramMap.put("text_type",text_type);
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
                        if (wlzcXmggListBean.getMsg() .equals("成功")) {
                            view.showWlzcXmggListBean(wlzcXmggListBean);
                        } else {
                            view.showError(wlzcXmggListBean.getMsg());
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
