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

        poiCounter.addRating("South Beach", 2);
        poiCounter.addRating("Miami Design District", 3);
        poiCounter.addRating("Wynwood", 4);
        poiCounter.addRating("LIV", 5);
        poiCounter.addRating("Versace Mansion", 3);
        poiCounter.addRating("E11even", 4);

//        displayPOI(poiCounter.getPOI());

        poiCounter.addRating("South Beach", 1);
        poiCounter.removeRating("Miami Design District", .5);

//        displayPOI(poiCounter.getPOI());
    }
}
