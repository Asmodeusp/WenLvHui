package com.sugang.wenlvhui.view.circle;

import android.os.Bundle;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CirleDetalisActivity extends BaseActivity {


    @BindView(R.id.CirleDetalisReturnButton)
    AutoLinearLayout CirleDetalisReturnButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_cirle_detalis;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }



    @OnClick(R.id.CirleDetalisReturnButton)
    public void onViewClicked() {
        finish();
    }
}
