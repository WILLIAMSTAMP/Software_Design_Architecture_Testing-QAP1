package com.time.test;

// TestTime class is a test driver for the Time class
public class TestTime {
    public static void main(String[] args) {
        // create two Time objects
        Time t1 = new Time();
        Time t2 = new Time();
        
        // set the time of t1 to 21:10:15 and t2 to 10:20:25
        t1.setTime(23,59,59);
        t2.setTime(12,59,59);
        
        // print the current time of t1 and t2
        System.out.println("t1: " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.println("t2: " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
        
        // increment the second field of t1 by 1 and decrement the second field of t2 by 1
        t1.nextSecond();
        t2.previousSecond();
        
        // print the updated time of t1 and t2
        System.out.println("t1: " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.println("t2: " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
    }
}