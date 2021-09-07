package com.bank.domain.usercase.impl;

import com.bank.database.repositories.AccounRepository;
import com.bank.domain.entity.Account;
import com.bank.domain.entity.AccountInformation;
import com.bank.domain.entity.Client;
import com.bank.domain.enums.AccountMovementType;
import com.bank.domain.usercase.UCAccountInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class UCAccountInformationImpl implements UCAccountInformation {

    private AccounRepository accounRepository;

    @Autowired
    public UCAccountInformationImpl(AccounRepository accounRepository){
        this.accounRepository = accounRepository;
    }

    @Override
    public BigDecimal balance(Account account) {
        return accounRepository.accountBalace(account.getAgency(), account.getAccountNumber());
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
