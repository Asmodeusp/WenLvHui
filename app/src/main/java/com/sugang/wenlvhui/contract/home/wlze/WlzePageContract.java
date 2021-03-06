package com.sugang.wenlvhui.contract.home.wlze;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.Wenlvzhengcebean;

public interface WlzePageContract {
    interface  WlzePageView{
        //文旅政策主页
        void showWenlvzhengcebean(Wenlvzhengcebean wenlvzhengcebean);

        void ShowiSlike(IsLikeBean isLikeBean);
        //        展示错误数据
        void showError(String string);

    }
    interface  WlzePagePresenter extends BasePresenter<WlzePageView> {
        //文旅政策主页
        void getWenlvzhengcebeanData(String userId);

        void iSlike(String userid,String textType,String textId);
    }
}
