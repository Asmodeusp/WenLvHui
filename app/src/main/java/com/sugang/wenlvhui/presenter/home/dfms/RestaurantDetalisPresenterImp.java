package com.sugang.wenlvhui.presenter.home.dfms;

import com.sugang.wenlvhui.contract.home.dfms.RestaurantDetalisContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzDetalisBean;
import com.sugang.wenlvhui.model.service.home.dfms.restaurantDetailService;
import com.sugang.wenlvhui.model.service.other.IsLikeService;
import com.sugang.wenlvhui.utils.RetrofitUtils;


import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RestaurantDetalisPresenterImp implements RestaurantDetalisContract.RestaurantDetalisPresenter {
    RestaurantDetalisContract.RestaurantDetalisView view;

    @Override
    public void getRestaurantDetalisBean(String restaurant_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("restaurant_id",restaurant_id);
        RetrofitUtils.getInstance().getService(restaurantDetailService.class)
                .GetRestaurantDetalisBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RestaurantDetalisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RestaurantDetalisBean wldzDetalisBean) {
                        if (wldzDetalisBean.getMsg() .equals("成功")) {
                            view.showRestaurantDetalisBean(wldzDetalisBean);
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
    public void iSlike(String userid, String textType, String textId) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid",userid);
        paramMap.put("textType",textType);
        paramMap.put("textId",textId);
        RetrofitUtils.getInstance().getService(IsLikeService.class)
                .GetIsLikeBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<IsLikeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }
                    @Override
                    public void onNext(IsLikeBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMes() .equals("成功")) {
                            view.ShowiSlike(wenlvzhengcebean);
                        } else {
                            view.showError(wenlvzhengcebean.getMes());
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
    public void actualView(RestaurantDetalisContract.RestaurantDetalisView restaurantDetalisView) {
        this.view = restaurantDetalisView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
