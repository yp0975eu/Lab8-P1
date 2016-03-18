package com.branden;

/**
 * Created by badams on 3/17/16.
 */
public class Butterfly extends Insect{
    private String wingColor;
    private String favoriteFlower;

    public Butterfly(String name, int wings, String wingColor, String favoriteFlower) {
        this.name = name;
        this.wings = wings;
        this.wingColor = wingColor;
        this.favoriteFlower = favoriteFlower;
    }

    private String getWingColor() {
        return wingColor;
    }

    private void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    private String getFavoriteFlower() {
        return favoriteFlower;
    }

    private void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }
    public void printSpeciesData(){
        System.out.println("\nA " + getName() + " butterfly has "+ getLegs() +" legs, "+ getWings() +" wings, it is " + getWingColor() +" and likes a plant called " + getFavoriteFlower() + ".");
    }

}
