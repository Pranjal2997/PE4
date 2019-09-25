package com.stackroute;


import java.util.Arrays;

public class SortedWords {
    public String sortWords(String s1)
    {
        //s1=s1.toLowerCase();
        String [] array=s1.toLowerCase().split(" ",0);
        String str="";
        for(int i=0;i<array.length;i++)
        {
            char []c=array[i].toCharArray();
            Arrays.sort(c);
            array[i]= new String(c);
            System.out.println(array[i]);
            str= str + array[i] + " ";
        }


        str=str.trim();
        return  str;
    }
}
