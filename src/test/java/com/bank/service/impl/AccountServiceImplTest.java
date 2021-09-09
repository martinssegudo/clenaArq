package com.bank.service.impl;

import com.bank.database.repositories.AccountRepository;
import com.bank.service.exceptions.AccountServiceException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


public class AccountServiceImplTest {
    @Mock
    AccountRepository accountRepository;
    @InjectMocks
    AccountServiceImpl accountServiceImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAccountBalace() throws Exception {
        when(accountRepository.accountBalace(anyString(), anyString())).thenReturn(new BigDecimal(0));

        BigDecimal result = accountServiceImpl.accountBalace("0001", "010203");
        assertEquals(new BigDecimal(0), result);
    }

    @Test(expected = AccountServiceException.class)
    public void testAccountBalaceWithoutAgency() throws Exception {
        when(accountRepository.accountBalace(any(), anyString())).thenReturn(new BigDecimal(0));

        BigDecimal result = accountServiceImpl.accountBalace(null, "010203");
        assertEquals(new BigDecimal(0), result);
    }

    @Test(expected = AccountServiceException.class)
    public void testAccountBalaceWithoutAccoutNumber() throws Exception {
        when(accountRepository.accountBalace(anyString(), any())).thenReturn(new BigDecimal(0));

        BigDecimal result = accountServiceImpl.accountBalace("0001", null);
        assertEquals(new BigDecimal(0), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme