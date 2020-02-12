package edu.pdx.cs410J.dv5;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @Test
    public void testWithNumDivisibleBy400() {
        LeapYear leap = new LeapYear();
        boolean check = leap.checkIfLeapYear(2000);
        assertEquals(check, true);
    }

    @Test
    public void testWithNumDivisibleBy100ButNotBy400() {
        LeapYear leap = new LeapYear();
        boolean check = leap.checkIfLeapYear(1900);
        assertEquals(check, false);
    }

    @Test
    public void testWithNumDivisibleBy4ButNotBy100() {
        LeapYear leap = new LeapYear();
        boolean check = leap.checkIfLeapYear(2004);
        assertEquals(check, true);
    }

    @Test
    public void testWithNumNotDivisibleBy4() {
        LeapYear leap = new LeapYear();
        boolean check = leap.checkIfLeapYear(2019);
        assertEquals(check, false);
    }

    @Test
    public void testWithNegativeYear() {
        LeapYear leap = new LeapYear();
        boolean check = leap.checkIfLeapYear(-1234);
        assertEquals(check, false);
    }
}
