package com.sugang.wenlvhui.view.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.utils.SmsCodeDownUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgetPasswordActivity extends BaseActivity {


    @BindView(R.id.ForgetPassword_return)
    ImageView ForgetPasswordReturn;
    @BindView(R.id.ForgetPasswordPhoneNumber)
    EditText ForgetPasswordPhoneNumber;
    @BindView(R.id.ForgetPasswordInputPassword)
    EditText ForgetPasswordInputPassword;
    @BindView(R.id.ForgetPassword_PhotoCodeText)
    TextView ForgetPasswordPhotoCodeText;
    @BindView(R.id.ForgetPasswordForgetPasswordbtn)
    Button ForgetPasswordForgetPasswordbtn;
    private SmsCodeDownUtil smsCodeDownUtil;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget_password;
    }

    @Override
    protected void init() {
        ForgetPasswordForgetPasswordbtn.setText("重置密码");
    }

    @Override
    protected void loadDate() {

    }



    @OnClick({R.id.ForgetPassword_return, R.id.ForgetPassword_PhotoCodeText, R.id.ForgetPasswordForgetPasswordbtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ForgetPassword_return:
                finish();
                break;
            case R.id.ForgetPassword_PhotoCodeText:
                String telRegex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))\\d{8}$";// "[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
                //正则判断手机号
                if (!ForgetPasswordPhoneNumber.getText().toString().trim().matches(telRegex)) {
                    Toast.makeText(this, "请输入正确的手机号", Toast.LENGTH_SHORT).show();
                } else if (ForgetPasswordPhoneNumber.getText().toString().trim().isEmpty()) {
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                } else {
//               倒计时
                    smsCodeDownUtil = new SmsCodeDownUtil(ForgetPasswordPhotoCodeText, "%s", 60);
                    smsCodeDownUtil.start();
                    String countdownText = smsCodeDownUtil.getCountdownText();
                    ForgetPasswordPhotoCodeText.setText(countdownText);
                }
                break;
            case R.id.ForgetPasswordForgetPasswordbtn:
                break;
        }
    }
}
