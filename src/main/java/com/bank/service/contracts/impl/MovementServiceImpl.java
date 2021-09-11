package com.bank.service.contracts.impl;

import com.bank.service.contracts.MovementeService;
import com.bank.service.dto.AccountDTO;
import com.bank.service.dto.ClientDTO;

import java.math.BigDecimal;

public class MovementServiceImpl implements MovementeService {
    @Override
    public boolean deposit(AccountDTO account, BigDecimal value, ClientDTO clientDTO) {

        return false;
    }
}
