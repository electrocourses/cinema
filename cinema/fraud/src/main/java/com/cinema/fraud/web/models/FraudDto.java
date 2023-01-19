package com.cinema.fraud.web.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class FraudDto extends BaseItem{

    @Builder
    public FraudDto(Long id, Timestamp lastUpdate, Long customerId, Boolean isFraudster) {
        super(id, lastUpdate);
        this.customerId = customerId;
        this.isFraudster = isFraudster;
    }

    private Long customerId;
    private Boolean isFraudster;
}
