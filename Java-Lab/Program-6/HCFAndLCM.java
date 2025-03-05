import java.util.Scanner;

public class HCFAndLCM {
  private static final Scanner SCANNER = new Scanner(System.in);
  private int num1, num2, hcf;

  private void readValues() {
    System.out.print("Enter num 1: ");
    num1 = SCANNER.nextInt();
    System.out.print("Enter num 2: ");
    num2 = SCANNER.nextInt();
  }

  private int findHCF() {
    int a = num1, b = num2, temp;
    while (b != 0) {
      temp = b;
      b = a % b;
      a = temp;
    }
    hcf = a;
    return hcf;
  }

  private int findLCM() {
    return (num1 * num2) / hcf;
  }

  public HCFAndLCM() {
    readValues();
  }

  public static void main(String[] args) {
    HCFAndLCM calc = new HCFAndLCM();

    System.out.println("HCF: " + calc.findHCF());
    System.out.println("LCM: " + calc.findLCM());
    SCANNER.close();
  }
}
