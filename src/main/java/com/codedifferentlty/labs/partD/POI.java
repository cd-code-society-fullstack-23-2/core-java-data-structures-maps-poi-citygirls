package com.codedifferentlty.labs.partD;

public class POI implements Comparable <POI>{
    private String name;
    private int[] rating;
    private int ratingCount;

    public POI(String name, int rating) {
        this.name = name;
        this.rating = new int[5];
        this.ratingCount = 0;
    }


    public String getName() {
        return name;
    }

    public Double getRating() {
        if (ratingCount == 0) {
            return null;
        }

        int total = 0;
        for (int i = 0; i < ratingCount; i++) {
            total += rating[i];
        }
        return (double) total / ratingCount;
    }

    public void addRating(int rating) {
        if (ratingCount == this.rating.length) {
            int[] newArray = new int[this.rating.length * 2];
            for (int i = 0; i < this.rating.length; i++) {
                newArray[i] = this.rating[i];
            }
            this.rating = newArray;
        }

        this.rating[ratingCount] = rating;
        ratingCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(POI other) {
        return Integer.compare(this.ratingCount, other.ratingCount);
    }
}
