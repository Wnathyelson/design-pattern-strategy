package org.example;

import org.example.enums.BillingTypeEnum;

public interface BillingNotificationStrategy {

    void send(String notification);

    BillingTypeEnum getBillingType();
}
