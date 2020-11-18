package livecode.week4;

import java.util.Scanner;

public class BasicFunctions {

  /**
   * from algorithm to function we need:
   * a name, parameters*, a result?
   * order does matter
   * the variables, the body, the type
   * @param a
   * @param b
   * @return sum of a + b
   */
  public static int sumTwoNumbers(int a, int b) {
    int result;
    result = a + b;
    return result;
  }

  /**
   * Let's explore the Math library functions let's read from keyboard and perform an operation
   * let's do, zero, one of more parameters
   *
   * @param exponent - an exponent for the power function
   * @return 0 if no issues
   */
  public static int computePower(double exponent) {
    double inputNumber, result;

    System.out.print("Please input a number: ");
    Scanner keyboardInput = new Scanner(System.in);
    inputNumber = keyboardInput.nextDouble();
    result = Math.pow(inputNumber,exponent);

    System.out.println("result = " + result);
    return 0;
  }

  /**
   * define our own function
   * perimeter of a circle with a given radius
   * let's try with bad parameter type or return type
   * let's try with default value
   * let's do no return or a return
   * @param radius - radius of the circle
   * @return perimeter
   */
  public static double circlePerimeter(int radius) {
    double perimeter;
    perimeter = 2 * Math.PI * radius;
    return perimeter;
  }

  public static double circlePerimeter() {
    return circlePerimeter(4);
  }

  /**
   * Let's get out of the program nicely
   * system smtg ?
   */
  public static void exit() {
    System.exit(0);
  }

  public static void main(String[] args) {
    int result = -1;
    double perimeter;
    result = sumTwoNumbers(5, 8);
    System.out.println("result = " + result);

    //result = computePower(2.0);
    //System.out.println("result = " + result);

    perimeter = circlePerimeter();
    System.out.println("perimeter = " + perimeter);

    exit();

  }
}
