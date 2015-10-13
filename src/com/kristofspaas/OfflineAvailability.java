package com.kristofspaas;

/**
 * Created by Kristof on 13/10/2015.
 */
public class OfflineAvailability extends OptionDecorator {
    public Subscription subscription;

    public OfflineAvailability(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", with offline availability";
    }

    @Override
    public double cost() {
        return 3.50 + subscription.cost();
    }
}
