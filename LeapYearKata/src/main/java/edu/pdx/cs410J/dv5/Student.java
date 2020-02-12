package edu.pdx.cs410J.dv5;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;
                                                                                    
/**                                                                                 
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class Student extends Human {                                                
                                                                                    
  /**                                                                               
   * Creates a new <code>Student</code>                                             
   *                                                                                
   * @param name                                                                    
   *        The LeapYearKata's name                                                      
   * @param classes                                                                 
   *        The names of the classes the LeapYearKata is taking.  A LeapYearKata              
   *        may take zero or more classes.                                          
   * @param gpa                                                                     
   *        The LeapYearKata's grade point average                                       
   * @param gender                                                                  
   *        The LeapYearKata's gender ("male" or "female", or "other", case insensitive)
   */                                                                               
  public Student(String name, ArrayList<String> classes, double gpa, String gender) {
    super(name);
  }

  /**                                                                               
   * All students say "This class is too much work"
   */
  @Override
  public String says() {                                                            
    throw new UnsupportedOperationException("Not implemented yet");
  }
                                                                                    
  /**                                                                               
   * Returns a <code>String</code> that describes this                              
   * <code>Student</code>.                                                          
   */                                                                               
  public String toString() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  /**
   * Main program that parses the command line, creates a
   * <code>Student</code>, and prints a description of the LeapYearKata to
   * standard out by invoking its <code>toString</code> method.
   */
  public static void main(String[] args) {
    if(args.length == 0) {
      printErrorMessageAndExit("Missing command line arguments");
    }
    LeapYear leapyear = new LeapYear();
    int year = 0;
    try {
      year = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
      printErrorMessageAndExit("Enter valid Integer Number");
    }
    if(leapyear.checkIfLeapYear(year)) {
      System.out.println("The given year " + year + " is leap year");
    } else {
      System.out.println("The given year " + year + " is not leap year");
    }
  }
  private static void printErrorMessageAndExit(String message) {
    System.err.println(message);
    System.exit(1);
  }
}