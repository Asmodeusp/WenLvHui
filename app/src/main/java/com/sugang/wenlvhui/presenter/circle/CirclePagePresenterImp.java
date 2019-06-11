package com.sugang.wenlvhui.presenter.circle;

import com.sugang.wenlvhui.contract.cirle.CirclePageContract;
import com.sugang.wenlvhui.model.bean.activity.ActivityDetailsBean;
import com.sugang.wenlvhui.model.bean.circle.CircleCNXHBean;
import com.sugang.wenlvhui.model.service.activity.ActivityDetalisService;
import com.sugang.wenlvhui.model.service.circle.CircleCNXHService;
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
public class CirclePagePresenterImp implements CirclePageContract.CirclePagePresenter {

    CirclePageContract.CirclePageView view;
    @Override
    public void getCircleCNXHBean(String user_id, String page) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("user_id",user_id);
        paramMap.put("page",page);
        RetrofitUtils.getInstance().getService(CircleCNXHService.class)
                .getCircleCNXHBean(paramMap)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CircleCNXHBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CircleCNXHBean wenlvzhengcebean) {
                        if (wenlvzhengcebean.getMsg() .equals("成功")) {
                            view.showCirclePageBean(wenlvzhengcebean);
                        } else {
                            view.showError(wenlvzhengcebean.getMsg());
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
    public void actualView(CirclePageContract.CirclePageView circlePageView) {
        this.view =circlePageView;
    }

    @Override
    public void unActualView() {
        this.view =null;
    }
}
