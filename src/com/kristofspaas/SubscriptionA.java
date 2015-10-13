package com.kristofspaas;

/**
 * Created by Kristof on 13/10/2015.
 */
public class SubscriptionA extends Subscription {

    public SubscriptionA() {
        description = "Subscription A";
    }

    @Override
    public double cost() {
        return 10.50;
    }
}
