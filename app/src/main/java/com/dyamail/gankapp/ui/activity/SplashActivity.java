package com.dyamail.gankapp.ui.activity;

import android.content.Intent;
import android.os.Handler;

import com.dyamail.gankapp.R;
import com.dyamail.gankapp.ui.base.BaseActivity;
import com.dyamail.gankapp.ui.base.BasePresenter;


/**
 * Created by dyamail on 2017/8/28.
 */

public class SplashActivity extends BaseActivity {

    @Override
    protected void beforeInit() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                SplashActivity.this.finish();
            }
        }, 2000);
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_splash;
    }
}
