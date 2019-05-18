package com.sugang.wenlvhui.model.service.login;

import com.sugang.wenlvhui.model.bean.login.LoginBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginService {
    @FormUrlEncoded
    @POST(Urls.LOGIN)
    Observable<LoginBean> GetLoginBean(@FieldMap Map<String, String> params);
}
