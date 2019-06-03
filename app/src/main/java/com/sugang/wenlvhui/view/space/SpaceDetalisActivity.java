package com.sugang.wenlvhui.view.space;


import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class SpaceDetalisActivity extends BaseActivity {


    @BindView(R.id.SpaceDetalisReturnButton)
    AutoLinearLayout SpaceDetalisReturnButton;
    @BindView(R.id.SpaceDetalisGuanCangText)
    TextView SpaceDetalisGuanCangText;
    @BindView(R.id.SpaceDetalisGuanCangLine)
    View SpaceDetalisGuanCangLine;
    @BindView(R.id.SpaceDetalisGuanCangButton)
    AutoRelativeLayout SpaceDetalisGuanCangButton;
    @BindView(R.id.SpaceDetalisDongTaiText)
    TextView SpaceDetalisDongTaiText;
    @BindView(R.id.SpaceDetalisDongTaiLine)
    View SpaceDetalisDongTaiLine;
    @BindView(R.id.SpaceDetalisDongTaiButton)
    AutoRelativeLayout SpaceDetalisDongTaiButton;
    @BindView(R.id.SpaceDetalisFrameLayout)
    FrameLayout SpaceDetalisFrameLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_space_detalis;
    }

    @Override
    protected void init() {
        setContentView(R.id.SpaceDetalisFrameLayout, SpaceGuanCangFragment.class);
        SpaceDetalisGuanCangLine.setBackgroundColor(getResources().getColor(R.color.H2));
        SpaceDetalisDongTaiLine.setBackgroundColor(getResources().getColor(R.color.H3));

    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.SpaceDetalisReturnButton, R.id.SpaceDetalisGuanCangButton, R.id.SpaceDetalisDongTaiButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.SpaceDetalisReturnButton:
                finish();
                break;
            case R.id.SpaceDetalisGuanCangButton:
                setContentView(R.id.SpaceDetalisFrameLayout,SpaceGuanCangFragment.class);
                SpaceDetalisGuanCangLine.setBackgroundColor(getResources().getColor(R.color.H2));
                SpaceDetalisDongTaiLine.setBackgroundColor(getResources().getColor(R.color.H3));

                break;
            case R.id.SpaceDetalisDongTaiButton:
                setContentView(R.id.SpaceDetalisFrameLayout, SpaceDongTaiFragment.class);
                SpaceDetalisGuanCangLine.setBackgroundColor(getResources().getColor(R.color.H3));
                SpaceDetalisDongTaiLine.setBackgroundColor(getResources().getColor(R.color.H2));
                break;
        }
    }
}
