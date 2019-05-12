package com.sugang.wenlvhui.contract.home.hstj;

import com.sugang.wenlvhui.base.BasePresenter;
import com.sugang.wenlvhui.model.bean.home.hstj.BookTuijianBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjLikeBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjNewBean;

public interface HstjpageContract {
    interface HstjpageView {
        //推荐
        void showBookTuijianBean(BookTuijianBean bookTuijianBean);

        //最新最热
        void showBookNewBean(HstjNewBean bookLikeorNewBean);

        //猜你喜欢
        void showBookCnxhBean(HstjLikeBean bookLikeorNewBean);

        //展示错误数据
        void showError(String string);

    }

    interface HstjpagePresenterImp extends BasePresenter<HstjpageView> {
        //推荐
        void getBookTuijianBean(String page);

        //最新最热
        void getBookNewBean(String page);

        //猜你喜欢
        void getBookCnxhBean(String page);
    }
}
