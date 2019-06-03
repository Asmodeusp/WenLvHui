package com.sugang.wenlvhui.contract.home.wcfy;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenDetalisBean;


public interface JiangrenDetalisContract {
    interface JiangrenDetalisView {
    //文旅定制主页
    void showJiangRenDetalisBean(JiangRenDetalisBean jiangRenPageBean);

    //展示错误数据
    void showError(String string);

}

interface JiangRenDetalisBeanPresenter extends BasePresenter<JiangrenDetalisView> {
    //猜你喜欢
    void getJiangrenDetalisBean(String user_id,String shops_id);
}
}
