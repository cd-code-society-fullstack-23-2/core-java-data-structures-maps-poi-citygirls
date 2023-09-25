package com.codedifferentlty.labs.partD;

import java.util.HashMap;
import java.util.Map;

public class POICounter {

    private Map<String, Double> poi = new HashMap<>();

    public POICounter() {
        poi = new HashMap<>();
    }

    public Map<String, Double> getPOI() {
        return poi;
    }

    public void addToPOI(String name, double rating) {

        double currentRating = poi.getOrDefault(name, rating);
        poi.put(name, currentRating + rating);
    }

    public void removeFromPOI(String name, double rating) {
        if (poi.containsKey(name)) {
            double currentRating = poi.get(name);

            poi.put(name, Math.max(0, currentRating - rating));
        }
    }
}