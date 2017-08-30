package com.dyamail.gankapp.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.dyamail.gankapp.R;
import com.dyamail.gankapp.ui.base.BaseActivity;
import com.dyamail.gankapp.ui.base.BasePresenter;
import com.dyamail.gankapp.ui.iView.LoginView;
import com.dyamail.gankapp.ui.presenter.impl.LoginPresenterImpl;

import butterknife.Bind;


public class MainActivity extends BaseActivity  {


    @Bind(R.id.toolbar_title)
    TextView mToolbarTitle;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;


    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }


    @Override
    protected void beforeInit() {
        setToolbarTitle("主页面");
        getToolbar().setNavigationIcon(R.mipmap.jpush_ic_richpush_actionbar_back);

    }



}
