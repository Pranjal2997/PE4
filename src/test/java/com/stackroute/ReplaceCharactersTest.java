package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {

    ReplaceCharacters r1= new ReplaceCharacters();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testCase1(){
        String s="daily dry";

        assertEquals("faity fry", r1.replace(s));

    }

    @Test
    public void testCase2(){
        String s="dil becomes fit";

        assertEquals("fit becomes fit", r1.replace(s));

    }
}
