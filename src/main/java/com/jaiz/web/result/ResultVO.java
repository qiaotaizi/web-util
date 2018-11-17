package com.jaiz.web.result;

import java.util.Date;
import java.util.Map;

public class ResultVO {

    /**
     * http状态码
     */
    private int status;

    /**
     * 问题描述
     */
    private String message;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 异常
     */
    private String error;

    /**
     * 请求路径
     */
    private String path;

    /**
     * 返回值结果集
     */
    private Map<String,Object> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
