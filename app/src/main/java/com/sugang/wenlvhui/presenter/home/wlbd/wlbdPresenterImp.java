package com.sugang.wenlvhui.presenter.home.wlbd;

import com.sugang.wenlvhui.contract.home.wlbd.WlbdContract;
import com.sugang.wenlvhui.model.bean.home.wlbd.WlbdHsBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzDetalisBean;
import com.sugang.wenlvhui.model.service.home.wlbd.WlbdService;
import com.sugang.wenlvhui.model.service.home.wldz.WldzDetalisService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

//
/* Created by $USER_NAME on 2019/6/11.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class wlbdPresenterImp implements WlbdContract.wlbdPresenter {
    WlbdContract.WlbdView view;
    @Override
    public void getWlbdBean(String type_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("type_id",type_id);
        RetrofitUtils.getInstance().getService(WlbdService.class)
                .getWlbdHsBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WlbdHsBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WlbdHsBean wldzDetalisBean) {
                        if (wldzDetalisBean.getMsg() .equals("成功")) {
                            view.showWlbdHsBean(wldzDetalisBean);
                        } else {
                            view.showError(wldzDetalisBean.getMsg());
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
    public void actualView(WlbdContract.WlbdView wlbdView) {
        this.view =wlbdView;
    }

    @Override
    public void unActualView() {
        this.view =null;
    }
}
