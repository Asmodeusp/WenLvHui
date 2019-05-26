package com.sugang.wenlvhui.view.home.literarytraining;


import android.content.Intent;
import android.view.View;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
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
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"唱歌");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //舞蹈
            case R.id.LiteraryTraining_DanceButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"舞蹈");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //书法
            case R.id.LiteraryTraining_ShuFaButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"书法");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //剪纸
            case R.id.LiteraryTraining_PaperCutButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"剪纸");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //刺绣
            case R.id.LiteraryTraining_CixiuButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"刺绣");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //乐器
            case R.id.LiteraryTraining_YueQiButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"乐器");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //健身
            case R.id.LiteraryTraining_jianshenButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"健身");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //绘画
            case R.id.LiteraryTraining_HuihuaButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"绘画");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //摄影
            case R.id.LiteraryTraining_SheYingButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"摄影");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //武术
            case R.id.LiteraryTraining_WushuButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"武术");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //乒乓球
            case R.id.LiteraryTraining_TabletennisButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"乒乓球");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
            //游泳
            case R.id.LiteraryTraining_SwimmingButton:
                SPUtils.put(this, SPKey.WENYIPEIXUN_TYPE,"游泳");
                startActivity(new Intent(this,LiteraryTrainingDetailsActivity.class));
                break;
        }
    }
}
