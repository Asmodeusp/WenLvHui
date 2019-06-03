package com.sugang.wenlvhui.presenter.home.dfms;

import com.sugang.wenlvhui.contract.home.dfms.FoodDetalisContract;
import com.sugang.wenlvhui.model.bean.home.dfms.FoodDetalisBean;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantDetalisBean;
import com.sugang.wenlvhui.model.service.home.dfms.FoodDetalisService;
import com.sugang.wenlvhui.model.service.home.dfms.restaurantDetailService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class FoodDetalisPresenterImp implements FoodDetalisContract.FoodDetalisPresenter {
    FoodDetalisContract.FoodDetalisView view;

    @Override
    public void getFoodDetalisBean(String food_id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("food_id",food_id);
        RetrofitUtils.getInstance().getService(FoodDetalisService.class)
                .GetFoodDetalisBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FoodDetalisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(FoodDetalisBean wldzDetalisBean) {
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
    public void actualView(FoodDetalisContract.FoodDetalisView foodDetalisView) {
    this.view = foodDetalisView;
    }

    @Override
    public void unActualView() {
        this.view =null;
    }
}
