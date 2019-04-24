package com.sugang.wenlvhui.view.home.literarytraining;


import android.view.View;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.OnClick;

//文艺培训
public class LiteraryTrainingActivity extends BaseActivity {


    @BindView(R.id.LiteraryTraining_ReturnButton)
    AutoLinearLayout LiteraryTrainingReturnButton;
    @BindView(R.id.LiteraryTraining_SingButton)
    AutoRelativeLayout LiteraryTrainingSingButton;
    @BindView(R.id.LiteraryTraining_DanceButton)
    AutoRelativeLayout LiteraryTrainingDanceButton;
    @BindView(R.id.LiteraryTraining_ShuFaButton)
    AutoRelativeLayout LiteraryTrainingShuFaButton;
    @BindView(R.id.LiteraryTraining_PaperCutButton)
    AutoRelativeLayout LiteraryTrainingPaperCutButton;
    @BindView(R.id.LiteraryTraining_CixiuButton)
    AutoRelativeLayout LiteraryTrainingCixiuButton;
    @BindView(R.id.LiteraryTraining_YueQiButton)
    AutoRelativeLayout LiteraryTrainingYueQiButton;
    @BindView(R.id.LiteraryTraining_jianshenButton)
    AutoRelativeLayout LiteraryTrainingJianshenButton;
    @BindView(R.id.LiteraryTraining_HuihuaButton)
    AutoRelativeLayout LiteraryTrainingHuihuaButton;
    @BindView(R.id.LiteraryTraining_SheYingButton)
    AutoRelativeLayout LiteraryTrainingSheYingButton;
    @BindView(R.id.LiteraryTraining_WushuButton)
    AutoRelativeLayout LiteraryTrainingWushuButton;
    @BindView(R.id.LiteraryTraining_TabletennisButton)
    AutoRelativeLayout LiteraryTrainingTabletennisButton;
    @BindView(R.id.LiteraryTraining_SwimmingButton)
    AutoRelativeLayout LiteraryTrainingSwimmingButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_literary_training;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.LiteraryTraining_ReturnButton, R.id.LiteraryTraining_SingButton, R.id.LiteraryTraining_DanceButton, R.id.LiteraryTraining_ShuFaButton, R.id.LiteraryTraining_PaperCutButton, R.id.LiteraryTraining_CixiuButton, R.id.LiteraryTraining_YueQiButton, R.id.LiteraryTraining_jianshenButton, R.id.LiteraryTraining_HuihuaButton, R.id.LiteraryTraining_SheYingButton, R.id.LiteraryTraining_WushuButton, R.id.LiteraryTraining_TabletennisButton, R.id.LiteraryTraining_SwimmingButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            //返回
            case R.id.LiteraryTraining_ReturnButton:
                finish();
                break;
            //歌唱
            case R.id.LiteraryTraining_SingButton:
                break;
            //舞蹈
            case R.id.LiteraryTraining_DanceButton:
                break;
            //书法
            case R.id.LiteraryTraining_ShuFaButton:
                break;
            //剪纸
            case R.id.LiteraryTraining_PaperCutButton:
                break;
            //刺绣
            case R.id.LiteraryTraining_CixiuButton:
                break;
            //乐器
            case R.id.LiteraryTraining_YueQiButton:
                break;
            //健身
            case R.id.LiteraryTraining_jianshenButton:
                break;
            //绘画
            case R.id.LiteraryTraining_HuihuaButton:
                break;
            //摄影
            case R.id.LiteraryTraining_SheYingButton:
                break;
            //武术
            case R.id.LiteraryTraining_WushuButton:
                break;
            //乒乓球
            case R.id.LiteraryTraining_TabletennisButton:
                break;
            //游泳
            case R.id.LiteraryTraining_SwimmingButton:
                break;
        }
    }
}
