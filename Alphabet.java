package com.Ayush.opps;

import java.util.Locale;
import java.util.Scanner;

public class Alphabet {
    static int vowel=0,space=0,consonant=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String z =sc.nextLine();
            String str = z.toUpperCase();
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            check(ch);
        }
        System.out.println("vowel ="+vowel +"consonant ="+consonant +"space ="+space);
    }
    public static void check(char ch)
    {
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
        {
            vowel++;
        }
        else if(ch == ' ')
        {
            space++;
        }
        else{
            consonant++;
        }
    }
}
