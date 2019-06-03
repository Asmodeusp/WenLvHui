package com.sugang.wenlvhui.presenter.activity;

import com.sugang.wenlvhui.contract.activity.ActivityPageContract;
import com.sugang.wenlvhui.model.bean.activity.ActivityDetailsBean;
import com.sugang.wenlvhui.model.bean.activity.ActivityListBean;
import com.sugang.wenlvhui.model.bean.activity.ActivityPageBean;
import com.sugang.wenlvhui.model.service.activity.ActivityDetalisService;
import com.sugang.wenlvhui.model.service.activity.ActivityListService;
import com.sugang.wenlvhui.model.service.activity.ActivityPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ActivityPagePresenterImp implements ActivityPageContract.ActivityPagePresenter {
   ActivityPageContract.ActivityPageView view;

    @Override
    public void actualView(ActivityPageContract.ActivityPageView activityPageView) {
        this.view =activityPageView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }

    @Override
    public void getActivityListBean(String type, String status, String intel, String userid, String page, String num) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("type",type);
        paramMap.put("status",status);
        paramMap.put("intel",intel);
        paramMap.put("userid",userid);
        paramMap.put("page",page);
        paramMap.put("num",num);
        RetrofitUtils.getInstance().getService(ActivityListService.class)
                .getActivityListBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ActivityListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ActivityListBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMes() .equals("成功")) {
                            view.showActivityListBean(wenlvzhengcebean);
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
    public void getActivityPageBean(String userid) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid",userid);
        RetrofitUtils.getInstance().getService(ActivityPageService.class)
                .getActivityPageBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ActivityPageBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ActivityPageBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMes() .equals("成功")) {
                            view.showActivityPageBean(wenlvzhengcebean);
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
}
