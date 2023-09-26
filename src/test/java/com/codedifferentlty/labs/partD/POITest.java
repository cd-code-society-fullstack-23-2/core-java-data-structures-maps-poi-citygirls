package com.codedifferentlty.labs.partD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class POITest {

    private POI testPOI;

    @BeforeEach
    public void setUp() {
        testPOI = new POI("South Beach",5);

    }

    @Test
    public void testGetName() {
        assertEquals("South Beach", testPOI.getName());
    }

    @Test
    public void testSetName() {
        testPOI.setName("South Beach");
        assertEquals("South Beach", testPOI.getName());
    }

    @Test
    public void testAddRatingAndGetRating() {
        testPOI.addRating(4);
        testPOI.addRating(3);
        testPOI.addRating(5);

        assertEquals(4.0, testPOI.getRating());
    }

    @Test
    public void compareToTest01(){
        POI poi2 = new POI ("South Beach",4);
        POI poi1 = new POI("Zoo Miami",3);
        assertTrue(poi1.compareTo(poi2) < 0, "Zoo Miami has a higher rating than South Beach");
    }
}