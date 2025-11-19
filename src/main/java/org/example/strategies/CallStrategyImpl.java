package org.example.strategies;

import org.example.BillingNotificationStrategy;
import org.example.enums.BillingTypeEnum;

public class CallStrategyImpl implements BillingNotificationStrategy {

    @Override
    public void send(String notification) {
        System.out.println("CALL: " + notification);
    }

    @Override
    public BillingTypeEnum getBillingType() {
        return BillingTypeEnum.CALL;
    }
}