package com.sugang.wenlvhui.presenter.home.wcfy;

import com.sugang.wenlvhui.contract.home.wcfy.JiangrenDetalisContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.model.service.home.wcfy.JiangRenDetailsService;
import com.sugang.wenlvhui.model.service.home.wcfy.JiangRenPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class JiangrenDetalisPresenterImp implements JiangrenDetalisContract.JiangRenDetalisBeanPresenter {
    JiangrenDetalisContract.JiangrenDetalisView view;
    @Override
    public void getJiangrenDetalisBean(String user_id, String shops_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("user_id",user_id);
        paramMap.put("shops_id",shops_id);
        RetrofitUtils.getInstance().getService(JiangRenDetailsService.class)
                .GetJiangRenDetalisBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<JiangRenDetalisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(JiangRenDetalisBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMsg() .equals("成功")) {
                            view.showJiangRenDetalisBean(wenlvzhengcebean);
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
    public void actualView(JiangrenDetalisContract.JiangrenDetalisView jiangrenDetalisView) {
        this.view = jiangrenDetalisView;
    }

    @Override
    public void unActualView() {
        this.view = null;

    }
}
