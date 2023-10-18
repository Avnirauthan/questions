package com.Ayush.opps;
import java.lang.*;
import java.util.*;
public class capatilize {
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(convert(str));
    }
    static String convert(String str)
    {
        String word[]=str.split(" ");
        StringBuilder sb= new StringBuilder();
        for(String s : word)
        {if(s.length()>1)
        {
            char first=Character.toUpperCase(s.charAt(0));
            char last=Character.toUpperCase(s.charAt(s.length()-1));
            sb.append(first).append(s.substring(1,s.length()-1)).append(last);
        }
        else {
            sb.append(Character.toUpperCase(s.charAt(0)));
        }
        sb.append(" ");

        }
        return sb.toString();
    }
}

