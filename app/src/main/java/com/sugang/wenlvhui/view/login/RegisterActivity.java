package com.sugang.wenlvhui.view.login;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.login.RegisterPhoneContract;
import com.sugang.wenlvhui.contract.login.RegisterPhoneContract.RegisterPhoneView;
import com.sugang.wenlvhui.model.bean.login.RegisterPhoneBean;
import com.sugang.wenlvhui.presenter.login.RegisterPhonePresenterImp;
import com.sugang.wenlvhui.utils.MD5Utils;
import com.sugang.wenlvhui.utils.SmsCodeDownUtil;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;

import java.io.IOException;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RegisterActivity extends BaseActivity <RegisterPhonePresenterImp>implements RegisterPhoneView {


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
    private int i;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget_password;
    }

    @Override
    protected void init() {
        ForgetPasswordForgetPasswordbtn.setText("注册");
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
                    i = (int) ((Math.random() * 9 + 1) * 10000);
                    sendSMSCode();
                }
                break;
            case R.id.ForgetPasswordForgetPasswordbtn:
                int code = Integer.parseInt(ForgetPasswordInputPassword.getText().toString().trim());
                if (i==code) {
                    presenter.getRegisterPhoneBean(ForgetPasswordPhoneNumber.getText().toString().trim());
                }else{
                    Toast.makeText(this, "验证码不正确", Toast.LENGTH_SHORT).show();
                }
                presenter.getRegisterPhoneBean(ForgetPasswordPhoneNumber.getText().toString().trim());
                break;
        }
    }

    private void sendSMSCode() {
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody body = new FormBody.Builder()
                .add("accountSid","9897336")
                .add("smsid","337900")
                .add("to",ForgetPasswordPhoneNumber.getText().toString().trim())
                .add("sig",MD5Utils.encode("9897336"+"650F7AB7-985C-0630-E3AD-BFA387A96F30"+TimeUtils.parssLongTime(new Date().getTime())))
                .add("smsContent","您的验证码是"+i+"，千万不要告诉别人哦！小心别人偷窥你的秘密哦！")
                .add("timestamp",TimeUtils.parssLongTime(new Date().getTime()))
                .build();
        Request request = new Request.Builder().url("http://sms.hongsite.com/index.php?s=Smssend").post(body).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        });
    }

    @Override
    public void showRegisterPhoneBean(RegisterPhoneBean bookTuijianBean) {
        if (bookTuijianBean.getMsg().equals("可以注册")) {
            SPUtils.put(RegisterActivity.this, SPKey.USER_MOBILE,ForgetPasswordPhoneNumber.getText().toString().trim());
            startActivity(new Intent(RegisterActivity.this,SetPasswordActivity.class));
        }
        else {
            Toast.makeText(this, bookTuijianBean.getMsg(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showError(String string) {

    }
}
