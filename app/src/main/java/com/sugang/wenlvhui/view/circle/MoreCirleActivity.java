package com.sugang.wenlvhui.view.circle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MoreCirleActivity extends BaseActivity {


    @BindView(R.id.MyCollection_ReturnButton)
    AutoLinearLayout MyCollectionReturnButton;
    @BindView(R.id.MoreOne)
    AutoLinearLayout MoreOne;
    @BindView(R.id.MoreTwo)
    AutoLinearLayout MoreTwo;
    @BindView(R.id.MoreThree)
    AutoLinearLayout MoreThree;
    @BindView(R.id.MoreFour)
    AutoLinearLayout MoreFour;
    @BindView(R.id.MoreFive)
    AutoLinearLayout MoreFive;
    @BindView(R.id.MoreSix)
    AutoLinearLayout MoreSix;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_more_cirle;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }



    @OnClick({R.id.MyCollection_ReturnButton, R.id.MoreOne})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.MyCollection_ReturnButton:
                finish();
                break;
            case R.id.MoreOne:
                startActivity(new Intent(this,CirleDetalisActivity.class));
                break;
        }
    }
}
