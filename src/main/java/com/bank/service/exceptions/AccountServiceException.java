package com.bank.service.exceptions;

public class AccountServiceException extends Exception{
    private String message;
    public AccountServiceException(String message){
        super(message);
        this.message = message;
    }
}
