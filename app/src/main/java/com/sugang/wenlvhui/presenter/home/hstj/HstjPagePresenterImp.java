package com.sugang.wenlvhui.presenter.home.hstj;

import com.sugang.wenlvhui.contract.home.hstj.HstjpageContract;
import com.sugang.wenlvhui.model.bean.home.hstj.BookTuijianBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjLikeBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjNewBean;
import com.sugang.wenlvhui.model.service.home.hstj.HstjPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HstjPagePresenterImp implements HstjpageContract.HstjpagePresenterImp {
    HstjpageContract.HstjpageView view;
    @Override
    public void getBookTuijianBean(String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("page",page);
        RetrofitUtils.getInstance().getService(HstjPageService.class)
                .GetBookTuijianData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BookTuijianBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BookTuijianBean bookTuijianBean) {
                        if (bookTuijianBean.getMsg() .equals("成功")) {
                            view.showBookTuijianBean(bookTuijianBean);
                        } else {
                            view.showError(bookTuijianBean.getMsg());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getBookNewBean(String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("page",page);
        RetrofitUtils.getInstance().getService(HstjPageService.class)
                .GetBookNewData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HstjNewBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HstjNewBean bookLikeorNewBean) {
                        if (bookLikeorNewBean.getMsg() .equals("成功")) {
                            view.showBookNewBean(bookLikeorNewBean);
                        } else {
                            view.showError(bookLikeorNewBean.getMsg());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getBookCnxhBean(String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("page",page);
        RetrofitUtils.getInstance().getService(HstjPageService.class)
                .GetBookLikeData(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HstjLikeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HstjLikeBean bookLikeorNewBean) {
                        if (bookLikeorNewBean.getMsg() .equals("成功")) {
                            view.showBookCnxhBean(bookLikeorNewBean);
                        } else {
                            view.showError(bookLikeorNewBean.getMsg());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void actualView(HstjpageContract.HstjpageView hstjpageView) {
        this.view =hstjpageView;
    }

    @Override
    public void unActualView() {
        this.view =null;
    }
}
