package livecode.week3;

public class ChooseIfElse {
  public void structureIfElse(){
    // structure of an If Else
    int coffee = 100;
    int espresso = 45;
    int ristretto = 60;

    if ((coffee > ristretto) && (coffee > espresso)) { // is 50 > 45 -> true
      System.out.println("we can do both");
    }
    System.out.println("bye (-_-)Y");
  }

  public void advancedIfElse() {
    int coffee = 1;
    int espresso = 45;
    int ristretto = 60;

    // If Else with One instruction
    if ((coffee > ristretto) && (coffee > espresso)) System.out.println("we can do both");
    else System.out.println("we CANNOT do both");

    // If one instruction Else Two+
    if ((coffee > ristretto) && (coffee > espresso)) System.out.println("we can do both");
    else {
      System.out.println("we CANNOT do both");
      System.out.println("sorry");
    }

    // If Two+ instructions Else one
    if ((coffee > ristretto) && (coffee > espresso)) {
      System.out.println("we can do both");
      System.out.println("thank you");
    }
    else System.out.println("sorry");

    // If always true
    if (true) {
      System.out.println("we can do both");
      System.out.println("thank you");
    }

    // If imbricated partial else
    if (coffee > 0) {
      if (coffee > ristretto) {
        System.out.println("ristretto");
      } else {
        if (coffee > espresso) {
          System.out.println("espresso");
        } else {
          System.out.println("No beverage for you");
        }
      }
    } else {
      System.out.println("refill coffee");
    }
  }

  public void  conditionalOperator() {
    int whatever = 0;
    int coffee = 54;

    // the if else way
    if (coffee > 0) whatever = 10;
    else whatever = 0;

    // the ? way
    whatever = (coffee > 0) ? 10 : 0 ;
    System.out.println("whatever = " + whatever);
  }

  public int maximum (int a, int b) {
    int i = (a > b) ? a : b;
    return i;
  }

  public static boolean isLeapYear (int year) throws Exception {
    // divided by 4, cannot be divided by 100, divided by 400
    if (year < 1582)
      throw new Exception("this year is before the introduction of the gregorian calendar so the method is irrelevant");

    if ((year % 400) == 0) {
      return true;
    } else if ((year % 4) == 0) {
      if (!((year % 100) == 0)) {
          return true;
        }
      }

    return false;
  }

  public static void main(String[] args) throws Exception {
    ChooseIfElse chooseIfElse = new ChooseIfElse();
    int a = 10, b = 5;
    int result = chooseIfElse.maximum(a, b);
    System.out.println("max of " + a + " and "+ b + " is " + result);
    int year0 = 1600, year1 = 1900, year2 = 2020;
    int year3 = 1581;
    int year4 = 2003;
    try{
      System.out.println(chooseIfElse.isLeapYear(year0));
      System.out.println(chooseIfElse.isLeapYear(year1));
      System.out.println(chooseIfElse.isLeapYear(year2));
      System.out.println(chooseIfElse.isLeapYear(year3));
      System.out.println(chooseIfElse.isLeapYear(year4));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
