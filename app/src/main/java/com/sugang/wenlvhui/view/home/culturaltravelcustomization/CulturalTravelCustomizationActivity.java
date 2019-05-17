package com.sugang.wenlvhui.view.home.culturaltravelcustomization;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wldz.WldzPageContract;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzArtistindexBean;
import com.sugang.wenlvhui.presenter.home.wldz.WldzPagePresenterImp;
import com.sugang.wenlvhui.view.home.adapter.WldzArtistAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//文旅定制
public class CulturalTravelCustomizationActivity extends BaseActivity<WldzPagePresenterImp> implements WldzPageContract.WldzPageView {


    @BindView(R.id.CulturalTravelCustomizationReturnButton)
    AutoLinearLayout CulturalTravelCustomizationReturnButton;
    @BindView(R.id.CulturalTravelCustomizationShaiXuanButton)
    AutoLinearLayout CulturalTravelCustomizationShaiXuanButton;
    @BindView(R.id.CulturalTravelCustomizationRenzhengButton)
    AutoLinearLayout CulturalTravelCustomizationRenzhengButton;
    @BindView(R.id.CulturalTravelCustomization_Image)
    ImageView CulturalTravelCustomizationImage;
    @BindView(R.id.CulturalTravelCustomization_SerchEd)
    TextView CulturalTravelCustomizationSerchEd;
    @BindView(R.id.CulturalTravelCustomization_ArtistMoreButton)
    ImageView CulturalTravelCustomizationArtistMoreButton;
    @BindView(R.id.CulturalTravelCustomizationRecy)
    RecyclerView CulturalTravelCustomizationRecy;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_cultural_travel_customization;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        presenter.getWldzArtistindexBean("1");
    }

    @Override
    public void showWldzArtistindexBean(WldzArtistindexBean wldzArtistindexBean) {
        if (wldzArtistindexBean.getData() != null) {
            Glide.with(this).load(wldzArtistindexBean.getData().getBackage_img().getImgUrl()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(CulturalTravelCustomizationImage);
            CulturalTravelCustomizationRecy.setLayoutManager(new LinearLayoutManager(this));
            WldzArtistAdapter wldzArtistAdapter = new WldzArtistAdapter(wldzArtistindexBean.getData().getArtistList());
            CulturalTravelCustomizationRecy.setAdapter(wldzArtistAdapter);
        }
    }

    @Override
    public void showError(String string) {

    }



    @OnClick({R.id.CulturalTravelCustomizationReturnButton, R.id.CulturalTravelCustomizationShaiXuanButton, R.id.CulturalTravelCustomizationRenzhengButton, R.id.CulturalTravelCustomization_SerchEd, R.id.CulturalTravelCustomization_ArtistMoreButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.CulturalTravelCustomizationReturnButton:
                finish();
                break;
            case R.id.CulturalTravelCustomizationShaiXuanButton:
                break;
            case R.id.CulturalTravelCustomizationRenzhengButton:
                break;
            case R.id.CulturalTravelCustomization_SerchEd:
                break;
            case R.id.CulturalTravelCustomization_ArtistMoreButton:
                break;
        }
    }
}
