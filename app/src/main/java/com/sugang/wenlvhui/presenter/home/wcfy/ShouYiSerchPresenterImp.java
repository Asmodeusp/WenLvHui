package com.sugang.wenlvhui.presenter.home.wcfy;

import android.util.Log;

import com.sugang.wenlvhui.contract.home.wcfy.ShouYiSerchContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiSerchBean;
import com.sugang.wenlvhui.model.service.home.wcfy.ShouYiDetalisService;
import com.sugang.wenlvhui.model.service.home.wcfy.ShouYiSerchService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

//
/* Created by $USER_NAME on 2019/6/9.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class ShouYiSerchPresenterImp implements ShouYiSerchContract.ShouYiSerchPresenter {
    ShouYiSerchContract.ShouYiSerchView view;
    @Override
    public void getShouYiSerchBean(String page, String name_detail) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("page",page);
        paramMap.put("name_detail",name_detail);
        RetrofitUtils.getInstance().getService(ShouYiSerchService.class)
                .getShouYiSerchBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShouYiSerchBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ShouYiSerchBean shouYiSerchBean) {
                        if (shouYiSerchBean.getMsg() .equals("成功")) {
                            view.showShouYiSerchBean(shouYiSerchBean);
                        } else {
                            view.showError(shouYiSerchBean.getMsg());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("ShouYiSerchPresenterImp", e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void actualView(ShouYiSerchContract.ShouYiSerchView shouYiSerchView) {
        this.view =shouYiSerchView;
    }

    @Override
    public void unActualView() {
        this.view =null;
    }
}
