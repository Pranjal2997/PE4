package com.stackroute;

public class TransposeString {

    public String transpose(String string)
    {
        String string1[]= string.split(" ",0);
        String str2="";
        for(int i=0;i<string1.length;i++)
        {
            char []c= string1[i].toCharArray();

            int l1=c.length;
            char []c1= new char[l1];
            str2="";
            for(int j=0;j<l1;j++)
            {

                c1[j]=c[(l1-j)-1];
                str2=str2+c1[j];

            }

            string1[i]=str2;

        }
        int l2=string1.length;
        String string3="";
        for(int i=0;i<l2;i++)
        {
            string3=string3+string1[i]+" ";

        }
        string3=string3.trim();
        return string3;
    }

}