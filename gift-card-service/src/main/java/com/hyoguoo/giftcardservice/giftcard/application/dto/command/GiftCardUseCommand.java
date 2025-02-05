package com.hyoguoo.giftcardservice.giftcard.application.dto.command;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GiftCardUseCommand {

    private final Long giftCardUserId;
    private final Long usedUserId;
    private final Long usedAmount;
}
