package org.example;

import org.example.enums.BillingTypeEnum;
import org.example.strategies.CallStrategyImpl;
import org.example.strategies.EmailStrategyImpl;
import org.example.strategies.LetterStrategyImpl;
import org.example.strategies.PushNotificationStrategyImpl;
import org.example.strategies.SmsStrategyImpl;

public class Main {
    public static void main(String[] args) {
        BillingNotificationStrategyContext billingStrategyRegistry = new BillingNotificationStrategyContext();
        billingStrategyRegistry.registerStrategy(new CallStrategyImpl());
        billingStrategyRegistry.registerStrategy(new EmailStrategyImpl());
        billingStrategyRegistry.registerStrategy( new LetterStrategyImpl());
        billingStrategyRegistry.registerStrategy(new PushNotificationStrategyImpl());
        billingStrategyRegistry.registerStrategy(new SmsStrategyImpl());

        BillingTypeEnum billingType = BillingTypeEnum.CALL;

        BillingNotificationStrategy billingNotificationStrategy = billingStrategyRegistry.getStrategy(billingType);
        billingNotificationStrategy.send("You need payment today!");

    }
}