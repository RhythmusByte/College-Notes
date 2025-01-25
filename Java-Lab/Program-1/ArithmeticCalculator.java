public class ArithmeticCalculator {
  private double num1;
  private double num2;

  public ArithmeticCalculator(String[] args) {
    readValues(args);
    calculater();
  }

  private void readValues(String[] args) {
    try {
      num1 = Double.parseDouble(args[0]);
      num2 = Double.parseDouble(args[1]);
    } catch (Exception e) {
      throw new IllegalArgumentException("\n\n\tNeed two arguments!!\n\tEx: java ArithmeticCalculator 12 43\n");
    }
    if (num2 == 0)
      throw new IllegalArgumentException("\n\n\tThe value can't be zero!!\n");
  }

  private void calculater() {
    double sum = num1 + num2;
    double difference = num1 - num2;
    double product = num1 * num2;
    double quotient = num1 / num2;
    double remainder = num1 % num2;

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
    System.out.println("Remainder: " + remainder);
  }

  public static void main(String[] args) {
    var calculator = new ArithmeticCalculator(args);
  }
}
