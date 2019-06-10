package com.sugang.wenlvhui.presenter.home.hstj;

import com.sugang.wenlvhui.contract.home.hstj.BookDetalisContract;
import com.sugang.wenlvhui.model.bean.home.hstj.BookDetalisBean;
import com.sugang.wenlvhui.model.bean.home.hstj.BookTuijianBean;
import com.sugang.wenlvhui.model.service.home.hstj.BookDetalisService;
import com.sugang.wenlvhui.model.service.home.hstj.HstjPageService;
import com.sugang.wenlvhui.utils.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

//
/* Created by $USER_NAME on 2019/6/10.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class BookDetalisPresenterImp implements BookDetalisContract.BookDetalisPresenterImp {
    BookDetalisContract.BookDetalisView view;
    @Override
    public void getBookDetalisBean(String id) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("id",id);
        RetrofitUtils.getInstance().getService(BookDetalisService.class)
                .getBookDetalisBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BookDetalisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BookDetalisBean bookTuijianBean) {
                        if (bookTuijianBean.getMes() .equals("成功")) {
                            view.showBookDetalisBean(bookTuijianBean);
                        } else {
                            view.showError(bookTuijianBean.getMes());
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
    public void actualView(BookDetalisContract.BookDetalisView bookDetalisView) {
        this.view = bookDetalisView;
    }

    @Override
    public void unActualView() {
        this.view = null;
    }
}
