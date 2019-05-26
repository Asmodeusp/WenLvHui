package com.sugang.wenlvhui.model.service.home.wllx;

import com.sugang.wenlvhui.model.bean.home.wllx.WllxPageBean;
import com.sugang.wenlvhui.utils.Urls;


import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WllxPageService {
    @FormUrlEncoded
    @POST(Urls.WLLX_PAGE)
    Observable<WllxPageBean> GetWllxPageBean();
}
