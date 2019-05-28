package com.sugang.wenlvhui.contract.home.wlze;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.Wenlvzhengcebean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;

public interface WlzcXmggListContract {
    interface  WlzcXmggListView{
        //文旅政策主页
        void showWlzcXmggListBean(WlzcXmggListBean wlzcXmggListBean);
        //展示错误数据
        void showError(String string);
        void ShowiSlike(IsLikeBean isLikeBean);

    }
    interface  WlzcXmggListPresenterImp extends BasePresenter<WlzcXmggListView> {
        //文旅政策主页
        void getWlzcXmggListBeanData(String userId,String text_type,String page);
        void iSlike(String userid,String textType,String textId);
    }
}
