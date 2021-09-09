package com.bank.service.util;

import com.bank.service.exceptions.AccountServiceException;

public class AccountUtil {
    private AccountUtil(){}

    public static boolean checkAgency(String agency) throws AccountServiceException {
        if(agency!= null
                && !agency.isEmpty()){
            return true;
        }
        throw new AccountServiceException("Aggency didn't present");
    }

    public static boolean checkAccountNumber(String accountNumber) throws AccountServiceException {
        if(accountNumber!= null
                && !accountNumber.isEmpty()){
            return true;
        }
        throw new AccountServiceException("Aggency didn't present");
    }
}
