package com.bank.domain.entity;

import com.bank.domain.enums.AccountMovementType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class Movement {
    private AccountMovementType accountMovementType;
    private BigDecimal valueMoviment;
    private Client clientMakeMovement;
    private Account accountMovement;
    private LocalDateTime movimentTime;
}
