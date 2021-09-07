package com.bank.database.entities;

import com.bank.domain.entity.Account;
import com.bank.domain.entity.Client;
import com.bank.domain.enums.AccountMovementType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "TB_MOVEMENT")
@GenericGenerator(
        name = "SEQ_MOVEMENT",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
                @Parameter(name = "sequence_name", value = "SEQ_MOVEMENT"),
                @Parameter(name = "initial_value", value = "1"),
                @Parameter(name = "increment_size", value = "1")
        }
)
public class MovementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MOVEMENT")
    @Column(name = "ID_MOVEMENT")
    private Long id;

    @Column(name = "MOVEMENT_TYPE")
    @Enumerated
    private AccountMovementType accountMovementType;

    @Column(name = "VALUE_MOVEMENT")
    private BigDecimal valueMoviment;

    @OneToOne
    @JoinColumn(name = "ID_CLIENT")
    private ClientEntity clientMakeMovement;

    @OneToOne
    @JoinColumn(name = "ID_ACCOUNT")
    private AccountEntity accountMovement;

    @Column(name = "MOVEMENT_TIME")
    private LocalDateTime movimentTime;
}
