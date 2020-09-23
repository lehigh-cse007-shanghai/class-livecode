package livecode.week2;

public class CastingTypes {
  public static void main(String[] args) {
    int first = 5, second = 3, coefficient = 2 ;
    double result ;
    result =  (double) coefficient * first / second ;
    System.out.println("result = " + result);
    result =  (double) (coefficient * first / second);
    System.out.println("result = " + result);
    result = first;
    int last = (int) result;
    int last2 = Double.valueOf(result).intValue();
    // NOTHING byte -> short -> int -> long -> float -> double
    // CASTING
  }
}
