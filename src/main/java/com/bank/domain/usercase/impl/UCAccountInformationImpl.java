package com.bank.domain.usercase.impl;

import com.bank.domain.entity.Account;
import com.bank.domain.entity.AccountInformation;
import com.bank.domain.entity.Client;
import com.bank.domain.enums.AccountMovementType;
import com.bank.domain.exceptions.AccountException;
import com.bank.domain.usercase.UCAccountInformation;
import com.bank.domain.util.MessageUtil;
import com.bank.service.contracts.AccountService;
import com.bank.service.exceptions.AccountServiceException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
@Log4j2
public class UCAccountInformationImpl implements UCAccountInformation {
    @Value("erro")
    private String messagens;
    private AccountService accountService;

    @Autowired
    public UCAccountInformationImpl(AccountService accountService){
        this.accountService = accountService;
    }

    @Override
    public BigDecimal balance(Account account) throws AccountException {
        try {
            return accountService.accountBalace(account.getAgency(),account.getAccountNumber());
        } catch (AccountServiceException e) {
            log.error("Error with trying get a balance");
            throw new AccountException(MessageUtil.pickRandomMessage(messagens));
        }
    }

    @Override
    public BigDecimal accountChange(Client client, Account account, BigDecimal value, AccountMovementType movimentType) {
        return null;
    }

    @Override
    public AccountInformation getAccountInformation(Account account, LocalDateTime initialDate, LocalDateTime endDate) {
        return null;
    }
}
