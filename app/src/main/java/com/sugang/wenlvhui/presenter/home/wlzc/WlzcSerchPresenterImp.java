package com.sugang.wenlvhui.presenter.home.wlzc;

import com.sugang.wenlvhui.contract.home.wlze.WlzcSerchContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewSerchBean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcSerchService;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcXmggListService;
import com.sugang.wenlvhui.model.service.other.IsLikeService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WlzcSerchPresenterImp implements WlzcSerchContract.WlzcSerchPresenter {
    WlzcSerchContract.WlzcSerchView view;

    @Override
    public void getWlzcSerchBeanData(String userId, String key, String page, String num) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid",userId);
        paramMap.put("key",key);
        paramMap.put("page",page);
        paramMap.put("num",num);
        RetrofitUtils.getInstance().getService(WlzcSerchService.class)
                .GeWldzSerchBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NewSerchBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(NewSerchBean wlzcXmggListBean) {
                        if (wlzcXmggListBean.getMes() .equals("成功")) {
                            view.showWlzcSerchBean(wlzcXmggListBean);
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
    public void actualView(WlzcSerchContract.WlzcSerchView wlzcSerchView) {
        this.view = wlzcSerchView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
