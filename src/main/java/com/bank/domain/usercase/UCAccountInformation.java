package com.bank.domain.usercase;

import com.bank.domain.entity.AccountInformation;
import com.bank.domain.enums.AccountMovementType;
import com.bank.domain.entity.Account;
import com.bank.domain.entity.Client;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface UCAccountInformation {
    BigDecimal balance(Account account);
    BigDecimal accountChange(Client client, Account account, BigDecimal value, AccountMovementType movimentType);
    AccountInformation getAccountInformation(Account account, LocalDateTime initialDate, LocalDateTime endDate);
}
