package com.bank.domain.exceptions;

public class AccountException extends Exception{
    private String message;

    public AccountException(String message){
        super(message);
        this.message=message;
    }
}
