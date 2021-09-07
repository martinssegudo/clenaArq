package com.bank.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class AccountInformation {
    private BigDecimal actualBalance;
    private List<Movement> movimentsForPeriod;
}
