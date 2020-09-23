package livecode.week2;

import java.util.regex.Pattern;

public class NamingConvention {
  /**
   * Declare different Variables with different names.
   *
   * @param args  command line arguments of main, Not used here
   */
  public static void main(String[] args) {
    // rule 1 first character cannot be a digit
    int something;

    // rule 2 no space
    int something_and_something;
    int somethingAndSomething;

    // rule 3 case matters
    int mycase;
    int myCase;

    // rule 4 no characters like &, ~, ", #, ', `, {, }, [, ], -, | , \, ^, @, =, %, *, ?,
    //                           :, /, §, !, <, >, ;, ,
    String name = "Any_name";
    boolean isValid = Pattern.matches("^(\\p{Ll}|_|\\$)(\\p{LC}|_|\\$)*$",name);
    System.out.println(isValid);
  }
}
