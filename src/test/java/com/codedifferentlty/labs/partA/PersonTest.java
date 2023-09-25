package com.codedifferentlty.labs.partA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    public void testCompareTo01() {
        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);
        assertTrue(alice.compareTo(bob) > 0, "Alice should be older than Bob");
    }

    @Test
    public void testCompareTo02() {
        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);
        assertTrue(bob.compareTo(alice) < 0, "Bob should be younger than Alice");
    }

    @Test
    public void testCompareTo03() {
        Person alice = new Person("Alice", 30);
        Person charlie = new Person("Charlie", 30);
        assertEquals(0, alice.compareTo(charlie), "Alice and Charlie should be of the same age");
    }

    @Test
    public void testToString() {
        Person alice = new Person("Alice", 30);
        assertEquals("Alice, 30 years old", alice.toString(), "The string representation of Alice should match the expected format");
    }
}

