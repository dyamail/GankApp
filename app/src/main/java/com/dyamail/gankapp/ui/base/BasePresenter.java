package com.dyamail.gankapp.ui.base;

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();
}
