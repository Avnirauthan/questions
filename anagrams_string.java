package com.Ayush.opps;
import java.util.*;
import java.lang.*;
public class anagrams_string {
    public static void main(String[] args) {
        String str="hello";
        String st="olleh";
        System.out.println(check(str,st));
    }
    static boolean check (String str,String st)
    {
        if(str.length() != st.length())
        {
            return false;
        }
        char ch[] =str.toCharArray();
        char c[] =st.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);

        str = new String (ch);
        st= new String(c);
        if(str.equals(st))
        {
            return true;
        }
        return false;
    }
}
