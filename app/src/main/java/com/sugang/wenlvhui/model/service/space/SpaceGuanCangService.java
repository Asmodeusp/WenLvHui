package com.sugang.wenlvhui.model.service.space;

import com.sugang.wenlvhui.model.bean.space.SpaceGuanCangBean;
import com.sugang.wenlvhui.model.bean.space.SpacePageBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpaceGuanCangService {
    @FormUrlEncoded
    @POST(Urls.SPACE_GUANCANG)
    Observable<SpaceGuanCangBean> getSpaceGuanCangBean(@FieldMap Map<String, String> params);
}
