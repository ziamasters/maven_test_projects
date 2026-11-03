package com.zia.exception;

public class PracticeException extends Exception{
    private String exceptionMsg;
    public PracticeException(String exceptionMsg){
        super(exceptionMsg);
        this.exceptionMsg = exceptionMsg;
    }
}
