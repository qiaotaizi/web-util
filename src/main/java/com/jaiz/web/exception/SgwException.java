package com.jaiz.web.exception;

/**
 * 自定义异常
 */
public class SgwException extends RuntimeException{

    public SgwException(){
        super();
    }

    public SgwException(String message){
        super(message);
    }

}
