package livecode.week3;

public class ChooseSwitch {
  public void structureSwitch() {
    // Structure of a switch
    // basic menu
    int menu  = 100013;
    switch (menu) {
      case 1 :
        System.out.println("you choose 1");
        break;
      case 100013 :
        System.out.println("you choose 2");
        break;
      default:
        System.out.println("you chose something else");
    }
  }

  public boolean isValidDate(int day, int month, int year) throws Exception {
    // first test is after 1/1/1582
    if (year < 1582) return false;
    if ((month < 1) || (month > 12)) return false;
    if ((day < 1) || (day > 31)) return false;

    switch(month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return true;
      case 2:
        if (ChooseIfElse.isLeapYear(year))
            if (day <= 29) return true;
            else return false;
        else
          if (day <= 28) return true;
          else return false;
      default:
        if (day <= 30) return true;
        else return false;
    }
  }

  public static void main(String[] args) throws Exception {
    ChooseSwitch chooseSwitch = new ChooseSwitch();
    boolean result = chooseSwitch.isValidDate(29, 2, 2020);
    System.out.println("result = " + result);
  }
}
