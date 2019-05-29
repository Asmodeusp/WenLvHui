package com.sugang.wenlvhui.view.home.culturaltravelcustomization;


import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wldz.WldzDetalisContract;
import com.sugang.wenlvhui.contract.home.wldz.WldzPageContract;
import com.sugang.wenlvhui.model.bean.ImgsBean;
import com.sugang.wenlvhui.model.bean.VideosBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzArtistindexBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzDetalisBean;
import com.sugang.wenlvhui.presenter.home.wldz.WldzDetalisPresenterImp;
import com.sugang.wenlvhui.presenter.home.wldz.WldzPagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.literarytraining.WypxShipinFragment;
import com.sugang.wenlvhui.view.home.literarytraining.WypxZhaopianFragment;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import cn.jzvd.JZVideoPlayerStandard;

public class WldzDetalisActivity extends BaseActivity<WldzDetalisPresenterImp> implements WldzDetalisContract.WldzDetalisView {


    @BindView(R.id.WldzDetalis_ReturnButton)
    AutoLinearLayout WldzDetalisReturnButton;
    @BindView(R.id.WldzDetalis_BackgroundImage)
    ImageView WldzDetalisBackgroundImage;
    @BindView(R.id.WldzDetalis_JieshaoButton)
    AutoRelativeLayout WldzDetalisJieshaoButton;
    @BindView(R.id.WldzDetalis_ZhaoPianButton)
    AutoRelativeLayout WldzDetalisZhaoPianButton;
    @BindView(R.id.WldzDetalis_ShiPinButton)
    AutoRelativeLayout WldzDetalisShiPinButton;
    @BindView(R.id.WldzDetalis_HeadImage)
    ImageView WldzDetalisHeadImage;
    @BindView(R.id.WldzDetalis_NameText)
    TextView WldzDetalisNameText;
    @BindView(R.id.WldzDetalis_PhoneNumberText)
    TextView WldzDetalisPhoneNumberText;
    @BindView(R.id.WldzDetalis_SeePhoneNumberButton)
    TextView WldzDetalisSeePhoneNumberButton;
    @BindView(R.id.WldzDetalis_FrameLayout)
    FrameLayout WldzDetalisFrameLayout;
    public List<ImgsBean> imgs
            = new ArrayList<>();
    public List<VideosBean> video = new ArrayList<>();
    @Override
    protected int getLayoutId() {
        return R.layout.activity_wldz_detalis;
    }

    @Override
    protected void init() {
        SPUtils.put(this,"HQ","WldzDetalisActivity");
        WldzDetalisJieshaoButton.setBackgroundColor(getResources().getColor(R.color.H9));
        WldzDetalisZhaoPianButton.setBackgroundColor(getResources().getColor(R.color.H11));
        WldzDetalisShiPinButton.setBackgroundColor(getResources().getColor(R.color.H11));
        setContentView(R.id.WldzDetalis_FrameLayout, WldzJieshaoFragment.class);
        JZVideoPlayerStandard.releaseAllVideos();
    }

    @Override
    protected void loadDate() {
        int o = (int) SPUtils.get(WldzDetalisActivity.this, SPKey.WLDZ_YIRENTYPE, 0);
        presenter.getWldzDetalisBean(o+"");
    }



    @Override
    public void showWldzDetalisBean(WldzDetalisBean wllxDetalisBean) {
        if (wllxDetalisBean.getData() != null) {
            WldzDetalisBean.DataBean.ArtistBean data = wllxDetalisBean.getData().getArtist();
            WldzDetalisNameText.setText(data.getArtistName());
            Glide.with(this).load(data.getBackgroundUrl()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(WldzDetalisBackgroundImage);

            String phone = data.getArtistPhone();
            if (phone.length() == 11) {
                String maskNumber = phone.substring(0, 3) + "****" + phone.substring(7, phone.length());
                WldzDetalisPhoneNumberText.setText(maskNumber);

            }
            Glide.with(this).load(data.getArtistLogourl()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(WldzDetalisHeadImage);
            SPUtils.put(this, SPKey.WLDZ_YIRENDETAILS, data.getArtistDetails());
            SPUtils.put(this, SPKey.WLDZ_YIRENEXPERIENCE, data.getArtistExperience());
            imgs.addAll(wllxDetalisBean.getData().getImgs());
            video.addAll(wllxDetalisBean.getData().getVideo());
        }
    }

    @Override
    public void showError(String string) {

    }

  

    @OnClick({R.id.WldzDetalis_ReturnButton, R.id.WldzDetalis_JieshaoButton, R.id.WldzDetalis_ZhaoPianButton, R.id.WldzDetalis_ShiPinButton, R.id.WldzDetalis_SeePhoneNumberButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.WldzDetalis_ReturnButton:
                JZVideoPlayerStandard.releaseAllVideos();
                finish();
            break;
            case R.id.WldzDetalis_JieshaoButton:
                JZVideoPlayerStandard.releaseAllVideos();
                WldzDetalisJieshaoButton.setBackgroundColor(getResources().getColor(R.color.H9));
                WldzDetalisZhaoPianButton.setBackgroundColor(getResources().getColor(R.color.H11));
                WldzDetalisShiPinButton.setBackgroundColor(getResources().getColor(R.color.H11));
                setContentView(R.id.WldzDetalis_FrameLayout, WldzJieshaoFragment.class);
            break;
            case R.id.WldzDetalis_ZhaoPianButton:
                JZVideoPlayerStandard.releaseAllVideos();
                WldzDetalisJieshaoButton.setBackgroundColor(getResources().getColor(R.color.H11));
                WldzDetalisZhaoPianButton.setBackgroundColor(getResources().getColor(R.color.H9));
                WldzDetalisShiPinButton.setBackgroundColor(getResources().getColor(R.color.H11));
                setContentView(R.id.WldzDetalis_FrameLayout, WypxZhaopianFragment.class);
            break;
            case R.id.WldzDetalis_ShiPinButton:
                WldzDetalisJieshaoButton.setBackgroundColor(getResources().getColor(R.color.H11));
                WldzDetalisZhaoPianButton.setBackgroundColor(getResources().getColor(R.color.H11));
                WldzDetalisShiPinButton.setBackgroundColor(getResources().getColor(R.color.H9));
                setContentView(R.id.WldzDetalis_FrameLayout, WypxShipinFragment.class);
            break;
            case R.id.WldzDetalis_SeePhoneNumberButton:
            break;
        }
    }
}
