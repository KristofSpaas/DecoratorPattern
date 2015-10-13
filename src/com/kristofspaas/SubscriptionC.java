package com.kristofspaas;

/**
 * Created by Kristof on 13/10/2015.
 */
public class SubscriptionC extends Subscription {

    public SubscriptionC() {
        description = "Subscription C";
    }

    @Override
    public double cost() {
        return 47.60;
    }
}
