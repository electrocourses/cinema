package com.cinema.fraud.repository;

import com.cinema.fraud.domain.Fraud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudRepository extends JpaRepository<Fraud, Long> {
}
