package com.bank.service.exceptions;

public class ValueNotSuppertedException extends Exception{
    private String msg;

    public ValueNotSuppertedException(String msg){
        super(msg);
        this.msg = msg;
    }
}
