package com.keyin.QAP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {

    @Test
    public void testMultiply() {

        Calculator calculatorUnderTest = new Calculator();

        int resultOne = calculatorUnderTest.multiply(4,2);

        Assertions.assertNotEquals(10, resultOne);

        System.out.println("Result one does not equal " + resultOne);
    }

    @Test
    public void testAdd() {

        Calculator calculatorUnderTest = new Calculator();

        int resultTwo = calculatorUnderTest.add(10, 10);

        Assertions.assertEquals(20, resultTwo);

        System.out.println("Result two does equal " + resultTwo);
    }

    @Test
    public void testSubtract() {

        Calculator calculatorUnderTest = new Calculator();

        int resultThree = calculatorUnderTest.subtract(100, 50);

        Assertions.assertTrue(resultThree == 50);

        System.out.println("Result three does equal " + resultThree);
    }
}
