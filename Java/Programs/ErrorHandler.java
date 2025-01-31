
public class ErrorHandler {
    
    public static void main(String[] args) {
        try {
          double n1 = 2;
          double n2 = 0;
            throw new ArithmeticException();
        } catch(ArithmeticException e) {
            System.out.println("Denominator is zero");
        }
    }
}
