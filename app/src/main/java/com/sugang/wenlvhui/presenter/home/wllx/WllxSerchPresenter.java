package com.sugang.wenlvhui.presenter.home.wllx;

import com.sugang.wenlvhui.contract.home.wllx.WllxDetailsContract;
import com.sugang.wenlvhui.contract.home.wllx.WllxSerchContract;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxSerchBean;
import com.sugang.wenlvhui.model.service.home.wllx.WllxListService;
import com.sugang.wenlvhui.model.service.home.wllx.WllxSerchService;
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
public class WllxSerchPresenter implements WllxSerchContract.WllxSerchPresenter {
    WllxSerchContract.WllxSerchView view;



    @Override
    public void actualView(WllxSerchContract.WllxSerchView wllxSerchView) {
        this.view =wllxSerchView;
    }

    @Override
    public void unActualView() {
        this.view =null;

    }

    @Override
    public void getWllxSerchBean(String key, String num, String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("key",key);
        paramMap.put("page",page);
        paramMap.put("num",num);
        RetrofitUtils.getInstance().getService(WllxSerchService.class)
                .getWllxSerchBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WllxSerchBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WllxSerchBean wlzcXmggListBean) {
                        if (wlzcXmggListBean.getMes() .equals("成功")) {
                            view.showWllxSerchBeanBean(wlzcXmggListBean);
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
}
