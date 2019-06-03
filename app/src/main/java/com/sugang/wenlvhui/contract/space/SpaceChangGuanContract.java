package com.sugang.wenlvhui.contract.space;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.space.SpaceChangGuanBean;

public interface SpaceChangGuanContract {
    interface SpaceChangGuanView {
        void showSpaceChangGuanBean(SpaceChangGuanBean activityPageBean);
        //展示错误数据
        void showError(String string);
    }

    interface SpaceChangGuanPresenter extends BasePresenter<SpaceChangGuanContract.SpaceChangGuanView> {

        void getSpaceChangGuanBean(String space_detail_id);
    }
}
