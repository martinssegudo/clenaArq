package com.bank.service.contracts;

import com.bank.service.dto.AccountDTO;
import com.bank.service.dto.ClientDTO;

import java.math.BigDecimal;

public interface MovementeService {
    boolean deposit(AccountDTO account, BigDecimal value, ClientDTO clientDTO);
}
