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
    public void compareToTest01(){
        POI poi2 = new POI ("South Beach",4);
        POI poi1 = new POI("Zoo Miami",3);
        assertFalse(poi1.compareTo(poi2) < 0, "Zoo Miami has a lower rating rating than South Beach");
    }
    @Test
    public void compareToTest02(){
        POI poi2 = new POI ("South Beach", 4);
        POI poi1 = new POI ("Zoo Miami", 3);
        assertFalse(poi2.compareTo(poi1)>0, "South Beach has a higher rating than Zoo Miami.");
    }

    @Test
    public void compareToTest03(){
        POI poi3 = new POI("South Beach", 4);
        POI poi2 = new POI("Zoo Miami", 4);
        assertEquals(0,poi2.compareTo(poi3), "South Beach and Zoo Miami have the same rating");
    }
    @Test
    public void toStringTest01(){
        POI poi = new POI("South Beach", 0.0);
        assertEquals("South Beach, 0.00", poi.toString());
    }
}
