package com.dyamail.gankapp.ui.presenter;

import com.dyamail.gankapp.ui.base.BasePresenter;
import com.dyamail.gankapp.ui.iView.LoginView;
import com.dyamail.gankapp.ui.iView.RegisterView;

/**
 * Created by dyamail on 2017/8/29.
 */

public interface RegisterPresenter extends BasePresenter<RegisterView> {
    void userRegister(String account,String email, String password);
}
