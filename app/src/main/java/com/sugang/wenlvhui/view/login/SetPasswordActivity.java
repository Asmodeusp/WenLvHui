package com.sugang.wenlvhui.view.login;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.login.RegisterContract;
import com.sugang.wenlvhui.model.bean.login.RegisterBean;
import com.sugang.wenlvhui.model.bean.login.UserBean;
import com.sugang.wenlvhui.presenter.login.RegisterPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.MainActivity;


import butterknife.BindView;
import butterknife.OnClick;

public class SetPasswordActivity extends BaseActivity<RegisterPresenterImp> implements RegisterContract.RegisterView {


    @BindView(R.id.SetPassword_return)
    ImageView SetPasswordReturn;
    @BindView(R.id.SetPasswordPhoneNumber)
    EditText SetPasswordPhoneNumber;
    @BindView(R.id.SetPasswordInputPassword)
    EditText SetPasswordInputPassword;
    @BindView(R.id.SetPasswordSetPasswordbtn)
    Button SetPasswordSetPasswordbtn;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_set_password;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.SetPassword_return, R.id.SetPasswordSetPasswordbtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.SetPassword_return:
                finish();
                break;
            case R.id.SetPasswordSetPasswordbtn:
                String mater = "^[a-zA-Z]\\w{5,17}$";
                if (SetPasswordPhoneNumber.getText().toString().isEmpty()) {
                    Toast.makeText(this, "请检查是否输入", Toast.LENGTH_SHORT).show();
                } else if (!SetPasswordPhoneNumber.getText().toString().trim().matches(mater)) {
                    Toast.makeText(this, "您的密码有点简单哦！", Toast.LENGTH_SHORT).show();
                } else if (!(SetPasswordPhoneNumber.getText().toString().trim().equals(SetPasswordInputPassword.getText().toString().trim()))) {
                    Toast.makeText(this, "两次输入不一致", Toast.LENGTH_SHORT).show();
                } else {
                    String phone = (String) SPUtils.get(SetPasswordActivity.this, SPKey.USER_MOBILE, "");
                    presenter.getRegisterBean(phone, SetPasswordPhoneNumber.getText().toString().trim());
                }
                break;
        }
    }

    @Override
    public void showRegisterBean(RegisterBean registerBean) {
        if (registerBean.getDate() != null) {
            UserBean user = registerBean.getDate().getUserBean();
            if (user.getPhone() != null) {
                SPUtils.put(SetPasswordActivity.this, SPKey.USER_MOBILE, user.getPhone());
            }
            if (user.getId() != 0) {
                SPUtils.put(SetPasswordActivity.this, SPKey.USER_ID, user.getId());
            }
            if (user.getNickName() != null) {
                SPUtils.put(SetPasswordActivity.this, SPKey.NICK_NAME, user.getNickName());
            }
            if (user.getUsername() != null) {
                SPUtils.put(SetPasswordActivity.this, SPKey.USERNAME, user.getUsername());
            }
            if (user.getHeadPic() != null) {
                SPUtils.put(SetPasswordActivity.this, SPKey.HEAD_PIC, user.getHeadPic());
            }
            if (user.getUsertype() != 0) {
                SPUtils.put(SetPasswordActivity.this, SPKey.USER_TYPE, user.getUsertype());
            }
            SPUtils.put(SetPasswordActivity.this, SPKey.IS_LOGIN, true);
            startActivity(new Intent(SetPasswordActivity.this, MainActivity.class));
            finish();
        }
    }

    @Override
    public void showError(String string) {


    }
}
