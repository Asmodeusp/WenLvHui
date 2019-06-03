package com.sugang.wenlvhui.contract.home.wlze;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewSerchBean;


public interface WlzcSerchContract {
    interface  WlzcSerchView{
        //文旅政策主页
        void showWlzcSerchBean(NewSerchBean wlzcXmggListBean);
        //展示错误数据
        void showError(String string);
        void ShowiSlike(IsLikeBean isLikeBean);

    }
    interface  WlzcSerchPresenter extends BasePresenter<WlzcSerchContract.WlzcSerchView> {
        //文旅政策主页
        void getWlzcSerchBeanData(String userId,String key,String page ,String num);

        void iSlike(String userid,String textType,String textId);
    }
}
