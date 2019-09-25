package com.stackroute;
public class Occurences {


        public int countOccurences(String str1, char c){
            String str2="";
            int b=0;



            str2=str1.replace("a","");

            b = -str2.length()+str1.length();

            return b;
        }
    }

