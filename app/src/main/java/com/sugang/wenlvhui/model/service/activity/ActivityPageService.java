package com.sugang.wenlvhui.model.service.activity;

import com.sugang.wenlvhui.model.bean.activity.ActivityPageBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ActivityPageService {
    @FormUrlEncoded
    @POST(Urls.ACTIVITY_PAGE)
    Observable<ActivityPageBean> getActivityPageBeanData(@FieldMap Map<String, String> params);
}
