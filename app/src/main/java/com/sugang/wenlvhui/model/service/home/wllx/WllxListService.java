package com.sugang.wenlvhui.model.service.home.wllx;


import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WllxListService {

    @FormUrlEncoded
    @POST(Urls.WLLX_LIST)
    Observable<WllxListBean> GetWllxListBean(@FieldMap Map<String, String> params);
}
