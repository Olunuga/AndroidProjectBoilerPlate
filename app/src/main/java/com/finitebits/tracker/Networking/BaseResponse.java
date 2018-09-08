package com.finitebits.tracker.Networking;

/**
 * Created by myorh on 08/09/2018.
 */

public class BaseResponse<T> {
    private String status;
    public T data;

    public String getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setData(T data) {
        this.data = data;
    }
}
