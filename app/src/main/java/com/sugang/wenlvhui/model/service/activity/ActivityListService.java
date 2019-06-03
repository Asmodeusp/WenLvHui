package com.sugang.wenlvhui.model.service.activity;

import com.sugang.wenlvhui.model.bean.activity.ActivityListBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ActivityListService {
    @FormUrlEncoded
    @POST(Urls.ACTIVITY_LIST)
    Observable<ActivityListBean> getActivityListBeanData(@FieldMap Map<String, String> params);
}
