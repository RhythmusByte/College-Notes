public class Calc {
  int num1;
  int num2;
  
  public Calc(int a, int b) {
    this.num1 = a;
    this.num2 = b;
  }
  
  public int sum() {
    return num1 + num2;
  }
  
  public int difference() {
    return num1 - num2;
  }
  
  public int product() {
    return num1 * num2;
  }
  
  public int quotient() {
    return num1 / num2;
  }
  
  public int remainder() {
    return num1 % num2;
  }
  
  public static void main(String[] args) {
    if(args.length != 2) {
      throw new IllegalArgumentException("Give two numbers as arguments!!");
    } else {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      
      Calc calc = new Calc(num1, num2);
      
      int sum = calc.sum();
      int difference = calc.difference();
      int quotient = calc.quotient();
      int product = calc.product();
      int remainder = calc.remainder();
      
      System.out.println("Given arguments are " + num1 + " and " + num2);
      System.out.println("Sum = " + sum);
      System.out.println("Difference = " + difference);
      System.out.println("Quotient = " + quotient);
      System.out.println("Product = " + product);
      System.out.println("Remainder = " + remainder);
    }
  }
}