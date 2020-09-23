package livecode.week2;

import java.util.Scanner;

public class BasicIO {
  public static void main(String[] args) {
    int readInt;
    float readFloat;
    double readDouble;
    char readChar;
    byte readByte;
    long readLong;
    short readShort;
    String readString;

    System.out.println("hello, type a number:");

    Scanner scanner = new Scanner(System.in);
    readInt = scanner.nextInt();
    System.out.println("readInt = " + readInt);
  }
}
