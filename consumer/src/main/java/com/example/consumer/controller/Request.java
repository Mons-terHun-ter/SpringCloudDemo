package com.example.consumer.controller;

/**
 * @author libo.a
 * @date 2021/8/20 5:36 下午
 */
public class Request<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        if (null == data) {
            throw new IllegalArgumentException("请求体内数据为空");
        }
        return data;
    }
}