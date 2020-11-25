package livecode.week9;

import java.util.Arrays;

public class JaggedArray {

  /**
   * Cloning array
   */
  public static void cloneArray() {
    int [][] a = new int[][] {{1, 2, 3},{2, 3, 4}};
    int [][] b = a.clone();
    System.out.println(a==b);
    System.out.println(a[0] == b[0]); // SEE THE PROBLEM ? shallow copy // deep copy
    System.out.println(Arrays.equals(a, b));
  }

  public static void main(String[] args) {
    cloneArray();
  }
}
