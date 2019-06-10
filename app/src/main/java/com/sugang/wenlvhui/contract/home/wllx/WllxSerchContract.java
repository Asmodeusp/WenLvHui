package com.sugang.wenlvhui.contract.home.wllx;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxSerchBean;

//
/* Created by $USER_NAME on 2019/6/9.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public interface WllxSerchContract {
    interface WllxSerchView {


        void showWllxSerchBeanBean(WllxSerchBean WllxSerchBeanBean);

        //展示错误数据
        void showError(String string);

    }

    interface WllxSerchPresenter extends BasePresenter<WllxSerchContract.WllxSerchView> {

        void getWllxSerchBean(String key,String num,String page);
    }
}
