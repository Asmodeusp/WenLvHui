package com.sugang.wenlvhui.model.service.home.wcfy;

import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiPageBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ShouYiPageService {
    //文创非遗手艺
    @FormUrlEncoded
    @POST(Urls.SHOUYI_PAGER)
    Observable<ShouYiPageBean> GetShouYiPageBeanData(@FieldMap Map<String, String> params);
}
