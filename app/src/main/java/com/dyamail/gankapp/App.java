package com.dyamail.gankapp;

import android.app.Application;

import com.dyamail.gankapp.utils.Utils;

/**
 * Created by dyamail on 2017/8/29.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
