package com.bank.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Account {
    private Client client;
    private String accountNumber;
    private String agency;
}
