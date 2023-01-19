package com.cinema.fraud.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "fraud")
public class Fraud extends BaseEntity {

    @Builder
    public Fraud(Long id, Timestamp lastUpdate, Long customerId, Boolean isFraudster) {
        super(id, lastUpdate);
        this.customerId = customerId;
        this.isFraudster = isFraudster;
    }

    private Long customerId;
    private Boolean isFraudster;
}
