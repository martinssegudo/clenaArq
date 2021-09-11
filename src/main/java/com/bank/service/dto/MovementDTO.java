package com.bank.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
public class MovementDTO {
    private BigDecimal value;
    private LocalDateTime dateMovement;
    private ClientDTO clientMakeMovement;
}
