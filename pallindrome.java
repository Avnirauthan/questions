package com.Ayush.opps;
import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String z =sc.nextLine();
        check(z);

    }
    static void check(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j) {


            if(str.charAt(i)!=str.charAt(j))
            {  System.out.println("not pallindrome");
                return;
            }
            i++;
            j--;

        }
        System.out.println("pallindrome");
    }
}
