public class ArithmeticCalculator {
    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            
            System.out.println("Sum: " + (a + b));
            System.out.println("Difference: " + (a - b));
            System.out.println("Product: " + (a * b));
            
            try {
                System.out.println("Quotient: " + (a / b));
                System.out.println("Remainder: " + (a % b));
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero");
            }
        } catch (Exception e) {
            System.out.println("Usage: java ArithmeticCalculator <num1> <num2>");
        }
    }
}
