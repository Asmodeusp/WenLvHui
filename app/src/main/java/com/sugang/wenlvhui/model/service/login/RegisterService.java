package com.sugang.wenlvhui.model.service.login;

import com.sugang.wenlvhui.model.bean.login.RegisterBean;
import com.sugang.wenlvhui.utils.Urls;
import java.util.Map;
import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterService {
    @FormUrlEncoded
    @POST(Urls.REGISTER)
    Observable<RegisterBean> GetRegisterBean(@FieldMap Map<String, String> params);
}
