package com.sugang.wenlvhui.model.service.home.dfms;

import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantPageBean;
import com.sugang.wenlvhui.utils.Urls;




import io.reactivex.Observable;

import retrofit2.http.POST;

public interface DfmsPageService {
    //地方美食主页
    @POST(Urls.RESTAURANT_LIST)
    Observable<RestaurantPageBean> GetRestaurantPageData();
}
