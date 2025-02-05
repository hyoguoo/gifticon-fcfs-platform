package com.hyoguoo.orderservice.order.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {

    PENDING("PENDING"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED"),
    CANCELED("CANCELED"),
    ;

    private final String value;
}
