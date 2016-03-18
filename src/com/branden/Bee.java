package com.branden;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by badams on 3/17/16.
 */
public class Bee extends Insect {
    private String color;
    private Boolean makesHoney;
    private String favoriteFlower;

    public Bee(String name, int wings, String color, Boolean makesHoney, String favoriteFlower) {
        this.name = name;
        this.wings = wings;
        this.color = color;
        this.makesHoney = makesHoney;
        this.favoriteFlower = favoriteFlower;
    }
    private String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void printSpeciesData(){
        String honey = makesHoney ? " does " : " does not";
        System.out.println("\nA " + getName() + " butterfly has "+ getLegs() +" legs, "+ getWings() +" wings, and likes a plant called " + getFavoriteFlower() + ". This bee " + honey + " make honey.");

    }
}
