package com.sugang.wenlvhui.contract.home.wypx;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxPageBean;

public interface WypxPageContract {
    interface  WypxPageView{
        //文旅政策主页
        void showWypxPageBean(WypxPageBean wypxPageBean);
        //        展示错误数据
        void showError(String string);
        void ShowiSlike(IsLikeBean isLikeBean);
    }
    interface  WypxPagePresenter extends BasePresenter<WypxPageView> {
        //文旅政策主页
        void getWypxPageBeanData(String type,String page,String num,String userid);
        //文艺培训学校点赞
        void iSlike(String userid,String textType,String textId);
    }
}
