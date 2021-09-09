package com.bank.domain.usercase.impl;

import com.bank.domain.entity.Account;
import com.bank.domain.entity.AccountInformation;
import com.bank.domain.enums.AccountMovementType;
import com.bank.domain.exceptions.AccountException;
import com.bank.service.contracts.AccountService;
import com.bank.service.exceptions.AccountServiceException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class UCAccountInformationImplTest {
    @Mock
    AccountService accountService;
    @InjectMocks
    UCAccountInformationImpl uCAccountInformationImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testBalance() throws Exception {
        when(accountService.accountBalace(anyString(), anyString())).thenReturn(new BigDecimal(0));

        BigDecimal result = uCAccountInformationImpl.balance(BuildDomainModels.buildAccount());
        assertEquals(new BigDecimal(0), result);
    }

    @Test(expected = AccountException.class)
    public void testAccountBalaceWithoutAgency() throws Exception {
        when(accountService.accountBalace(any(), anyString())).thenThrow(AccountServiceException.class);

        BigDecimal result = uCAccountInformationImpl.balance(Account.builder()
                .accountNumber("010203")
                .client(BuildDomainModels.buildClient())
                .agency(null)
                .build()
        );
        assertEquals(new BigDecimal(0), result);
    }

    @Test(expected = AccountException.class)
    public void testAccountBalaceWithoutAccoutNumber() throws Exception {
        when(accountService.accountBalace(anyString(), any())).thenThrow(AccountServiceException.class);

        BigDecimal result = uCAccountInformationImpl.balance(Account.builder()
                .accountNumber(null)
                .client(BuildDomainModels.buildClient())
                .agency("0001")
                .build()
        );
        assertEquals(new BigDecimal(0), result);
    }

    @Test
    public void testAccountChange() throws Exception {
        BigDecimal result = uCAccountInformationImpl.accountChange(null, null, new BigDecimal(0), AccountMovementType.DEPOSIT);
        assertEquals(new BigDecimal(0), result);
    }

    @Test
    public void testGetAccountInformation() throws Exception {
        AccountInformation result = uCAccountInformationImpl.getAccountInformation(null, LocalDateTime.of(2021, Month.SEPTEMBER, 8, 21, 24, 30), LocalDateTime.of(2021, Month.SEPTEMBER, 8, 21, 24, 30));
        assertNotNull(result);
    }
}