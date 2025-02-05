package com.hyoguoo.userservice.user.domain.enums;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserGiftCardStatus {

    ACTIVE("ACTIVE"),
    USING("USING"),
    USED("USED"),
    EXPIRED("EXPIRED"),
    CANCELED("CANCELED");

    private final String status;

    public static UserGiftCardStatus from(String status) {
        return Arrays.stream(UserGiftCardStatus.values())
                .filter(s -> s.getStatus().equals(status))
                .findFirst()
                .orElseThrow();
    }
}
