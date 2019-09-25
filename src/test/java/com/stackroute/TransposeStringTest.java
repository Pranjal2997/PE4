package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString c1= new TransposeString();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testCase1(){
        String s="a quick brown fox jumps over the lazy dog";
        String [] s2=s.split(" ", 0);
        String s1="a kciuq nworb xof spmuj revo eht yzal god";

        assertEquals(s1, c1.transpose(s));

    }

    @Test
    public void testCase2(){
        String s="welcome to hotel california";
        String [] s2=s.split(" ", 0);
        String s1="emoclew ot letoh ainrofilac";

        assertEquals(s1, c1.transpose(s));

    }
}