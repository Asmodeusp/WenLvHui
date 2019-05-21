package com.sugang.wenlvhui.contract.home.wldz;


import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzArtistindexBean;

public interface WldzPageContract {
    interface WldzPageView {
      
        //文旅定制主页
        void showWldzArtistindexBean(WldzArtistindexBean wldzArtistindexBean);

        //展示错误数据
        void showError(String string);

    }

     interface WldzPagePresenter extends BasePresenter<WldzPageView> {


        //猜你喜欢
        void getWldzArtistindexBean(String page);
    }
}
