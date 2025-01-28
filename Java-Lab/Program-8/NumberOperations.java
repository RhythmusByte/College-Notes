import java.util.Scanner;

public class NumberOperations {
  private int number;

  public NumberOperations(int number) {
    this.number = number;
  }

  public int calculateSumOfDigits() {
    int sum = 0, temp = number;
    while (temp > 0) {
      sum += temp % 10;
      temp /= 10;
    }
    return sum;
  }

  public int calculateReverse() {
    int reverse = 0, temp = number;
    while (temp > 0) {
      reverse = reverse * 10 + temp % 10;
      temp /= 10;
    }
    return reverse;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    NumberOperations no = new NumberOperations(num);

    System.out.println("Sum of digits: " + no.calculateSumOfDigits());
    System.out.println("Reverse of the number: " + no.calculateReverse());
  }
}
