package com.bank.service.dto;

import com.bank.domain.entity.Client;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTO {
    private Client client;
    private String accountNumber;
    private String agency;
}
