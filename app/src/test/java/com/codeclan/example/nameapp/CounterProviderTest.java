package com.codeclan.example.nameapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 5/23/17.
 */
public class CounterProviderTest {

    @Test
    public void canCountWords4() {
        CounterProvider counter = new CounterProvider("The cat is red");
        assertEquals(4, counter.countsWords());
    }
    @Test
    public void canCountWords6() {
        CounterProvider counter = new CounterProvider("The cat is big and red");
        assertEquals(6, counter.countsWords());
    }
}