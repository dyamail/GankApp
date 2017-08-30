package com.dyamail.gankapp.ui.presenter;

import com.dyamail.gankapp.ui.base.BasePresenter;
import com.dyamail.gankapp.ui.iView.LoginView;

/**
 * Created by dyamail on 2017/8/29.
 */

public interface LoginPresenter extends BasePresenter<LoginView> {
    void userLogin(String account, String password);
}
