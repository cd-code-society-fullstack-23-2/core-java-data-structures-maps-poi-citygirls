package com.codedifferentlty.labs.partD;
import java.util.Map;


public class MainPOICounter {
    public static void displayPOI(Map<String, Double> poi) {
        System.out.println("Current Points of Interest: ");

        for (Map.Entry<String, Double> entry : poi.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        POICounter poiCounter = new POICounter();

        poiCounter.addToPOI("South Beach", 2);
        poiCounter.addToPOI("Miami Design District", 3);
        poiCounter.addToPOI("Wynwood", 4);
        poiCounter.addToPOI("Liv", 5);
        poiCounter.addToPOI("Versace Mansion", 3);

        displayPOI(poiCounter.getPOI());

        poiCounter.addToPOI("South Beach", 1);
        poiCounter.removeFromPOI("Miami Design District", .5);

        displayPOI(poiCounter.getPOI());
    }
}
