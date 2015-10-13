package com.kristofspaas;

public class Main {

    public static void main(String[] args) {
        Subscription subscription = new SubscriptionA();

        subscription = new OfflineAvailability(subscription);

        System.out.println("You have chosen for " + subscription.getDescription());
        System.out.println("This subscription costs: " + subscription.cost());
        System.out.println();

        subscription = new PremiumCourses(subscription);

        System.out.println("You have chosen for " + subscription.getDescription());
        System.out.println("This subscription costs: " + subscription.cost());

        System.out.println();

        Subscription subscription2 = new SubscriptionB();

        subscription2 = new OfflineAvailability(subscription2);

        System.out.println("You have chosen for " + subscription2.getDescription());
        System.out.println("This subscription costs: " + subscription2.cost());
        System.out.println();

        subscription2 = new PremiumCourses(subscription2);

        System.out.println("You have chosen for " + subscription2.getDescription());
        System.out.println("This subscription costs: " + subscription2.cost());
    }
}
