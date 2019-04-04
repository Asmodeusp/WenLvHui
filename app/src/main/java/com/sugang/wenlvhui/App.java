package com.sugang.wenlvhui;


import android.app.Application;
import android.content.Context;

import com.zhy.autolayout.config.AutoLayoutConifg;

public class App extends Application {
    public static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();



    }

//    @Override
//    protected void attachBaseContext(Context base) {
//        super.attachBaseContext(base);
//        MultiDex.install(this);
//    }




//    //设置全局的下拉刷新样式
//    static {
//        SmartRefreshLayout.setDefaultRefreshHeaderCreater(new DefaultRefreshHeaderCreater() {
//            @SuppressLint("ResourceAsColor")
//            @NonNull
//            @Override
//            public RefreshHeader createRefreshHeader(Context context, RefreshLayout refreshLayout) {
//                MyRefreshAnimHeader myRefreshAnimHeader = new MyRefreshAnimHeader(context);
//                myRefreshAnimHeader.setPrimaryColors(R.color.h1);
//                return myRefreshAnimHeader;
//            }
//        });
//    }




}