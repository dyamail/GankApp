package com.dyamail.gankapp.http;

import io.reactivex.functions.Function;

public class HandleFu<T> implements Function<Response<T>, T> {

    @Override
    public T apply(Response<T> response) throws Exception {
        if (!response.isOk())
            throw new ServerError(response.getCode(), "" + response.getMsg() != null ? response.getMsg() : "");
        return response.getData();
    }
}