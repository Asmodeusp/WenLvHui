package com.sugang.wenlvhui.contract.home.wcfy;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;

public interface JiangRenPageContract {
    interface JiangRenPageView {

        //文旅定制主页
        void showJiangRenPageBean(JiangRenPageBean jiangRenPageBean);

        //展示错误数据
        void showError(String string);

    }

    interface JiangRenPagePresenter extends BasePresenter<JiangRenPageView> {
        //猜你喜欢
        void getJiangRenPageBean(String user_id,String page);
    }
}
