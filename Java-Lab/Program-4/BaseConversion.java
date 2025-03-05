import java.util.Scanner;

public class BaseConversion {
  private static final Scanner SCANNER = new Scanner(System.in);
  
  private int readValue() {
    System.out.print("Enter a number: ");
    return SCANNER.nextInt();
  }

  private void toBinary(int num) {
    System.out.println("Binary: " + Integer.toBinaryString(num));
  }

  private void toOctal(int num) {
    System.out.println("Octal: " + Integer.toOctalString(num));
  }

  private void toHexadecimal(int num) {
    System.out.println("Hexadecimal: " + Integer.toHexString(num).toUpperCase());
  }

  public static void main(String[] args) {
    BaseConversion bc = new BaseConversion();
    int num = bc.readValue();
    bc.toBinary(num);
    bc.toOctal(num);
    bc.toHexadecimal(num);
  }
}
