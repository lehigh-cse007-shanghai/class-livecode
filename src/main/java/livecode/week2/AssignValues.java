package livecode.week2;

public class AssignValues {
  public static void main(String[] args) {
    int a, b;
    a = 1;
    b = a + 3;
    a = 3;
    System.out.println(a + " " + b);

    // keyword final, example avec PI puis Math.PI
    final double PI = Math.PI;

    // a is 3 and b is 4
    int swap;
    swap = a;
    a = b;
    b = swap;

    System.out.println(a + " " + b);
  }
}
