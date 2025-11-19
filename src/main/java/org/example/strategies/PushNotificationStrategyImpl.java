package org.example.strategies;

import org.example.BillingNotificationStrategy;
import org.example.enums.BillingTypeEnum;

public class PushNotificationStrategyImpl implements BillingNotificationStrategy {

    @Override
    public void send(String notification) {
        System.out.println("PUSH: " + notification);
    }

    @Override
    public BillingTypeEnum getBillingType() {
        return BillingTypeEnum.PUSH;
    }
}