import java.util.Scanner;

public class BaseConversion {
  private static final Scanner SCANNER = new Scanner(System.in);
  private int num;
  
  public BaseConversion() {
    readValue();
    toBinary();
    toOctal();
    toHexadecimal();
  }

  private void readValue() {
    System.out.print("Enter a number: ");
    num = SCANNER.nextInt();
  }

  private void toBinary() {
    System.out.println("Binary: " + Integer.toBinaryString(num));
  }

  private void toOctal() {
    System.out.println("Octal: " + Integer.toOctalString(num));
  }

  private void toHexadecimal() {
    System.out.println("Hexadecimal: " + Integer.toHexString(num).toUpperCase());
  }

  public static void main(String[] args) {
    new BaseConversion();
  }
}
