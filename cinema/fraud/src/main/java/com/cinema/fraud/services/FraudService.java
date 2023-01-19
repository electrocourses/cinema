package com.cinema.fraud.services;


import com.cinema.fraud.domain.Fraud;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.cinema.fraud.repository.FraudRepository;

@Service
@RequiredArgsConstructor
public class FraudService {

    private final FraudRepository fraudRepository;

    public boolean isFraudulentUser(Long userId) {

        fraudRepository.save(Fraud.builder()
                .isFraudster(false)
                .customerId(userId)
                .build());

        return false;
    }
}
