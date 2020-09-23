
package livecode.week2;

public class PrimitiveTypes {
  public void numericTypes(){
    byte integer8Bits;
    short integer16Bits;
    int integer32Bits;
    long integer64Bits;

    integer8Bits = 127;
    integer16Bits = 32767;
    integer32Bits = 2_147_483_647;
    integer64Bits = 9223372036854775807L;

    float real32Bits;
    double real64Bits;

    real32Bits = 3.1415927f;
    real64Bits = 3.1415926535897932384626433832795028841971d;

    System.out.println(integer8Bits);
    System.out.println(integer16Bits);
    System.out.println(integer32Bits);
    System.out.println(integer64Bits);
    System.out.println(real32Bits);
    System.out.println(real64Bits);
  }

  public void booleanTypes(){
    boolean isBoolean = true;
    System.out.println(isBoolean);
  }

  public void stringTypes() {
    char letter = 42;
    char altLetter = 0x2A;
    char altLetter2 = 052;
    char altLetter3 = '*';

    System.out.println(letter);
    System.out.println(altLetter);
    System.out.println(altLetter2);
    System.out.println(altLetter3);

    String letters = "*";
    System.out.println(letters);
  }

  public static void main(String[] args) {
    PrimitiveTypes pt = new PrimitiveTypes();
    pt.numericTypes();
    pt.booleanTypes();
    pt.stringTypes();
  }
}
