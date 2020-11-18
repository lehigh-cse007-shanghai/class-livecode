package livecode.week9;

import java.util.Arrays;
import java.util.Random;

public class BasicArray {

  /**
   * Create Read Update Delete – CRUD
   * Starting with Create
   */
  public static void createArray() {
    Random random = new Random(0);
    int [] a;
    int b [] = new int[100];
    
    // create empty
    a = new int[5];
    System.out.println("a = " + Arrays.toString(a));

    // create and fill
    a = new int[] {1,2,3,-2,1000}; // create with Array Literal
    System.out.println("a = " + Arrays.toString(a));

    Arrays.fill(b, 100);
    System.out.println("b = " + Arrays.toString(b));

    for (int i = 0; i < b.length; i++) {
      b[i] = random.nextInt(500);
    }
    System.out.println("b = " + Arrays.toString(b));

    // create and fill some
    Arrays.fill(b, 100);
    Arrays.fill(b, 0, 10, 1);
    System.out.println("b = " + Arrays.toString(b));
  }

  /**
   * Create Read Update Delete – CRUD
   * continuing with Read
   */
  public static void readArray() {
    int [] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String [] sentence = new String[] {"hello", "world", "my", "name", "is", "Fabien"};

    // access one element
    System.out.println("sentence[1] = " + sentence[1]);

    // search for an element loop
    // is "name" in sentence?
    for (int i = 0; i < sentence.length; i++) {
      if ("name" == sentence[i]) {
        System.out.println("I found 'name' at position " + i);
        sentence[i] = "firstname";
        break;
      }
    }
    System.out.println("Arrays.toString(sentence = " + Arrays.toString(sentence));

    // search for an element enhanced loop
    System.out.println("firstname is in sentence? –> " + isIn("firstname", sentence));

    // list all element
    for (int i = 0; i < sentence.length; i++) {
      System.out.println(i + " " + sentence[i]);
    }
  }

   public static boolean isIn(String needle, String [] haystack) {
     for (String word : haystack) {
       if (needle == word) {
         return true;
       }
     }
    return false;
   }


  /**
   * Create Read Update Delete – UPDATE
   * continuing with Update
   */
  public static int [] updateArray() {
    int [] a;

    return null;
  }

  /**
   * Cloning array
   */
  public static void cloneArray() {
    int [] a = new int[] {1, 2, 3};
    int [] b = a.clone();
    System.out.println("b = " + Arrays.toString(b));
    System.out.println("a = " + Arrays.toString(a));

    System.out.println(a == b);
    System.out.println(Arrays.equals(a, b));
    System.out.println(Arrays.compare(a, b));
    b = new int[] {1, 3, 4};
    System.out.println("Arrays.compare(a, b) = " + Arrays.compare(a, b));
  }

  public static void main(String[] args) {
    createArray();
    readArray();
    updateArray();
    cloneArray();
  }
}
