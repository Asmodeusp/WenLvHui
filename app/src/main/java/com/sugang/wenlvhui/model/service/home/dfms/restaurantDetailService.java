package com.sugang.wenlvhui.model.service.home.dfms;

import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzDetalisBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface restaurantDetailService {
    @FormUrlEncoded
    @POST(Urls.RESTAURANT_DETAIL)
    Observable<RestaurantDetalisBean> GetRestaurantDetalisBean(@FieldMap Map<String, String> params);
}
