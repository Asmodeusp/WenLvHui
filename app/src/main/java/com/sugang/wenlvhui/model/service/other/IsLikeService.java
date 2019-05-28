package com.sugang.wenlvhui.model.service.other;

import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxListBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IsLikeService {
    @FormUrlEncoded
    @POST(Urls.ISLIKE)
    Observable<IsLikeBean> GetIsLikeBean(@FieldMap Map<String, String> params);
}
