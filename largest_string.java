package com.Ayush.opps;

public class largest_string {
    public static void main(String[] args)
    {
       String str ="hello worldssss";
        System.out.println(largest(str));
    }
    static String largest(String str)
    {
        String largest="";
        String word[]=str.split(" ");
        for(String s:word)
        {
            if(largest.length()-1<s.length()-1)
            {
                largest=s;
            }
        }
        return largest;
    }
}
