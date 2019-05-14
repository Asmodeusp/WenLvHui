package com.sugang.wenlvhui.view.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
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

                break;
            case R.id.Loginloginbtn:
                break;
        }
    }
}
