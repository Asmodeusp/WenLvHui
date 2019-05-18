package com.sugang.wenlvhui.view.home.intangiblecultural;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//文创非遗
public class IntangibleCulturalHeritageActivity extends BaseActivity {


    @BindView(R.id.IntangibleCulturalHeritage_ReturnButton)
    AutoLinearLayout IntangibleCulturalHeritageReturnButton;
    @BindView(R.id.IntangibleCulturalHeritage_ShouYiText)
    TextView IntangibleCulturalHeritageShouYiText;
    @BindView(R.id.IntangibleCulturalHeritage_ShouYiLine)
    View IntangibleCulturalHeritageShouYiLine;
    @BindView(R.id.IntangibleCulturalHeritage_ShouYiButton)
    AutoRelativeLayout IntangibleCulturalHeritageShouYiButton;
    @BindView(R.id.IntangibleCulturalHeritage_JiangRenText)
    TextView IntangibleCulturalHeritageJiangRenText;
    @BindView(R.id.IntangibleCulturalHeritage_JiangRenLine)
    View IntangibleCulturalHeritageJiangRenLine;
    @BindView(R.id.IntangibleCulturalHeritage_JiangRenButton)
    AutoRelativeLayout IntangibleCulturalHeritageJiangRenButton;
    @BindView(R.id.IntangibleCulturalHeritage_Viewpager)
    ViewPager IntangibleCulturalHeritageViewpager;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_intangible_cultural_heritage;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.IntangibleCulturalHeritage_ReturnButton, R.id.IntangibleCulturalHeritage_ShouYiButton, R.id.IntangibleCulturalHeritage_JiangRenButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.IntangibleCulturalHeritage_ReturnButton:
                finish();
                break;
            case R.id.IntangibleCulturalHeritage_ShouYiButton:

                break;
            case R.id.IntangibleCulturalHeritage_JiangRenButton:
                break;
        }
    }
}
