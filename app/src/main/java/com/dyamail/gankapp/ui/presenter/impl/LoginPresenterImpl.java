package com.dyamail.gankapp.ui.presenter.impl;

import android.os.Handler;

import com.dyamail.gankapp.ui.base.BasePresenterImpl;
import com.dyamail.gankapp.ui.iView.LoginView;
import com.dyamail.gankapp.ui.presenter.LoginPresenter;
import com.dyamail.gankapp.utils.ToastUtils;

/**
 * Created by dyamail on 2017/8/29.
 */

public class LoginPresenterImpl extends BasePresenterImpl<LoginView> implements LoginPresenter {
    @Override
    public void userLogin(String account, String password) {
        mView.showProgressDialog();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.hideProgressDialog();
            }
        },2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.LoginSucceed();
            }
        },2000);
    }
}
