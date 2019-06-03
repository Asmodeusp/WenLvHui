package com.sugang.wenlvhui.presenter.space;

import com.sugang.wenlvhui.contract.space.SpacePageContract;
import com.sugang.wenlvhui.model.bean.login.LoginBean;
import com.sugang.wenlvhui.model.bean.space.SpacePageBean;
import com.sugang.wenlvhui.model.service.login.LoginService;
import com.sugang.wenlvhui.model.service.space.SpacePageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class SpacePagePresenterImp implements SpacePageContract.SpacePagePresenter {
    SpacePageContract.SpacePageView view;

    @Override
    public void getSpacePageBean(String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("page", page);
        RetrofitUtils.getInstance().getService(SpacePageService.class)
                .getSpacePageBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SpacePageBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SpacePageBean loginBean) {

                        view.showSpacePageBean(loginBean);
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
    public void actualView(SpacePageContract.SpacePageView spacePageView) {
        this.view = spacePageView;
    }

    @Override
    public void unActualView() {
        this.view = null ;
    }
}
