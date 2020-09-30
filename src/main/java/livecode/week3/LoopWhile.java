package livecode.week3;

import java.util.Scanner;

public class LoopWhile {

  public void whileLoop() {
    // while (expression) {
    //     statement(s)
    // }
    int i = 81;
    while (i >= 3) {
      System.out.println("i = " + i);
      i = (int) Math.sqrt(i);
    }
  }

  public void doWhileLoop() {
    // do {
    //     statement(s)
    // } while (expression);
    int i = 81;
    do {
      System.out.println("i = " + i);
      i = (int) Math.sqrt(i);
    } while (i > 81);
  }

  public void superMenu() {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.println("what do you want?");
      System.out.println("1 baozi");
      System.out.println("2 xialonbao");
      System.out.println("3 bye bye");
      choice = scanner.nextInt();
    } while (choice != 3);
    System.out.println("OK bye bye");
  }


  public static void main(String[] args) {
    LoopWhile loopWhile = new LoopWhile();
    loopWhile.superMenu();
  }
}
