package com.keyin.QAP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordComparisonTest {

    @Test
    public void testGetJob() {

        WordComparison wordUnderTest = new WordComparison("Cory", "Vet", "Germany");

        Assertions.assertNotSame("Lawyer", wordUnderTest.getJob());

        System.out.println("Job is " + wordUnderTest.getJob());
    }

    @Test
    public void testGetName() {

        WordComparison wordUnderTest = new WordComparison("Ashley", "Lawyer", "Canada");

        Assertions.assertTrue(wordUnderTest.getName() == "Ashley");

        System.out.println("Name = " + wordUnderTest.getName() + ", condition is True.");
    }

    @Test
    public void testSetName() {

        WordComparison wordUnderTest = new WordComparison("Cory", "Vet", "Germany");

        String result = wordUnderTest.setName("Lucas");

        Assertions.assertEquals("Lucas", result);

        System.out.println("The person's name is " + wordUnderTest.getName());
    }

}
