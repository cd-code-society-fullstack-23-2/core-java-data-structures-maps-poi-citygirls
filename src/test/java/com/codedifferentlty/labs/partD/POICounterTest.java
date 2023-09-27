package com.codedifferentlty.labs.partD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class POICounterTest {

    private POICounter poiCounter;

    @BeforeEach
    public void setUp() {
        poiCounter = new POICounter();
    }

    @Test
    public void testAddToPOI() {
        poiCounter.addToPOI("Zoo Miami", 0.0);
        POI poi = poiCounter.getPOI("Zoo Miami");
        assertNotNull(poi);
        assertEquals("Zoo Miami", poi.getName());
    }

    @Test
    public void testRateToPOI() {
        poiCounter.addToPOI("Zoo Miami", 0.0);
        poiCounter.rateToPOI("Zoo Miami", 5.0);
        POI poi = poiCounter.getPOI("Zoo Miami");
        assertEquals(5.0, poi.getRating());
    }

    @Test
    public void testDeletePOI() {
        poiCounter.addToPOI("Zoo Miami", 0.0);
        poiCounter.deletePOI("Zoo Miami");
        assertNull(poiCounter.getPOI("Zoo Miami"));
    }
}

