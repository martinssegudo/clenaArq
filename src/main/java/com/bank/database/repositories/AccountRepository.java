package com.bank.database.repositories;

import com.bank.database.entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    public AccountEntity findByAccountNumberAndAgency(String accountNumber, String agency);

    @Query( "SELECT ac.atualBalance " +
            "FROM AccountEntity ac " +
            "WHERE ac.accountNumber = :accountNumber " +
            "   and ac.agency")
    public BigDecimal accountBalace(@Param("agency") String agencyNumer,
                                    @Param("accountNumber") String accountNumber);
}
