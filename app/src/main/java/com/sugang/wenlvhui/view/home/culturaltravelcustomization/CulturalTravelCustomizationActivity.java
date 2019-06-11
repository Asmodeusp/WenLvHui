package com.sugang.wenlvhui.view.home.culturaltravelcustomization;

import android.content.Intent;
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
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
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
        CulturalTravelCustomizationShaiXuanButton.setVisibility(View.GONE);
    }

    @Override
    protected void loadDate() {
        presenter.getWldzArtistindexBean("1","4");
    }

    @Override
    public void showWldzArtistindexBean(final WldzArtistindexBean wldzArtistindexBean) {
        if (wldzArtistindexBean.getData() != null) {
//            Glide.with(this).load(wldzArtistindexBean.getData().getImg()).error(R.mipmap.icon).into(CulturalTravelCustomizationImage);
            CulturalTravelCustomizationRecy.setLayoutManager(new LinearLayoutManager(this));
            WldzArtistAdapter wldzArtistAdapter = new WldzArtistAdapter(wldzArtistindexBean.getData().getArtists());
            CulturalTravelCustomizationRecy.setAdapter(wldzArtistAdapter);
            wldzArtistAdapter.setRecyclerViewOnCLickListener(new WldzArtistAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(CulturalTravelCustomizationActivity.this, SPKey.WLDZ_YIRENDETAILS, wldzArtistindexBean.getData().getArtists().get(position).getArtist_details());
                    SPUtils.put(CulturalTravelCustomizationActivity.this, SPKey.WLDZ_YIRENEXPERIENCE,  wldzArtistindexBean.getData().getArtists().get(position).getArtist_experience());
                    SPUtils.put(CulturalTravelCustomizationActivity.this, SPKey.WLDZ_YIRENTYPE,wldzArtistindexBean.getData().getArtists().get(position).getId());
                    startActivity(new Intent(CulturalTravelCustomizationActivity.this,WldzDetalisActivity.class));
                }
            });
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
                startActivity(new Intent(this,WldzSerchActivity.class));
                break;
            case R.id.CulturalTravelCustomization_ArtistMoreButton:
                    startActivity(new Intent(this,WldzListActivity.class));
                break;
        }
    }
}
