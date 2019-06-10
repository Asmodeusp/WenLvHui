package com.sugang.wenlvhui.presenter.home.wllx;

import com.sugang.wenlvhui.contract.home.wllx.WllxylyjListContract;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxylyjListBean;
import com.sugang.wenlvhui.model.service.home.wllx.WllxListService;
import com.sugang.wenlvhui.model.service.home.wllx.wllxylyjListService;
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
public class WllxylyjListPresenterImp implements WllxylyjListContract.WllxylyjListPresenter {
    WllxylyjListContract.WllxylyjListView view;
    @Override
    public void getWllxylyjListBean(String userid, String num, String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid",userid);
        paramMap.put("page",page);
        paramMap.put("num",num);
        RetrofitUtils.getInstance().getService(wllxylyjListService.class)
                .getWllxylyjListBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WllxylyjListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WllxylyjListBean wlzcXmggListBean) {
                        if (wlzcXmggListBean.getMes() .equals("成功")) {
                            view.showWllxylyjListBeanBean(wlzcXmggListBean);
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
    public void actualView(WllxylyjListContract.WllxylyjListView wllxylyjListView) {
            this.view = wllxylyjListView;
    }

    @Override
    public void unActualView() {
        this.view =null;
    }
}
