package org.example;

import org.example.enums.BillingTypeEnum;

import java.util.EnumMap;
import java.util.Map;

public class BillingNotificationStrategyContext {

    private final Map<BillingTypeEnum, BillingNotificationStrategy> strategies = new EnumMap<>(BillingTypeEnum.class);

    public void registerStrategy(BillingNotificationStrategy billingNotificationStrategy) {
        strategies.put(billingNotificationStrategy.getBillingType(), billingNotificationStrategy);
    }

    public BillingNotificationStrategy getStrategy(BillingTypeEnum billingTypeEnum) {
        if (!strategies.containsKey(billingTypeEnum)) {
            throw new IllegalArgumentException("This strategy not exists!");
        }
        return strategies.get(billingTypeEnum);
    }
}
