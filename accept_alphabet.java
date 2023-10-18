package com.Ayush.opps;

public class accept_alphabet {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch >=65 && ch<90) || (ch>=97 && ch<=122))
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
