package com.Ayush.opps;
import java.util.*;
public class remove_vowel {
    public static void main(String[] args) {
        System.out.println("enter the string");
     Scanner sc =new Scanner(System.in);
     String str = sc.next();
       String ptr = str.toUpperCase();

        ptr =ptr.replaceAll("[AEIOU]","");
        System.out.println(ptr);
    }

}
