package com.sugang.wenlvhui.presenter.home.wllx;

import com.sugang.wenlvhui.contract.home.wllx.WllxFabuContract;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxfabuBean;
import com.sugang.wenlvhui.model.service.home.wllx.WllxListService;
import com.sugang.wenlvhui.model.service.home.wllx.WllxfabuService;
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
public class WllxFabuPresenterImp implements WllxFabuContract.WllxFabuPresenter {
    WllxFabuContract.WllxFabuView view;

    @Override
    public void getWllxFabuBean(String userid, String content) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid",userid);
        paramMap.put("content",content);
        RetrofitUtils.getInstance().getService(WllxfabuService.class)
                .getWllxfabuBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WllxfabuBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WllxfabuBean wlzcXmggListBean) {
                        if (wlzcXmggListBean.getMes() .equals("成功")) {
                            view.showWllxFabuBeanBean(wlzcXmggListBean);
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
    public void actualView(WllxFabuContract.WllxFabuView wllxFabuView) {
        this.view = wllxFabuView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
