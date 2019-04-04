package com.sugang.wenlvhui.utils;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.MainActivity;


public class LoginUtils {
    public static boolean isLoginNotFinish(Context context) {
        Boolean ISlogin = (Boolean) SPUtils.get(context, SPKey.IS_LOGIN, false);
        if (!ISlogin) {
            context.startActivity(new Intent(context, MainActivity.class));
            return true;
        } else {
            return false;
        }
    }

    public static void isLoginFinish(Context context) {
        Boolean ISlogin = (Boolean) SPUtils.get(context, SPKey.IS_LOGIN, false);
        if (!ISlogin) {
            context.startActivity(new Intent(context, MainActivity.class));
            ((Activity) context).finish();
        }
    }
}
