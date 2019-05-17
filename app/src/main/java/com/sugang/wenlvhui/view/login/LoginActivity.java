package com.sugang.wenlvhui.view.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {


    @BindView(R.id.LoginPhoneNumber)
    EditText LoginPhoneNumber;
    @BindView(R.id.LoginInputPassword)
    EditText LoginInputPassword;
    @BindView(R.id.Loginloginbtn)
    Button Loginloginbtn;
    @BindView(R.id.loginRegisterBtn)
    AutoLinearLayout loginRegisterBtn;
    @BindView(R.id.LoginForgetPasswordBtn)
    AutoRelativeLayout LoginForgetPasswordBtn;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.loginRegisterBtn, R.id.LoginForgetPasswordBtn, R.id.Loginloginbtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.loginRegisterBtn:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));

                break;
            case R.id.LoginForgetPasswordBtn:
                startActivity(new Intent(LoginActivity.this,ForgetPasswordActivity.class));
                break;
            case R.id.Loginloginbtn:
                if (LoginPhoneNumber.getText().toString().isEmpty() || LoginInputPassword.getText().toString().isEmpty()) {
                    Toast.makeText(this, "请检查您的手机号或密码是否输入", Toast.LENGTH_SHORT).show();
                } else {
                    //手机号正则判断
                    String telRegex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))\\d{8}$";
                    // "[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
                    if (!LoginPhoneNumber.getText().toString().trim().matches(telRegex)) {
                        Toast.makeText(this, "请输入正确手机号", Toast.LENGTH_SHORT).show();
                    }
                    SPUtils.put(this, SPKey.USER_MOBILE, LoginPhoneNumber.getText().toString());
                }
                break;
        }
    }
}
