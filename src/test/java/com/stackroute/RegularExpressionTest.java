package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression c1= new RegularExpression();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCase2(){
        String s="This is Harry";
        String s1="Harry here?";
        int i=11;
        assertEquals(true, c1.reg(s));

    }
    @Test
    public void testCase1(){
        String s="This is Hari";
        String s1="Harry here?";
        int i=11;
        assertEquals(false, c1.reg(s));

    }
}