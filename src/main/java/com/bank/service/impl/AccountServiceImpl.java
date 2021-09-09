package com.bank.service.impl;

import com.bank.database.repositories.AccountRepository;
import com.bank.service.contracts.AccountService;
import com.bank.service.exceptions.AccountServiceException;
import com.bank.service.util.AccountUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public BigDecimal accountBalace(String agency, String accountNumber) throws AccountServiceException {
        BigDecimal result = BigDecimal.ZERO;
        if(AccountUtil.checkAgency(agency)
            && AccountUtil.checkAccountNumber(accountNumber))
            result = accountRepository.accountBalace(agency,accountNumber);
        return result;
    }
}
