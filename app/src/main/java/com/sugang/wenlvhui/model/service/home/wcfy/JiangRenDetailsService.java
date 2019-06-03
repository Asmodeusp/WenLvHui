package com.sugang.wenlvhui.model.service.home.wcfy;

import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface JiangRenDetailsService {
    @FormUrlEncoded
    @POST(Urls.JIANGREN_DETAILS)
    Observable<JiangRenDetalisBean> GetJiangRenDetalisBean(@FieldMap Map<String, String> params);
}
