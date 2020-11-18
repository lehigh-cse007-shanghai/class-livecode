package livecode.week4;

public class AdvancedFunctions {

  static int a;
  static int b;


  /**
   * test function for value change
   */
  public static void modifyValue(){
    int value = 3;
  }

  /**
   * example of parameter transmission
   * @param a
   */
  public static int modifyValue2(){
    int value = 3;
    return value;
  }

  public static void exchangeTheValues() {
    int tmp;
    tmp = a;
    a = b;
    b = tmp;
  }

  public static void exchangeTheValues(int a, int b) {
    int tmp;
    tmp = a;
    a = b;
    b = tmp;
  }

  public static void main(String[] args) {
    int value = 2;
    System.out.println("first try");
    System.out.println("value = " + value);
    // let's try to modify value
    modifyValue();
    System.out.println("value = " + value);

    System.out.println("second try");
    System.out.println("value = " + value);
    // let's try to modify value
    value = modifyValue2();
    System.out.println("value = " + value);

    a = 1;
    b = 9;
    System.out.println("a = " + a + " & b = "+ b);
    exchangeTheValues(a, b);
    System.out.println("a = " + a + " & b = "+ b);


  }
}
