package com.dyamail.gankapp.ui.activity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dyamail.gankapp.R;
import com.dyamail.gankapp.ui.base.BaseActivity;
import com.dyamail.gankapp.ui.iView.LoginView;
import com.dyamail.gankapp.ui.presenter.impl.LoginPresenterImpl;
import com.dyamail.gankapp.utils.EmptyUtils;
import com.dyamail.gankapp.utils.ToastUtils;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by dyamail on 2017/8/29.
 */

public class LoginActivity extends BaseActivity<LoginPresenterImpl> implements LoginView {

    @Bind(R.id.edit_account)
    EditText mEditAccount;
    @Bind(R.id.edit_password)
    EditText mEditPassword;
    @Bind(R.id.btn_login)
    Button mBtnLogin;
    @Bind(R.id.tv_forget_password)
    TextView mTvForgetPassword;
    @Bind(R.id.tv_register_user)
    TextView mTvRegisterUser;
    @Bind(R.id.toolbar_title)
    TextView mToolbarTitle;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void beforeInit() {
        setToolbarTitle("登录");
    }

    @Override
    protected LoginPresenterImpl createPresenter() {
        return new LoginPresenterImpl();
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_login;
    }


    @OnClick({R.id.btn_login, R.id.tv_forget_password, R.id.tv_register_user})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                accountIsTrue();
                break;
            case R.id.tv_forget_password:
                break;
            case R.id.tv_register_user:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
        }
    }

    private void accountIsTrue() {
        boolean accountIs = EmptyUtils.isEmpty(mEditAccount.getText().toString().trim());
        boolean passWordIs = EmptyUtils.isEmpty(mEditAccount.getText().toString().trim());
        if (accountIs) {
            ToastUtils.showShort("手机号码不能为空");
            return;
        }
        if (passWordIs) {
            ToastUtils.showShort("密码不能为空");
            return;
        }
        if (mEditPassword.getText().toString().trim().length() < 6) {
            ToastUtils.showShort("密码最少为6位");
            return;
        }
        mPresenter.userLogin(mEditAccount.getText().toString().trim(),
                mEditAccount.getText().toString().trim());
    }

    @Override
    public void showProgressDialog() {
        ToastUtils.showShort("正在登录");
    }


    @Override
    public void hideProgressDialog() {
        ToastUtils.showShort("登录完成");
    }

    @Override
    public void LoginSucceed() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
