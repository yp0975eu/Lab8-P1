package com.branden;

/**
 * Created by badams on 3/17/16.
 */
public abstract class Insect {
    protected String name;
    protected int wings;
    protected final int legs = 6;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
    public int getLegs() {
        return legs;
    }
    public abstract void printSpeciesData();


}
