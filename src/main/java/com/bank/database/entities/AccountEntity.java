package com.bank.database.entities;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@Entity
@Table(name = "TB_ACCOUNT")
@GenericGenerator(
        name = "SEQ_ACCOUNT",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
                @Parameter(name = "sequence_name", value = "SEQ_ACCOUNT"),
                @Parameter(name = "initial_value", value = "1"),
                @Parameter(name = "increment_size", value = "1")
        }
)
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ACCOUNT")
    @Column(name = "ID_ACCOUNT")
    private Long id;

    @OneToOne
    @JoinColumn(name = "ID_CLIENT")
    private ClientEntity clientEntity;

    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Column(name = "AGENCY_NUMBER")
    private String agency;
    @Column(name = "ACTUAL_BALANCE")
    private BigDecimal atualBalance;
}
