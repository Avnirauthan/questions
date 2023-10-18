package com.Ayush.opps;
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String st="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            st=st+ch;
        }
        System.out.println(st);
    }
}
