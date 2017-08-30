package com.dyamail.gankapp.http;

import android.content.Context;

import io.reactivex.Observer;


public abstract class BaseObserver<T> implements Observer<T> {
    private Context context;

    public BaseObserver(Context context) {
        this.context = context;
    }

    @Override
    public void onError(Throwable e) {
        if (e instanceof ApiException.ResultCode) {
            onError((ApiException.ResultCode) e);
        } else {
            onError(new ApiException.ResultCode(e, ApiException.ERROR.UNKNOWN));
        }
    }



    public abstract void onError(ApiException.ResultCode e);

}
