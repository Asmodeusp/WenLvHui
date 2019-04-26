package com.sugang.wenlvhui.view.home.literarytraining;


import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class LiteraryTrainingDetailsActivity extends BaseActivity {


    @BindView(R.id.LiteraryTrainingDetails_ReturnButton)
    AutoLinearLayout LiteraryTrainingDetailsReturnButton;
    @BindView(R.id.LiteraryTrainingDetails_HeadText)
    TextView LiteraryTrainingDetailsHeadText;
    @BindView(R.id.LiteraryTrainingDetailsRecycler)
    RecyclerView LiteraryTrainingDetailsRecycler;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_literary_training_details;
    }

    @Override
    protected void init() {
        LiteraryTrainingDetailsHeadText.setText((CharSequence) SPUtils.get(this, SPKey.WENYIPEIXUN_TYPE, ""));

    }

    @Override
    protected void loadDate() {

    }


    @OnClick(R.id.LiteraryTrainingDetails_ReturnButton)
    public void onViewClicked() {
        finish();
    }


}
