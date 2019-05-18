package com.sugang.wenlvhui.model.service.login;

import com.sugang.wenlvhui.model.bean.login.RegisterPhoneBean;
import com.sugang.wenlvhui.utils.Urls;
import java.util.Map;
import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterPhotoService {
    @FormUrlEncoded
    @POST(Urls.REGISTER_PHOTO)
    Observable<RegisterPhoneBean> GetRegisterPhoneBean(@FieldMap Map<String, String> params);
}
