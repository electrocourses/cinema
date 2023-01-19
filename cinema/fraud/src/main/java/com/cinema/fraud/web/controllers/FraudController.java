package com.cinema.fraud.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cinema.fraud.services.FraudService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class FraudController {
    private final FraudService fraudService;

    @GetMapping("/fraud/{userId}")
    public ResponseEntity<Boolean> isFraudster(@PathVariable("userId") Long userId) {
        boolean isFraudulentUser = fraudService.isFraudulentUser(userId);
        return new ResponseEntity(isFraudulentUser, HttpStatus.OK);
    }
}
