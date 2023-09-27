package com.codedifferentlty.labs.partD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class POICounterTest {
    private POICounter poiCounter;
    @BeforeEach
    void setUp(){
        poiCounter = new POICounter();
    }

    @Test
    void addToPOITest01 (){
        poiCounter.addRating("Zoo Miami", 2.0);
        assertEquals(2.0, poiCounter.getPOI().get("Zoo Miami"));

        poiCounter.addRating("Zoo Miami", 1.0);
        assertEquals(3.0,poiCounter.getPOI().get("Zoo Miami"));
    }

    @Test
    void removeFromPOITest01(){
        poiCounter.addRating("Zoo Miami", 5.0);
        assertEquals(5.0, poiCounter.getPOI().get("Zoo Miami"));

        poiCounter.removeRating("Zoo Miami", 1.0);
        assertEquals(4.0, poiCounter.getPOI().get("Zoo Miami"));

        poiCounter.removeRating("Zoo Miami",4.0);
        assertEquals(0.0, poiCounter.getPOI().get("Zoo Miami"));
    }
}
