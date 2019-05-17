package com.sugang.wenlvhui.view.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.view.MainActivity;

public class WelcomeActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        handler.post(waitSendsRunnable);
    }


//启用一个Handler

    @SuppressLint("HandlerLeak")
    Handler handler = new Handler() {

        @SuppressLint("HandlerLeak")

        public void handleMessage(Message msg) {

            super.handleMessage(msg);

            switch (msg.what) {

                case 0:

                    Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                    break;

                case 1:


                    break;

                default:

                    break;

            }

        }

    };

// 倒计时五秒

    int index = 2;

    Runnable waitSendsRunnable = new Runnable() {

        public void run() {

            if (index > 0) {

                index--;

                try {

                    Thread.sleep(1000);

                    handler.sendEmptyMessage(1);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

                handler.post(waitSendsRunnable);

            } else {

                try {

                    Thread.sleep(1000);

                    handler.sendEmptyMessage(0);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }

        }

    };
}
