package com.codedifferentlty.labs.partD;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class POITest {
    private POI testPOI;

    @BeforeEach
    public void setUp() {
        testPOI = new POI("Test POI");
    }

    @Test
    public void testGetName() {
        assertEquals("Test POI", testPOI.getName());
    }

    @Test
    public void testSetName() {
        testPOI.setName("New POI Name");
        assertEquals("New POI Name", testPOI.getName());
    }

    @Test
    public void testAddRatingAndGetRating() {
        testPOI.addRating(4);
        testPOI.addRating(3);
        testPOI.addRating(5);

        assertEquals(4.0, testPOI.getRating());
    }

}
