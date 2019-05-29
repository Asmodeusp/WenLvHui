package com.sugang.wenlvhui.model.service.home.wldz;

import com.sugang.wenlvhui.model.bean.home.wldz.WldzDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzSerchBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WldzSerchService {
    @FormUrlEncoded
    @POST(Urls.ARTIST_SERCH)
    Observable<WldzSerchBean> GetWldzSerchBean(@FieldMap Map<String, String> params);
}
