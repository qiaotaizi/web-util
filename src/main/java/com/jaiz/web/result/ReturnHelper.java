package com.jaiz.web.result;

import java.util.HashMap;
import java.util.Map;

public class ReturnHelper {
    private static final ResultVO UNIVERSAL_FAIL;

    private static final ResultVO UNIVERSAL_SUCCESS;

    static{
        ResultVO fail=new ResultVO();
        fail.setMessage(ReturnConstants.ERROR);
        fail.setStatus(ReturnConstants.FAIL_CODE);
        UNIVERSAL_FAIL=fail;

        ResultVO success=new ResultVO();
        success.setMessage(ReturnConstants.SUCCESS);
        success.setStatus(ReturnConstants.SUCCESS_CODE);
        UNIVERSAL_SUCCESS=success;
    }

    /**
     * 自定义全部结果
     * @param status
     * @param message
     * @param data
     * @return
     */
    protected ResultVO result(int status, String message, Map<String,Object> data){
        ResultVO vo=new ResultVO();
        vo.setStatus(status);
        vo.setData(data);
        vo.setMessage(message);
        return vo;
    }

    /**
     * 简洁成功结果返回
     * @return
     */
    protected ResultVO success(){
        return UNIVERSAL_SUCCESS;
    }

    /**
     * 简洁失败结果返回
     * @return
     */
    protected ResultVO fail(){
        return UNIVERSAL_FAIL;
    }

    /**
     * 自定义失败结果
     * @param status
     * @param message
     * @return
     */
    protected ResultVO fail(int status,String message){
        return result(status,message,null);
    }

    /**
     * 自定义失败信息结果
     * @param message
     * @return
     */
    protected ResultVO fail(String message){
        return fail(ReturnConstants.FAIL_CODE,message);
    }

    /**
     * 返回带数据成功结果
     * @param data
     * @return
     */
    protected ResultVO success(Map<String,Object> data){
        return result(ReturnConstants.SUCCESS_CODE,ReturnConstants.SUCCESS,data);
    }

    /**
     * 快捷返回单一数据成功结果
     * @param key
     * @param value
     * @return
     */
    protected ResultVO success(String key,Object value){
        Map<String,Object> data=new HashMap<>();
        data.put(key,value);
        return success(data);
    }
}
