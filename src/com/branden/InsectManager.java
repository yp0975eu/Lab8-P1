package com.branden;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
        LinkedList<Insect> insects = new LinkedList<Insect>();

        Butterfly bf1 = new Butterfly("Monarch", 4, "orange and black", "milkweed");
        Butterfly bf2 = new Butterfly("Common Yellow Swallowtail", 4, "yellow and black", "milk parsley");

        //bf1.printSpeciesData();
        //bf2.printSpeciesData();

        Bee bee1 = new Bee("Honey Bee", 4, "yellow and black", true, "jasmine");
        Bee bee2 = new Bee("Bumble Bee", 4, "black, yellow and white", false, "clover");

        //bee1.printSpeciesData();
        //bee2.printSpeciesData();

        insects.add(bf1);
        insects.add(bf2);
        insects.add(bee1);
        insects.add(bee2);

        for( Insect i : insects){
            i.printSpeciesData();
        }

    }
}
