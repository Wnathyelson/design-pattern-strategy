package org.example.strategies;

import org.example.BillingNotificationStrategy;
import org.example.enums.BillingTypeEnum;

public class SmsStrategyImpl implements BillingNotificationStrategy {

    @Override
    public void send(String notification) {
        System.out.println("SMS: " + notification);
    }

    @Override
    public BillingTypeEnum getBillingType() {
        return BillingTypeEnum.SMS;
    }
}