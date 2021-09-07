package com.bank.adapters;

import com.bank.database.entities.AccountEntity;
import com.bank.domain.entity.Account;
import lombok.Data;

@Data
public class AccountAdapter {
    private Account account;

    public AccountAdapter(AccountEntity accountEntity){
        this.account = Account.builder()
                .agency(accountEntity.getAgency())
                .accountNumber(accountEntity.getAccountNumber())
                .client(new ClientAdapter(accountEntity.getClientEntity()).getClient())
                .build();
    }
}
