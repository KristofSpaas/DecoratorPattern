package com.kristofspaas;

/**
 * Created by Kristof on 13/10/2015.
 */
public class SubscriptionB extends Subscription {


    public SubscriptionB() {
        description = "Subscription B";
    }

    @Override
    public double cost() {
        return 15.40;
    }
}
