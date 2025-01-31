public class Calc {
    public static void main(String[] args) {
        System.out.println("\nWrite a program to find the sum, difference, product, quotient and remainder of two\n" + 
                        "numbers passed as command line argument.\n\n--------------------\n\n");

        if (args.length != 2) {
            System.err.println("Please enter two values for arguments!!!");
            System.exit(0);
        }
        
        String a = args[0];
        String b = args[1];

        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        
        int l = i + j; // Sum
        int m = i * j; // Product
        int n = i / j; // Quotient
        int o = i - j; // Difference
        int p = i % j; // Remainder

        System.out.println("The sum of " + i + " and " + j + " is " + l);
        System.out.println("The product of " + i + " and " + j + " is " + m);
        System.out.println("The quotient of " + i + " and " + j + " is " + n);
        System.out.println("The remainder of " + i + " and " + j + " is " + o);
        System.out.println("The difference of " + i + " and " + j + " is " + p);
    }
}
