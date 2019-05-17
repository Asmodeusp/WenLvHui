package com.sugang.wenlvhui.model.service.home.wldz;

import com.sugang.wenlvhui.model.bean.home.wldz.WldzArtistindexBean;
import com.sugang.wenlvhui.model.bean.home.wlze.Wenlvzhengcebean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface WldzPageService {
    //文旅政策

    @GET(Urls.ARTIST_INDEX)
    Observable<WldzArtistindexBean> GetWldzArtistindexBean(@QueryMap Map<String, String> params);
}
