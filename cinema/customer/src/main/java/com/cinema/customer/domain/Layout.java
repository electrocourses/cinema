package com.cinema.customer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Layout {
    THEATER("Theater"),

    USHAPE("U-Shape"),

    BOARD("Board Meeting");

    private String description;

}
