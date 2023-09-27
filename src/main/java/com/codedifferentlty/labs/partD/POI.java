package com.codedifferentlty.labs.partD;

class POI {
    // Private instance variables for the name and rating of the POI
    private String name;
    private double rating;

    // Constructor to initialize a POI with a name and rating
    public POI(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
    // Getter method to retrieve the name of the POI
    public String getName() {
        return name;
    }
    // Getter method to retrieve the rating of the POI
    public double getRating() {
        return rating;
    }
    // Setter method to update the rating of the POI
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Custom comparison method for comparing two POI objects
    public int compareTo(POI poi2) {
        // Implement your comparison logic here
        // You can compare the ratings of two POI objects and return a result accordingly
        if (this.rating < poi2.rating) {
            return -1;
        } else if (this.rating > poi2.rating) {
            return 1;
        } else {
            return 0; // Ratings are equal
        }
    }
    @Override
    public String toString(){
        return String.format("%s, %.2f", name, rating);
    }
}

