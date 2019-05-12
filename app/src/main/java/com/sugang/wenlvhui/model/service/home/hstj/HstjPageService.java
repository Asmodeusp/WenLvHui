package com.sugang.wenlvhui.model.service.home.hstj;

import com.sugang.wenlvhui.model.bean.home.hstj.BookTuijianBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjLikeBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjNewBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

//好书推荐
public interface HstjPageService {
    //推荐
    @FormUrlEncoded
    @POST(Urls.HSTJ_TUIJIAN)
    Observable<BookTuijianBean> GetBookTuijianData(@FieldMap Map<String, String> params);

    //最新最热
    @FormUrlEncoded
    @POST(Urls.HSTJ_ZXZR)
    Observable<HstjNewBean> GetBookNewData(@FieldMap Map<String, String> params);

    //猜你喜欢
    @FormUrlEncoded
    @POST(Urls.HSTJ_CNXH)
    Observable<HstjLikeBean> GetBookLikeData(@FieldMap Map<String, String> params);

}
