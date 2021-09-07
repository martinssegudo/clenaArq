package com.bank.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Client {
    private String firstName;
    private String lastName;
    private String documentNumber;
    private LocalDate birthDay;
}
