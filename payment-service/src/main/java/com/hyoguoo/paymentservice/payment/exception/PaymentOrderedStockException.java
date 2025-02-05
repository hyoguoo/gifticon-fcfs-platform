package com.hyoguoo.paymentservice.payment.exception;

import com.hyoguoo.paymentservice.payment.exception.common.PaymentErrorCode;
import lombok.Getter;

@Getter
public class PaymentOrderedStockException extends Exception {

    private final String code;
    private final String message;

    private PaymentOrderedStockException(PaymentErrorCode code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    public static PaymentOrderedStockException of(PaymentErrorCode errorCode) {
        return new PaymentOrderedStockException(errorCode);
    }
}
