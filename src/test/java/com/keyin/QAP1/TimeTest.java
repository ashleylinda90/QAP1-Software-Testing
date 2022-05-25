package com.keyin.QAP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {

    @Test
    public void testGetHour() {

        Time timeUnderTest = new Time();

        Assertions.assertEquals(0, timeUnderTest.setTime(10,20,59));

        System.out.println("The hour is " + timeUnderTest.getHour());
    }

    @Test
    public void testGetSecond() {

        Time timeUnderTest = new Time();

        Assertions.assertEquals(0, timeUnderTest.setTime(5,30,45));

        System.out.println("The second is " + timeUnderTest.getSecond());
    }

    @Test
    public void testToString() {

        Time timeUnderTest = new Time();

        Assertions.assertEquals(0, timeUnderTest.setTime(8,15,45));

        System.out.println("The time is " + timeUnderTest.toString());
    }
}
