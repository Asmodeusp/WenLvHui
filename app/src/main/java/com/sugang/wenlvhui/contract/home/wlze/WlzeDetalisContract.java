package com.sugang.wenlvhui.contract.home.wlze;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsDetalisBean;


public interface WlzeDetalisContract {
    interface  WlzeDetalisView{
        //文旅政策主页
        void showNewsDetalisBean(NewsDetalisBean wenlvzhengcebean);

        void ShowiSlike(IsLikeBean isLikeBean);
        //        展示错误数据
        void showError(String string);

    }
    interface  WlzeDetalisPresenter extends BasePresenter<WlzeDetalisContract.WlzeDetalisView> {
        //文旅政策主页
        void getNewsDetalisBeanData(String userid,String id);

        void iSlike(String userid,String textType,String textId);
    }
}
