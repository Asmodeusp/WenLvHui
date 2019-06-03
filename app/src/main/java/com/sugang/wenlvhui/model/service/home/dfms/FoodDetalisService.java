package com.sugang.wenlvhui.model.service.home.dfms;

import com.sugang.wenlvhui.model.bean.home.dfms.FoodDetalisBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface FoodDetalisService {
    @FormUrlEncoded
    @POST(Urls.FOOD_DETAIL)
    Observable<FoodDetalisBean> GetFoodDetalisBean(@FieldMap Map<String, String> params);
}
