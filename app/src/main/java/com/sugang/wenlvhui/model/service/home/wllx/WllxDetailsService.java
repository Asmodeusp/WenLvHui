package com.sugang.wenlvhui.model.service.home.wllx;

import com.sugang.wenlvhui.model.bean.home.wllx.WllxDetalisBean;

import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WllxDetailsService {
    @FormUrlEncoded
    @POST(Urls.WLLX_DETAILS)
    Observable<WllxDetalisBean> GetWllxDetalisBean(@FieldMap Map<String, String> params);
}
