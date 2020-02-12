package edu.pdx.cs410J.dv5;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Unit tests for the Student class.  In addition to the JUnit annotations,
 * they also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>
 * matchers for more readable assertion statements.
 */
public class StudentTest extends InvokeMainTestCase
{

  /**
   * Invokes the main method of {@link Student} with the given arguments.
   */
  private MainMethodResult invokeMain(String... args) {
    return invokeMain( Student.class, args );
  }

  @Test
  public void studentNamedPatIsNamedPat() {
    String name = "Pat";
    var pat = new Student(name, new ArrayList<>(), 0.0, "Doesn't matter");
    assertThat(pat.getName(), equalTo(name));
  }

  @Test
  public void testWithNoCommandLineArgs() {
    InvokeMainTestCase.MainMethodResult result = invokeMain();
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  public void testWithInvalidYear() {
    String[] inputs = {"19AB"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(inputs);
    assertThat(result.getTextWrittenToStandardError(), containsString("Enter valid Integer Number"));
  }

  @Test
  public void testWithValidLeapYear() {
    String[] inputs = {"2020"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(inputs);
    assertThat(result.getTextWrittenToStandardOut(), containsString("The given year " + inputs[0] + " is leap year"));
  }

  @Test
  public void testWithValidNonLeapYear() {
    String[] inputs = {"2019"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(inputs);
    assertThat(result.getTextWrittenToStandardOut(), containsString("The given year " + inputs[0] + " is not leap year"));
  }

}
