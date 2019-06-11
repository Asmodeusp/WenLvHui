package com.sugang.wenlvhui.model.service.home.wlbd;

import com.sugang.wenlvhui.model.bean.home.wlbd.WlbdHsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsDetalisBean;
import com.sugang.wenlvhui.utils.Urls;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

//
/* Created by $USER_NAME on 2019/6/11.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public interface WlbdService {
    //文旅政策
    @FormUrlEncoded
    @POST(Urls.WLBD)
    Observable<WlbdHsBean> getWlbdHsBeanData(@FieldMap Map<String, String> params);
}
