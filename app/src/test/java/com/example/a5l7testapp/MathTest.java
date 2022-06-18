package com.example.a5l7testapp;

import static junit.framework.TestCase.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math math;

    @Before
    public void install() {
        math = new Math();
    }
    @Test
    public void simpleAddTest(){
        assertEquals("12",math.add("6","6"));
    }
    @Test
    public void letterAddTest(){
        assertEquals("You couldn't inter the letters",math.add("6","a"));
    }
    @Test
    public void spaceAddTest(){
        assertEquals("Couldn't do with space",math.add("6"," "));
    }
    @Test
    public void withDotAddTest(){
        assertEquals("Only whole numbers",math.add("6","6.2"));
    }
    @Test
    public void minusAddTest(){
        assertEquals("Shouldn't be negative",math.add("6","-6"));
    }
    @Test
    public void nullAddTest(){
        assertEquals("12",math.add("6",null));
    }
    @After
    public void detach(){
        math = null;
    }
}
