package com.sugang.wenlvhui.presenter.space;

import com.sugang.wenlvhui.contract.space.SpaceChangGuanContract;
import com.sugang.wenlvhui.model.bean.space.SpaceChangGuanBean;
import com.sugang.wenlvhui.model.service.space.SpaceChangGuanService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class SpaceChangGuanPresenterImp implements SpaceChangGuanContract.SpaceChangGuanPresenter {
    SpaceChangGuanContract.SpaceChangGuanView view;

    @Override
    public void getSpaceChangGuanBean(String space_detail_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("space_detail_id", space_detail_id);
        RetrofitUtils.getInstance().getService(SpaceChangGuanService.class)
                .getSpaceChangGuanBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SpaceChangGuanBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SpaceChangGuanBean loginBean) {
                        if (loginBean.getMsg().equals("成功")) {
                            view.showSpaceChangGuanBean(loginBean);
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
    public void actualView(SpaceChangGuanContract.SpaceChangGuanView spacePageView) {
        this.view = spacePageView;
    }

    @Override
    public void unActualView() {
        this.view = null ;
    }
}
