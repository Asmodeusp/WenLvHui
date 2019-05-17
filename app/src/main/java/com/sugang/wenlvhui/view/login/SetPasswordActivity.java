package com.sugang.wenlvhui.view.login;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SetPasswordActivity extends BaseActivity {


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
                if (SetPasswordPhoneNumber.getText().toString().isEmpty() || SetPasswordInputPassword.getText().toString().isEmpty()) {
                    Toast.makeText(this, "请检查是否输入", Toast.LENGTH_SHORT).show();
                } else {
                    if (!SetPasswordPhoneNumber.getText().toString().trim().equals(SetPasswordInputPassword.getText().toString().trim())) {
                        Toast.makeText(this, "两次输入不一致", Toast.LENGTH_SHORT).show();
                    } else {
//                        presenter.getRegisterLoginCode(phone, msmcode, mSetPasswordInputPasswordEd.getText().toString().trim());
                    }
                }
                break;
        }
    }
}
