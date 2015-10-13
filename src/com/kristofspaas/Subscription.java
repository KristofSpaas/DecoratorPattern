package com.kristofspaas;

/**
 * Created by Kristof on 13/10/2015.
 */
public abstract class Subscription {

    public String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}


