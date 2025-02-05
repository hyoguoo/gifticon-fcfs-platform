package com.hyoguoo.paymentservice.payment.exception;

import com.hyoguoo.paymentservice.payment.exception.common.PaymentErrorCode;
import lombok.Getter;

@Getter
public class PaymentConfirmException extends RuntimeException {

    private final String code;
    private final String message;

    private PaymentConfirmException(PaymentErrorCode code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    public static PaymentConfirmException of(PaymentErrorCode errorCode) {
        return new PaymentConfirmException(errorCode);
    }
}
