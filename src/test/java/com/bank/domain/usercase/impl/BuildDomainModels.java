package com.bank.domain.usercase.impl;

import com.bank.domain.entity.Account;
import com.bank.domain.entity.Client;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BuildDomainModels {

    public static Client buildClient(){
        return Client.builder()
                .birthDay(LocalDate.parse("27/04/1990", DateTimeFormatter.ofPattern("dd/mm/yyyy")))
                .documentNumber("00000000001")
                .firstName("Luiz")
                .lastName("Segundo")
                .build();
    }

    public static Account buildAccount(){
        return Account.builder()
                .accountNumber("010203")
                .agency("0001")
                .build();
    }
}
