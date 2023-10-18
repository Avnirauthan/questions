package com.Ayush.opps;
import java.util.*;
import java.lang.*;
public class duplicate {
    static String ary[]=new String[10];
    static int temp=0;
    public static void main(String[] args) {
        String arr[]= {"HELLO","ASHISH","AMAN","ANSHUMAN"};
        for(int i=0;i<arr.length;i++)
        {
            check(arr[i]);
        }
        for (int i = 0; i < temp; i++) {
            System.out.println(ary[i]);
        }
    }
    public static void check(String str)
    { //String ar[]={};
        //System.out.println(str);
      
        char ch[]=str.toCharArray();
        Arrays.sort(ch);

        for(int i=0;i<ch.length-1;i++)
        {

            if(ch[i]==ch[i+1])
            {
                ary[temp++]=str;
                System.out.println(temp);

               // System.out.println(ary[i]);

                break;
            }
        }

    }

}
