package com.sugang.wenlvhui.contract.space;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.space.SpacePageBean;

public interface SpacePageContract {
    interface SpacePageView {
        void showSpacePageBean(SpacePageBean activityPageBean);


        //展示错误数据
        void showError(String string);
    }

    interface SpacePagePresenter extends BasePresenter<SpacePageContract.SpacePageView> {

        void getSpacePageBean(String page);
    }
}
