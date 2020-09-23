package livecode.week2;

public class BasicOperations {
  void arithmeticOperations(){
    int a = 1, b = 2, result;
    result = a + b;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
  }

  void groupsOperations() {
    System.out.println(2 + 1 / 3.0);
    System.out.println(8 / 4 * 2);
    System.out.println(8 % 2);
    // the rule of groups
    // group 1 -> + -
    // group 2 -> * / %
    // group 2 first then order of operations in group
  }

  void booleanOperations() {
    boolean a = true, b = false;

    // AND
    System.out.println("and: " + (a && b));

    // OR
    System.out.println("or: " + (a || b));

    // NOT
    System.out.println("not: " + !(a && b));
  }

  void shortHandOperations() {
    int a = 1, b = 2;
    a = a + 2;
    a += 2;
    a *= 2;
    a &= b;
  }

  void prePostOperators() {
    int i = 0, a = 2;
    i = i + 1;
    i += 1;
    i = 0;
    a += i++; // a = 2  + 0 -> i = i + 1
    System.out.println("a = " + a);
    i = 0;
    a += ++i;
    System.out.println("a = " + a);
  }

  void relationalOperators() {
    int a = 2, b = 1;
    boolean is = false;
    // equivalent
    is = a == b;

    // not equivalent
    is = a != b;

    // less than
    is = a < b;

    // greater than
    is = a > b;

    // less or equal
    is = a <= b;

    // greater or equal
    is = a >= b;


  }

  void bitwiseOperations() {
    Integer a;
    a = Integer.valueOf(0x2A);
    System.out.println("a = " + Integer.toString(a,2) + ", real value = " + a);

    // AND
    int b = 0x03;
    System.out.println("a & b = " + Integer.toString((a&b),2) + ", real value = " + a);

    // OR -> |


    // NOT -> ~

    // SHIFT LEFT <<
    a <<= 4;
    System.out.println("a = " + Integer.toString(a,2) + ", real value = " + a);

    // SHIT RIGHT WITH SIGN >>

    // SHIFT RIGHT WITH 0 >>>

  }

  public static void main(String[] args) {
    BasicOperations bo = new BasicOperations();
    //bo.arithmeticOperations();
    //bo.groupsOperations();
    //bo.booleanOperations();
    //bo.bitwiseOperations();
    bo.prePostOperators();
  }
}


