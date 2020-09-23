package livecode.week2;

public class BasicTypes {
  /**
   * Declare different Number Types, assign a value
   * and display them accordingly.
   *
   * @param args  command line arguments of main, Not used here
   */

  public static void main(String[] args) {
    Byte integer8Bits;
    Short integer16Bits;
    Integer integer32Bits;
    Long integer64Bits;

    integer8Bits = 127;
    integer16Bits = 32767;
    integer32Bits = 2_147_483_647;
    integer64Bits = 9223372036854775807L;

    Float real32Bits;
    Double real64Bits;

    real32Bits = 3.1415927f;
    real64Bits = 3.1415926535897932384626433832795028841971d;

    byte mynumber = 2;

    System.out.println(integer8Bits.toString());
    System.out.println(integer16Bits.shortValue());
    System.out.println(integer32Bits.toBinaryString(integer32Bits));
    System.out.println(integer64Bits);
    System.out.println(real32Bits);
    System.out.println(real64Bits);
  }
}
