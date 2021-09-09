package com.bank.service.contracts;

import com.bank.service.exceptions.AccountServiceException;

import java.math.BigDecimal;

public interface AccountService {
    BigDecimal accountBalace(String agencyNumer,
                             String accountNumber) throws AccountServiceException;
}
