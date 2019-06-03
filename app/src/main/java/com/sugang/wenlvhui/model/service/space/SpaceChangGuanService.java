package com.sugang.wenlvhui.model.service.space;

import com.sugang.wenlvhui.model.bean.space.SpaceChangGuanBean;
import com.sugang.wenlvhui.model.bean.space.SpaceDongTaiBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpaceChangGuanService {
    @FormUrlEncoded
    @POST(Urls.SPACE_CHANGGUAN)
    Observable<SpaceChangGuanBean> getSpaceChangGuanBean(@FieldMap Map<String, String> params);
}
