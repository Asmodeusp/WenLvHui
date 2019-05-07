package com.sugang.wenlvhui.model.service.home.wlze;

import com.sugang.wenlvhui.model.bean.home.wlze.Wenlvzhengcebean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface WlzcXmggListService {
    //文旅政策
    @FormUrlEncoded
    @POST(Urls.WLZC_XMGGLIST)
    Observable<WlzcXmggListBean> GetWlzcXmggListData(@FieldMap Map<String, String> params);
}
