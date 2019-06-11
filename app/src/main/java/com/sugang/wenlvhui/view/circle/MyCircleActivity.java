package com.sugang.wenlvhui.view.circle;

import android.os.Bundle;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyCircleActivity extends BaseActivity {


    @BindView(R.id.MyCircle_ReturnButton)
    AutoLinearLayout MyCircleReturnButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_my_circle;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }


    @OnClick(R.id.MyCircle_ReturnButton)
    public void onViewClicked() {
        finish();
    }
}
