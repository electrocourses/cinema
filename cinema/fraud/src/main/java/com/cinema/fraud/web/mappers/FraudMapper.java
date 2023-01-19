package com.cinema.fraud.web.mappers;

import com.cinema.fraud.domain.Fraud;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import com.cinema.fraud.web.models.FraudDto;

@Mapper
@DecoratedWith(FraudMappedDecorator.class)
public interface FraudMapper {

    FraudDto fraudToFraudDto(Fraud fraud);

    Fraud fraudDtoToFraud(FraudDto fraudDto);
}
