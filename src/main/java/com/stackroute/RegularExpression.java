
package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class RegularExpression {
        public boolean reg(String input){


            String regex = ".*\\bHarry\\b.*";

            Pattern p = Pattern.compile(regex);

            Matcher m = p.matcher(input);

            if(m.find())
            {System.out.println(input + " Found");
                return true;}
            else{
                System.out.println(input + " Not Found");
                return false;}
        }
    }


