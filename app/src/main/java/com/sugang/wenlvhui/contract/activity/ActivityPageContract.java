package com.sugang.wenlvhui.contract.activity;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.activity.ActivityListBean;
import com.sugang.wenlvhui.model.bean.activity.ActivityPageBean;

public interface ActivityPageContract {
    interface ActivityPageView {
        void showActivityPageBean(ActivityPageBean activityPageBean);
        void showActivityListBean(ActivityListBean activityListBean);

        //展示错误数据
        void showError(String string);
    }

    interface ActivityPagePresenter extends BasePresenter<ActivityPageView> {
        void getActivityListBean(String type, String status, String intel, String userid, String page, String num);

        void getActivityPageBean(String userid);
    }
}
