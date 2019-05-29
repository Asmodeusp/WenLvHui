package com.sugang.wenlvhui.model.service.home.wldz;


import com.sugang.wenlvhui.model.bean.home.wldz.WldzDetalisBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WldzDetalisService {
    @FormUrlEncoded
    @POST(Urls.ARTIST_DETAIL)
    Observable<WldzDetalisBean> GetWldzDetalisBean(@FieldMap Map<String, String> params);
}
