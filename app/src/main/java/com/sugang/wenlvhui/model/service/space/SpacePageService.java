package com.sugang.wenlvhui.model.service.space;

import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.space.SpacePageBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpacePageService {
    @FormUrlEncoded
    @POST(Urls.SPACE_PAGE)
    Observable<SpacePageBean> getSpacePageBean(@FieldMap Map<String, String> params);
}

