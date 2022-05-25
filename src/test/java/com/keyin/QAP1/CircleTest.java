package com.keyin.QAP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testGetRadius() {

        Circle circleUnderTest = new Circle();

        Assertions.assertEquals(0, circleUnderTest.setRadius(1));

        System.out.println("New radius is " + circleUnderTest.getRadius());
    }

    @Test
    public void testGetArea() {

        Circle circleUnderTest = new Circle();

        Assertions.assertEquals(1, circleUnderTest.getRadius());

        System.out.println("Area of circle is " + circleUnderTest.getArea());
    }

    @Test
    public void testToString() {

        Circle circleUnderTest = new Circle();

        Assertions.assertEquals("Circle [radius = 1.0 and color = red]", circleUnderTest.toString());

        System.out.println(circleUnderTest.toString());


    }

}
