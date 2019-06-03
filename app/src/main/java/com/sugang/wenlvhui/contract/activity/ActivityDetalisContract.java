package com.sugang.wenlvhui.contract.activity;

import com.sugang.wenlvhui.base.BasePresenter;

import com.sugang.wenlvhui.model.bean.activity.ActivityDetailsBean;

public interface ActivityDetalisContract {
    interface ActivityDetalisView {
        void showActivityDetailsBean(ActivityDetailsBean activityDetailsBean);
        //展示错误数据
        void showError(String string);

    }

    interface ActivityDetalisPresenter extends BasePresenter<ActivityDetalisView> {
        void getActivityDetailsBean(String id);

    }
}
