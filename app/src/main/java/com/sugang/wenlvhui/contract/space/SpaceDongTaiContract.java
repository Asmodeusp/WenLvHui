package com.sugang.wenlvhui.contract.space;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.space.SpaceDongTaiBean;

public interface SpaceDongTaiContract {
    interface SpaceDongTaiView {
        void showSpaceDongTaiBean(SpaceDongTaiBean activityPageBean);
        //展示错误数据
        void showError(String string);
    }

    interface SpaceDongTaiPresenter extends BasePresenter<SpaceDongTaiContract.SpaceDongTaiView> {

        void getSpaceDongTaiBean(String space_id);
    }

}
