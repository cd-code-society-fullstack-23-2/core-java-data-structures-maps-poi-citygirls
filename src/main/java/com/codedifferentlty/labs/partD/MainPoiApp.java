package com.codedifferentlty.labs.partD;

// Main class to demonstrate and compare POI objects

public class MainPoiApp {
    public static void main(String[] args) {
        // Create instances of various POI objects

        POI southBeach = new POI("South Beach", 2);
        POI versaceMansion = new POI("Versace Mansion", 3);
        POI wynWood = new POI("Wynwood", 1);
        POI designDistrict = new POI("Design District", 3);
        POI clubLiv = new POI("Club Liv", 5);
        POI clubEleven = new POI("Club Eleven", 1);

        // Compare and print the ratings of different POI objects

        compareAndPrint(southBeach, versaceMansion);
        compareAndPrint(wynWood, designDistrict);
        compareAndPrint(clubLiv, clubEleven);
    }

    // Method to compare two POI objects and print the comparison result

    private static void compareAndPrint(POI poi1, POI poi2) {
        if (poi1.compareTo(poi2) > 0) {
            System.out.println(poi1.getName() + " has a higher rating (" + poi1.getRating() + ") than " + poi2.getName() + " (" + poi2.getRating() + ")");
        } else if (poi1.compareTo(poi2) < 0) {
            System.out.println(poi1.getName() + " has a lower rating (" + poi1.getRating() + ") than " + poi2.getName() + " (" + poi2.getRating() + ")");
        } else {
            System.out.println(poi1.getName() + " and " + poi2.getName() + " have equal ratings (" + poi1.getRating() + ")");
        }
    }
}
