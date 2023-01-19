package com.cinema.fraud.web.mappers;

import com.cinema.fraud.domain.Fraud;
import org.springframework.beans.factory.annotation.Autowired;
import com.cinema.fraud.web.models.FraudDto;

public abstract class FraudMappedDecorator implements FraudMapper {

    private FraudMapper fraudMapper;

    @Autowired
    public void setFraudMapper(FraudMapper fraudMapper) {
        this.fraudMapper = fraudMapper;
    }

    @Override
    public FraudDto fraudToFraudDto(Fraud fraud) {
        return fraudMapper.fraudToFraudDto(fraud);
    }

    @Override
    public Fraud fraudDtoToFraud(FraudDto fraudDto) {
        return fraudMapper.fraudDtoToFraud(fraudDto);
    }
}
