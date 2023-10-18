package com.Ayush.opps;

public class sum_of_number_string {
    public static void main(String[] args) {
        String str ="1xyz23";
        System.out.println(sum(str));
    }
    static int sum(String str)
    {
        boolean check=false;
        int sum=0;
        int result=0;
        for(char ch : str.toCharArray())
        {
           // char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                sum  =sum*10+Character.getNumericValue(ch);
                check =true;
            }
            else {
                if(check)
                {
                    result+=sum;
                    sum=0;
                }
                check=false;
            }
        }
        if(check)
        {result+=sum;}
        return result;
    }
}
