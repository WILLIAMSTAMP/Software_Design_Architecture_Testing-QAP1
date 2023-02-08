package com.time.test;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // default constructor sets all fields to 0
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    /** 
   * constructor with parameters for setting hour, minute, and    
   * second fields
    //@param hour the hour of the time
    //@param minute the minute of the time
    //@param second the second of the time
    */
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // method for setting time
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    
    // method for setting hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // method for setting minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // method for setting second
    public void setSecond(int second) {
        this.second = second;
    }

    // method for getting hour
    public int getHour() {
        return this.hour;
    }

    // method for getting minute
    public int getMinute() {
        return this.minute;
    }


    // method for getting second
    public int getSecond() {
        return this.second;
    }

    
    // method for incrementing the second field by 1
    public void nextSecond() {
        setSecond(this.second + 1); // increment the second by 1
        if (this.second == 60) { // check if second has reached 60
            setSecond(0); // if it has, reset the second to 0
            setMinute(this.minute + 1); // increment the minute by 1
            if (this.minute == 60) { // check if minute has reached 60
                setMinute(0); // if it has, reset the minute to 0
                setHour(this.hour + 1); // increment the hour by 1
                if (this.hour == 24) { // check if hour has reached 24
                    setHour(0); // if it has, reset the hour to 0
                }
            }
        }
    }

    // method for decrementing the second field by 1
    public void previousSecond() {
        setSecond(this.second - 1); // decrement the second by 1
        if (this.second == -1) { // check if second has reached -1
            setSecond(59); // if it has, reset the second to 59
            setMinute(this.minute - 1); // decrement the minute by 1
            if (this.minute == -1) { // check if minute has reached -1
                setMinute(59); // if it has, reset the minute to 59
                setHour(this.hour - 1); // decrement the hour by 1
                if (this.hour == -1) { // check if hour has reached -1
                    setHour(23); // if it has, reset the hour to 23
                }
            }
        }
    }
}


// 12-hour clock
// public void nextSecond() {
//     setSecond(this.second + 1); // increment the second by 1
//     if (this.second == 60) { // check if second has reached 60
//         setSecond(0); // if it has, reset the second to 0
//         setMinute(this.minute + 1); // increment the minute by 1
//         if (this.minute == 60) { // check if minute has reached 60
//             setMinute(0); // if it has, reset the minute to 0
//             setHour(this.hour + 1); // increment the hour by 1
//             if (this.hour == 12) { // check if hour has reached 12
//                 setHour(1); // if it has, reset the hour to 1
//             }
//         }
//     }
// }

// public void previousSecond() {
//     setSecond(this.second - 1); // decrement the second by 1
//     if (this.second == -1) { // check if second has reached -1
//         setSecond(59); // if it has, reset the second to 59
//         setMinute(this.minute - 1); // decrement the minute by 1
//         if (this.minute == -1) { // check if minute has reached -1
//             setMinute(59); // if it has, reset the minute to 59
//             setHour(this.hour - 1); // decrement the hour by 1
//             if (this.hour == 0) { // check if hour has reached 0
//                 setHour(12); // if it has, reset the hour to 12
//             }
//         }
//     }
// }