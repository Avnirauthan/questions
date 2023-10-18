package com.Ayush.opps;
import java.util.*;
public class whitespaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();

        remove(str);
    }
    static void remove(String str)
    {
        String ptr =str.replaceAll(" ","");
        System.out.println(ptr);

    }
}
