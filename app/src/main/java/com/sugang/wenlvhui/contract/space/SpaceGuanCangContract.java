package com.sugang.wenlvhui.contract.space;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.space.SpaceGuanCangBean;

public interface SpaceGuanCangContract {
    interface SpaceGuanCangView {
        void showSpaceGuanCangBean(SpaceGuanCangBean activityPageBean);
        //展示错误数据
        void showError(String string);
    }

    interface SpaceGuanCangPresenter extends BasePresenter<SpaceGuanCangContract.SpaceGuanCangView> {

        void getSpaceGuanCangBean(String space_id);
    }
}
