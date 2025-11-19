package org.example.strategies;

import org.example.BillingNotificationStrategy;
import org.example.enums.BillingTypeEnum;

public class LetterStrategyImpl implements BillingNotificationStrategy {

    @Override
    public void send(String notification) {
        System.out.println("LETTER: " + notification);
    }

    @Override
    public BillingTypeEnum getBillingType() {
        return BillingTypeEnum.LETTER;
    }
}

