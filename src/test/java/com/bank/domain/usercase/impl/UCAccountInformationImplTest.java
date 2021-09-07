package com.bank.domain.usercase.impl;

import com.bank.database.repositories.AccounRepository;
import com.bank.domain.entity.AccountInformation;
import com.bank.domain.enums.AccountMovementType;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UCAccountInformationImplTest {

    @Mock
    AccounRepository accounRepository;
    @InjectMocks
    UCAccountInformationImpl uCAccountInformationImpl;


    public UCAccountInformationImplTest(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testBalance() throws Exception {
        when(accounRepository.accountBalace(anyString(),anyString()))
                .thenReturn(BigDecimal.ZERO);
        BigDecimal result = uCAccountInformationImpl
                .balance(BuildDomainModels.buildAccount());
        assertEquals(new BigDecimal(0), result);
    }

    @Test
    public void testAccountChange() throws Exception {
        BigDecimal result = uCAccountInformationImpl.accountChange(null, null, new BigDecimal(0), AccountMovementType.DEPOSIT);
        assertNotNull(result);
    }

    @Test
    public void testGetAccountInformation() throws Exception {
        AccountInformation result = uCAccountInformationImpl.getAccountInformation(null, LocalDateTime.of(2021, Month.SEPTEMBER, 7, 17, 33, 39), LocalDateTime.of(2021, Month.SEPTEMBER, 7, 17, 33, 39));
        assertNotNull(result);
    }
}