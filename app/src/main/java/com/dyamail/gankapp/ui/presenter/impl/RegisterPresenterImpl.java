package com.dyamail.gankapp.ui.presenter.impl;

import android.os.Handler;

import com.dyamail.gankapp.ui.base.BasePresenterImpl;
import com.dyamail.gankapp.ui.iView.LoginView;
import com.dyamail.gankapp.ui.iView.RegisterView;
import com.dyamail.gankapp.ui.presenter.LoginPresenter;
import com.dyamail.gankapp.ui.presenter.RegisterPresenter;

/**
 * Created by dyamail on 2017/8/29.
 */

public class RegisterPresenterImpl extends BasePresenterImpl<RegisterView> implements RegisterPresenter {
    @Override
    public void userRegister(String account, String email, String password) {
        mView.showProgressDialog();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.hideProgressDialog();
            }
        }, 2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.registerSueeccd();
            }
        }, 2000);
    }
}
