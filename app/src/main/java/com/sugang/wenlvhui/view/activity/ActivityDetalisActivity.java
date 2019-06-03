package com.sugang.wenlvhui.view.activity;


import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.activity.ActivityDetalisContract;
import com.sugang.wenlvhui.model.bean.VideosBean;
import com.sugang.wenlvhui.model.bean.activity.ActivityDetailsBean;
import com.sugang.wenlvhui.presenter.activity.ActivityDetalisPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.literarytraining.WypxShipinFragment;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;

import butterknife.BindView;

import butterknife.OnClick;
import cn.jzvd.JZVideoPlayerStandard;

public class ActivityDetalisActivity extends BaseActivity<ActivityDetalisPresenterImp> implements ActivityDetalisContract.ActivityDetalisView {


    @BindView(R.id.ActivityDetalis_ReturnButton)
    AutoLinearLayout ActivityDetalisReturnButton;
    @BindView(R.id.ActivityDetalis_BackgroundImage)
    ImageView ActivityDetalisBackgroundImage;
    @BindView(R.id.ActivityDetalis_HDXQButton)
    AutoRelativeLayout ActivityDetalisHDXQButton;
    @BindView(R.id.ActivityDetalis_BDTWButton)
    AutoRelativeLayout ActivityDetalisBDTWButton;
    @BindView(R.id.ActivityDetalis_BDSPButton)
    AutoRelativeLayout ActivityDetalisBDSPButton;
    @BindView(R.id.ActivityDetalisActivityName)
    TextView ActivityDetalisActivityName;
    @BindView(R.id.ActivityDetalisActivityAddress)
    TextView ActivityDetalisActivityAddress;
    @BindView(R.id.ActivityDetalisFrameLayout)
    FrameLayout ActivityDetalisFrameLayout;
    public ArrayList<VideosBean> videos = new ArrayList<>();
    @Override
    protected int getLayoutId() {
        return R.layout.activity_detalis;
    }

    @Override
    protected void init() {
        SPUtils.put(this,"HQ","ActivityDetalisActivity");
        ActivityDetalisHDXQButton.setBackgroundColor(getResources().getColor(R.color.H9));
        ActivityDetalisBDTWButton.setBackgroundColor(getResources().getColor(R.color.H11));
        ActivityDetalisBDSPButton.setBackgroundColor(getResources().getColor(R.color.H11));
        setContentView(R.id.ActivityDetalisFrameLayout, ActivityHDXQFragment.class);
    }

    @Override
    protected void loadDate() {
        int ActivityId = (int) SPUtils.get(this, SPKey.ACTIVITYID, 0);
        presenter.getActivityDetailsBean(ActivityId+"");

    }
    @OnClick({R.id.ActivityDetalis_ReturnButton, R.id.ActivityDetalis_HDXQButton, R.id.ActivityDetalis_BDTWButton, R.id.ActivityDetalis_BDSPButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ActivityDetalis_ReturnButton:
                JZVideoPlayerStandard.releaseAllVideos();
                finish();
                break;
            case R.id.ActivityDetalis_HDXQButton:
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityDetalisHDXQButton.setBackgroundColor(getResources().getColor(R.color.H9));
                ActivityDetalisBDTWButton.setBackgroundColor(getResources().getColor(R.color.H11));
                ActivityDetalisBDSPButton.setBackgroundColor(getResources().getColor(R.color.H11));
                setContentView(R.id.ActivityDetalisFrameLayout, ActivityHDXQFragment.class);
                break;
            case R.id.ActivityDetalis_BDTWButton:
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityDetalisHDXQButton.setBackgroundColor(getResources().getColor(R.color.H11));
                ActivityDetalisBDTWButton.setBackgroundColor(getResources().getColor(R.color.H9));
                ActivityDetalisBDSPButton.setBackgroundColor(getResources().getColor(R.color.H11));
                setContentView(R.id.ActivityDetalisFrameLayout, ActivityBDTWFragment.class);
                break;
            case R.id.ActivityDetalis_BDSPButton:
                JZVideoPlayerStandard.releaseAllVideos();
                ActivityDetalisHDXQButton.setBackgroundColor(getResources().getColor(R.color.H11));
                ActivityDetalisBDTWButton.setBackgroundColor(getResources().getColor(R.color.H11));
                ActivityDetalisBDSPButton.setBackgroundColor(getResources().getColor(R.color.H9));
                setContentView(R.id.ActivityDetalisFrameLayout, WypxShipinFragment.class);
                break;
        }
    }


    @Override
    public void showActivityDetailsBean(ActivityDetailsBean activityDetailsBean) {
        if ( activityDetailsBean.getData()!=null) {
            ActivityDetailsBean.DataBean data = activityDetailsBean.getData();
            Glide.with(this).load(activityDetailsBean.getData().getImage()).error(R.mipmap.icon).into(ActivityDetalisBackgroundImage);
            ActivityDetalisActivityName.setText(data.getTitle());
            ActivityDetalisActivityAddress.setText(data.getPolicy_addr());
            SPUtils.put(this,SPKey.ACTIVITYDATETIME,data.getPolicy_date());
            SPUtils.put(this,SPKey.ACTIVITYPERSENNUMBER,data.getPeople_num());
            SPUtils.put(this,SPKey.ACTIVITYPHONE,data.getPhone());
            SPUtils.put(this,SPKey.ACTIVITYJXSZ,data.getPrize());
            SPUtils.put(this,SPKey.ACTIVITYHDZZ,data.getPolicy_purpose());
            SPUtils.put(this,SPKey.ACTIVITYHDGZ,data.getPolicy_rule());
            SPUtils.put(this,SPKey.ACTIVITYPJXZ,data.getAward_rules());
            SPUtils.put(this,SPKey.ACTIVITYCONTENT,data.getCotent());
            videos.add(new VideosBean(data.getDetails_content(),data.getVideo_backurl(),data.getVideourl()));
        }

    }

    @Override
    public void showError(String string) {

    }
}
