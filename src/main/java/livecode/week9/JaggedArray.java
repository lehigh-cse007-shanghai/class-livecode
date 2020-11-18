package livecode.week9;

import java.util.Arrays;

public class JaggedArray {
  /**
   * Create Read Update Delete – CRUD
   * Starting with Create
   */
  public static void createArray() {
    int [] a;
    int b [];
    // create empty 2 dimension

    // create 3 dimension

    // create jagged array


  }

  /**
   * Create Read Update Delete – CRUD
   * continuing with Read
   */
  public static void readArray() {
    int [] a;
    // list all element
  }

  /**
   * Cloning array
   */
  public static void cloneArray() {
    int [][] a = new int[][] {{1, 2, 3},{2, 3, 4}};
    int [][] b = a.clone();
    System.out.println(a==b);
    System.out.println(a[0] == b[0]); // SEE THE PROBLEM ? shallow copy
    System.out.println(Arrays.equals(a, b));

  }

  public static void main(String[] args) {
    createArray();
    cloneArray();
  }
}
