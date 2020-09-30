package livecode.week3;

public class LoopFor {
  public void forLoop() {
    // for (initialization; termination;
    //     increment) {
    //    statement(s)
    // }
    for (int i = 0; i <= 10; i = i + 2) {
      System.out.println("i = " + i);
    }
  }

  public void enhancedForLoop() {
    // ONLY WITH ARRAY -> week 9
    int[] numbers = {77,2,66,4,5,543,7,-9876,9,10};
    for (int i = 0; i < numbers.length ; i++) {
      System.out.println(i + " " + numbers[i]);
    }
    
    for (int number: numbers) {
      System.out.println("number = " + number);
    }
  }

  public boolean isPrime(int myNumber) {
    // the for way (optimal)
    for (int i = 2; i < myNumber/2; i++) {
      if (myNumber % i == 0) {
        System.out.println(myNumber + " can be divided by " + i);
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    LoopFor loopFor = new LoopFor();
    System.out.println(loopFor.isPrime(Integer.MAX_VALUE));
  }
}
