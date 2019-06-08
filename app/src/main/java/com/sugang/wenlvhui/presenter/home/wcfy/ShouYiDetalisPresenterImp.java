package com.sugang.wenlvhui.presenter.home.wcfy;

import com.sugang.wenlvhui.contract.home.wcfy.ShouYiDetalisContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiDetalisBean;
import com.sugang.wenlvhui.model.service.home.wcfy.JiangRenPageService;
import com.sugang.wenlvhui.model.service.home.wcfy.ShouYiDetalisService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

//
/* Created by $USER_NAME on 2019/6/8.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class ShouYiDetalisPresenterImp implements ShouYiDetalisContract.ShouYiDetalisPresenter {
    ShouYiDetalisContract.ShouYiDetalisView view;

    @Override
    public void getShouYiDetalisBean(String product_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("product_id",product_id);
        RetrofitUtils.getInstance().getService(ShouYiDetalisService.class)
                .getShouYiDetalisBeanData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShouYiDetalisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ShouYiDetalisBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMsg() .equals("成功")) {
                            view.showShouYiDetalisBean(wenlvzhengcebean);
                        } else {
                            view.showError(wenlvzhengcebean.getMsg());
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
    public void actualView(ShouYiDetalisContract.ShouYiDetalisView shouYiDetalisView) {
        this.view = shouYiDetalisView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
