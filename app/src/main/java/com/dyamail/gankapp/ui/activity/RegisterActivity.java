package com.dyamail.gankapp.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dyamail.gankapp.R;
import com.dyamail.gankapp.ui.base.BaseActivity;
import com.dyamail.gankapp.ui.base.BasePresenter;
import com.dyamail.gankapp.ui.iView.RegisterView;
import com.dyamail.gankapp.ui.presenter.impl.RegisterPresenterImpl;
import com.dyamail.gankapp.utils.EmptyUtils;
import com.dyamail.gankapp.utils.ToastDrawble;
import com.dyamail.gankapp.utils.ToastUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by dyamail on 2017/8/29.
 */

public class RegisterActivity extends BaseActivity<RegisterPresenterImpl> implements RegisterView {
    @Bind(R.id.tv_register_account)
    EditText mTvRegisterAccount;
    @Bind(R.id.tv_register_email)
    EditText mTvRegisterEmail;
    @Bind(R.id.tv_register_password)
    EditText mTvRegisterPassword;
    @Bind(R.id.btn_register)
    Button mBtnRegister;
    @Bind(R.id.btn_start_login)
    Button mBtnStartLogin;

    @Override
    protected void beforeInit() {
        setToolbarTitle("注册");
        getToolbar().setNavigationIcon(R.mipmap.jpush_ic_richpush_actionbar_back);
    }

    @Override
    protected RegisterPresenterImpl createPresenter() {
        return new RegisterPresenterImpl();
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_register;
    }


    @OnClick({R.id.btn_register, R.id.btn_start_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_register:
                String account = mTvRegisterAccount.getText().toString().trim();
                String email = mTvRegisterEmail.getText().toString().trim();
                String password = mTvRegisterPassword.getText().toString().trim();
                userIsTrue(account, email, password);
                break;
            case R.id.btn_start_login:
                break;
        }
    }

    private void userIsTrue(String account, String email, String password) {
        if (account.length() < 6 || EmptyUtils.isEmpty(account)) {
            ToastDrawble.error("账号格式错误,最少为六位", Toast.LENGTH_SHORT);
            return;
        }
        if (email.length() < 6 || EmptyUtils.isEmpty(email)) {
            ToastDrawble.error("email格式错误", Toast.LENGTH_SHORT);
            return;
        }
        if (password.length() < 6 || EmptyUtils.isEmpty(password)) {
            ToastDrawble.error("密码格式错误,最少六位", Toast.LENGTH_SHORT);
            return;
        }
        mPresenter.userRegister(account, email, password);
    }

    @Override
    public void showProgressDialog() {
        ToastUtils.showShort("注册中");
    }

    @Override
    public void hideProgressDialog() {
        ToastUtils.showShort("注册完成");
    }

    @Override
    public void registerSueeccd() {
        finish();
    }
}
