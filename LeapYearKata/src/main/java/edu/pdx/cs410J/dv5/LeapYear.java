package edu.pdx.cs410J.dv5;

public class LeapYear {

    /**
     * Validates if given year is leap year or not.
     *
     * @param year
     *        The year
     */

    public boolean checkIfLeapYear(int year) {
        if(year < 0) {
            System.out.println("Enter positive year");
        }
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
