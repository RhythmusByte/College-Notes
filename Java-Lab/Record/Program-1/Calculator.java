class Calculator {
    private final int a, b;
    
    Calculator(String[] args) {
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
    }

    void calculate() {
        System.out.println("Sum: " + (a + b) + "\nDifference: " + (a - b) +
                           "\nProduct: " + (a * b) + "\nQuotient: " + (a / b) +
                           "\nRemainder: " + (a % b));
    }

    public static void main(String[] args) {
        new Calculator(args).calculate();
    }
}
