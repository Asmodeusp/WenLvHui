package com.sugang.wenlvhui.model.service.home.wypx;

import com.sugang.wenlvhui.model.bean.home.wypx.WypxDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxPageBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WypxDetalisService {
    //文旅政策
    @FormUrlEncoded
    @POST(Urls.SCHOOL_DETAILS)
    Observable<WypxDetalisBean> GetWypxDetalisBeanData(@FieldMap Map<String, String> params);
}
