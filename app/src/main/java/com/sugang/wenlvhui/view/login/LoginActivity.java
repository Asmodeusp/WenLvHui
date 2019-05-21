package com.sugang.wenlvhui.view.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.login.LoginContract;
import com.sugang.wenlvhui.model.bean.login.LoginBean;
import com.sugang.wenlvhui.model.bean.login.UserBean;
import com.sugang.wenlvhui.presenter.login.LoginPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.MainActivity;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<LoginPresenterImp> implements LoginContract.LoginView {


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
        boolean isLogin = (boolean) SPUtils.get(this, SPKey.IS_LOGIN, false);
        if (isLogin) {
            startActivity(new Intent(this, MainActivity.class));
        }
//        finish();
    }


    @OnClick({R.id.loginRegisterBtn, R.id.LoginForgetPasswordBtn, R.id.Loginloginbtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.loginRegisterBtn:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

                break;
            case R.id.LoginForgetPasswordBtn:
                startActivity(new Intent(LoginActivity.this, ForgetPasswordActivity.class));
                break;
            case R.id.Loginloginbtn:
                //手机号正则判断
                // "[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
                String telRegex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))\\d{8}$";
                if (LoginPhoneNumber.getText().toString().isEmpty() || LoginInputPassword.getText().toString().isEmpty()) {
                    Toast.makeText(this, "请检查您的手机号或密码是否输入", Toast.LENGTH_SHORT).show();
                } else if (!LoginPhoneNumber.getText().toString().trim().matches(telRegex)) {
                    Toast.makeText(this, "请输入正确手机号", Toast.LENGTH_SHORT).show();
                }
                presenter.getLoginBean(LoginPhoneNumber.getText().toString().trim(), LoginInputPassword.getText().toString().trim());
                break;
        }
    }

    @Override
    public void showLoginBean(LoginBean loginBean) {
        if (loginBean.getMsg().equals("登陆失败")) {
            Toast.makeText(this, "请输入正确手机号和密码", Toast.LENGTH_SHORT).show();
        }else{
            SPUtils.put(this, SPKey.IS_LOGIN, true);
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
        if (loginBean.getDate() != null) {
            UserBean user = loginBean.getDate().getUser();
            if (user.getPhone() != null) {
                SPUtils.put(this, SPKey.USER_MOBILE, user.getPhone());
            }
            if (user.getId() != 0) {
                SPUtils.put(this, SPKey.USER_ID, user.getId());
            }
            if (user.getNickName() != null) {
                SPUtils.put(this, SPKey.NICK_NAME, user.getNickName());
            }
            if (user.getUsername() != null) {
                SPUtils.put(this, SPKey.USERNAME, user.getUsername());
            }
            if (user.getHeadPic() != null) {
                SPUtils.put(this, SPKey.USERNAME, user.getHeadPic());
            }
            if (user.getUsertype() != 0) {
                SPUtils.put(this, SPKey.USERNAME, user.getUsertype());
            }

        }

    }

    @Override
    public void showError(String string) {

    }
}
