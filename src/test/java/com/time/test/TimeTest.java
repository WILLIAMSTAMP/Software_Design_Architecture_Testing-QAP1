package com.time.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TimeTest {
    @Test
    public void testNextSecond() {
        Time time = new Time(23, 59, 59);
        time.nextSecond();
        assertEquals(0, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());

        time.setTime(0, 0, 0);
        time.nextSecond();
        assertEquals(0, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(1, time.getSecond());
    }

@Test
    public void testPreviousSecond() {
        Time time = new Time(0, 0, 0);
        time.previousSecond();
        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(59, time.getSecond());

        time.setTime(23, 59, 59);
        time.previousSecond();
        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(58, time.getSecond());
    }

    @Test
    public void testSetTime() {
        Time time = new Time();
        time.setTime(23, 59, 59);
        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(59, time.getSecond());
    }

    @Test
    public void testSetHour() {
        Time time = new Time();
        time.setHour(23);
        assertEquals(23, time.getHour());
    }

    @Test
    public void testSetMinute() {
        Time time = new Time();
        time.setMinute(59);
        assertEquals(59, time.getMinute());
    }

    @Test
    public void testSetSecond() {
        Time time = new Time();
        time.setSecond(59);
        assertEquals(59, time.getSecond());
    }

    @Test
    public void testGetHour() {
        Time time = new Time(23, 59, 59);
        assertEquals(23, time.getHour());
    }

    @Test
    public void testGetMinute() {
        Time time = new Time(23, 59, 59);
        assertEquals(59, time.getMinute());
    }

    @Test
    public void testGetSecond() {
        Time time = new Time(23, 59, 59);
        assertEquals(59, time.getSecond());
    }

    @Test
    public void testToString() {
        Time time = new Time(23, 59, 59);
        assertEquals("23:59:59", time.toString());
    }


}
