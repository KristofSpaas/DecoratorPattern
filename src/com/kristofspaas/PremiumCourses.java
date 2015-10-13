package com.kristofspaas;

/**
 * Created by Kristof on 13/10/2015.
 */
public class PremiumCourses extends OptionDecorator {
    public Subscription subscription;

    public PremiumCourses(Subscription subscription){
        this.subscription = subscription;
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", with access to Premium Courses";
    }

    @Override
    public double cost() {
        return 6.30 + subscription.cost();
    }
}
