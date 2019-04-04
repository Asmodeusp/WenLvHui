package com.sugang.wenlvhui.base;

public interface BasePresenter<View> {
    void actualView(View view);
    void unActualView();
}