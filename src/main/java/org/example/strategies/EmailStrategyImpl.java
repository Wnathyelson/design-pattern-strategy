package org.example.strategies;

import org.example.BillingNotificationStrategy;
import org.example.enums.BillingTypeEnum;

public class EmailStrategyImpl implements BillingNotificationStrategy {

    @Override
    public void send(String notification) {
        System.out.println("EMAIL: " + notification);
    }

    @Override
    public BillingTypeEnum getBillingType() {
        return BillingTypeEnum.EMAIL;
    }
}