package com.bank.service.dto;

import com.bank.domain.entity.Client;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class AccountDTO {
    private Client client;
    private String accountNumber;
    private String agency;
}
