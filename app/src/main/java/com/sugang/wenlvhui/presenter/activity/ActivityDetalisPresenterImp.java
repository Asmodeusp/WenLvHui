package com.sugang.wenlvhui.presenter.activity;

import com.sugang.wenlvhui.contract.activity.ActivityDetalisContract;
import com.sugang.wenlvhui.model.bean.activity.ActivityDetailsBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.model.service.activity.ActivityDetalisService;
import com.sugang.wenlvhui.model.service.home.wcfy.JiangRenPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ActivityDetalisPresenterImp implements ActivityDetalisContract.ActivityDetalisPresenter {
    ActivityDetalisContract.ActivityDetalisView view;
    @Override
    public void getActivityDetailsBean(String id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("id",id);
        RetrofitUtils.getInstance().getService(ActivityDetalisService.class)
                .GetActivityDetailsBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ActivityDetailsBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ActivityDetailsBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMes() .equals("成功")) {
                            view.showActivityDetailsBean(wenlvzhengcebean);
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
    public void actualView(ActivityDetalisContract.ActivityDetalisView activityDetalisView) {
        this.view = activityDetalisView;
    }

    @Override
    public void unActualView() {
            this.view = null;
    }
}
