package com.sugang.wenlvhui.presenter.space;

import com.sugang.wenlvhui.contract.space.SpaceGuanCangContract;
import com.sugang.wenlvhui.model.bean.space.SpaceGuanCangBean;
import com.sugang.wenlvhui.model.service.space.SpaceGuanCangService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class SpaceGuanCangPresenterImp implements SpaceGuanCangContract.SpaceGuanCangPresenter {
    SpaceGuanCangContract.SpaceGuanCangView view;

    @Override
    public void getSpaceGuanCangBean(String space_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("space_id", space_id);
        RetrofitUtils.getInstance().getService(SpaceGuanCangService.class)
                .getSpaceGuanCangBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SpaceGuanCangBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SpaceGuanCangBean loginBean) {
                        if (loginBean.getMsg().equals("成功")) {
                            view.showSpaceGuanCangBean(loginBean);
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
    public void actualView(SpaceGuanCangContract.SpaceGuanCangView spacePageView) {
        this.view = spacePageView;
    }

    @Override
    public void unActualView() {
        this.view = null ;
    }
}
