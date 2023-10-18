package com.Ayush.opps;
import java.lang.*;
// using extend thread method
class thread1 extends Thread
{@Override
 public void run ()
 {
     int i=0;
     while(i<10)
     {
         System.out.println("thread 1");
         i++;
     }
 }
 public void ch()
 {
     int i=0;
     while(i<10)
     {
         System.out.println("thread 1 ------>>>>>>>>>>");
         i++;
     }
 }
}
class thread2 extends Thread
{ @Override
    public void run ()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("thread 2");
            i++;
        }
    }
    public void ch()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("thread 2 ------>>>>>>>>>>");
            i++;
        }
    }
}
public class threading {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2= new thread2();
        t1.start();

        t2.start();
        t1.ch();  // Call ch method explicitly for thread1
        t2.ch();
    }
  
}
