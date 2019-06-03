package com.sugang.wenlvhui.model.service.activity;

import com.sugang.wenlvhui.model.bean.activity.ActivityDetailsBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ActivityDetalisService {
    @FormUrlEncoded
    @POST(Urls.ACTIVITY_DETALIS)
    Observable<ActivityDetailsBean> GetActivityDetailsBeanData(@FieldMap Map<String, String> params);
}
