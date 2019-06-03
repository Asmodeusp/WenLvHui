package com.sugang.wenlvhui.view.space;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.space.SpaceChangGuanContract;
import com.sugang.wenlvhui.model.bean.space.SpaceChangGuanBean;
import com.sugang.wenlvhui.presenter.space.SpaceChangGuanPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SpaceChangguanActivity extends BaseActivity<SpaceChangGuanPresenterImp> implements SpaceChangGuanContract.SpaceChangGuanView {


    @BindView(R.id.SpaceChangguanReturnButton)
    AutoLinearLayout SpaceChangguanReturnButton;
    @BindView(R.id.SpaceChangguanNameText)
    TextView SpaceChangguanNameText;
    @BindView(R.id.SpaceChangguanImage)
    ImageView SpaceChangguanImage;
    @BindView(R.id.SpaceChangguanSecondNameText)
    TextView SpaceChangguanSecondNameText;
    @BindView(R.id.SpaceChangguanMianjiText)
    TextView SpaceChangguanMianjiText;
    @BindView(R.id.SpaceChangguanRongNaRenShuText)
    TextView SpaceChangguanRongNaRenShuText;
    @BindView(R.id.SpaceChangguanPeiTaoSheShiText)
    TextView SpaceChangguanPeiTaoSheShiText;
    @BindView(R.id.SpaceChangguanPhoneText)
    TextView SpaceChangguanPhoneText;
    @BindView(R.id.SpaceChangguanYuYuebutton)
    TextView SpaceChangguanYuYuebutton;
    @BindView(R.id.SpaceChangguanJieShaoText)
    TextView SpaceChangguanJieShaoText;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_space_changguan;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        int o = (int) SPUtils.get(this, SPKey.SPACECHANGGUANID, 0);
        presenter.getSpaceChangGuanBean(o+"");
    }

    @Override
    public void showSpaceChangGuanBean(SpaceChangGuanBean activityPageBean) {
        if (activityPageBean.getData()!=null) {
            SpaceChangGuanBean.DataBean data = activityPageBean.getData();
            SpaceChangguanNameText.setText(data.getSpace_detail().getName());
            SpaceChangguanSecondNameText.setText(data.getSpace_detail().getName());
            SpaceChangguanMianjiText.setText(data.getSpace_detail().getSpaceMeasure()+"");
            SpaceChangguanRongNaRenShuText.setText(data.getSpace_detail().getPopulation()+"");
            SpaceChangguanPeiTaoSheShiText.setText(data.getSpace_detail().getFacilities());
            SpaceChangguanPhoneText.setText(data.getSpace_detail().getTel());
            Glide.with(this).load( data.getSpace_detail().getImage()).error(R.mipmap.icon).into(SpaceChangguanImage);



            RichText
                    .from(data.getSpace_detail().getDetail()) // 数据源
                    .autoFix(true) // 是否自动修复，默认true
                    .autoPlay(true) // gif图片是否自动播放
                    .showBorder(true) // 是否显示图片边框
                    .borderColor(Color.RED) // 图片边框颜色
                    .borderSize(10) // 边框尺寸
                    .borderRadius(50) // 图片边框圆角弧度
                    .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高
                    .noImage(true) // 不显示并且不加载图片
                    .resetSize(false)
                    .bind(this)
                    .clickable(true) // 是否可点击，默认只有设置了点击监听才可点击
                    .into(SpaceChangguanJieShaoText); // 设置目标TextView

        }
    }

    @Override
    public void showError(String string) {

    }



    @OnClick({R.id.SpaceChangguanReturnButton, R.id.SpaceChangguanYuYuebutton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.SpaceChangguanReturnButton:
                finish();
                break;
            case R.id.SpaceChangguanYuYuebutton:
                break;
        }
    }
}
