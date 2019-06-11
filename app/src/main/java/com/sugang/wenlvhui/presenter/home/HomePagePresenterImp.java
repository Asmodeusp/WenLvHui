package com.sugang.wenlvhui.presenter.home;

import android.util.Log;

import com.sugang.wenlvhui.contract.home.HomePageContracr;
import com.sugang.wenlvhui.model.bean.home.HomePageBean;
import com.sugang.wenlvhui.model.bean.home.wlze.Wenlvzhengcebean;
import com.sugang.wenlvhui.model.service.home.HomePageService;
import com.sugang.wenlvhui.model.service.home.wlze.WlzcpageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

//
/* Created by $USER_NAME on 2019/6/10.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class HomePagePresenterImp implements HomePageContracr.HomePagePresenter {
    HomePageContracr.HomePageView view;

    @Override
    public void getHomePageBeanData() {
        RetrofitUtils.getInstance().getService(HomePageService.class)
                .getHomePageBean()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomePageBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomePageBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMsg().equals("成功")) {
                            view.showHomePageBean(wenlvzhengcebean);
                        } else {
                            view.showError(wenlvzhengcebean.getMsg());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("HomePagePresenterImp", e.toString());

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void actualView(HomePageContracr.HomePageView homePageView) {
        this.view = homePageView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
