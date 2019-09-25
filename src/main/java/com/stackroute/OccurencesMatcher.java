package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurencesMatcher {


    public String matchOccurence(String str1, String str2){
        String str3="";

        Pattern p = Pattern.compile(str2);
        Matcher m = p.matcher(str1);


        while(m.find()) {
            System.out.println("Found at: "
                    + m.start() + " - " + m.end()+", ");
            str3=str3+("Found at: "
                    + m.start() + " - " + m.end()+", ");
        }

        return str3.trim();
    }
}