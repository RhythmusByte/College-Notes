/* 
Write a program to find the sum, difference, 
product, quotient and remainder of two 
numbers passed as command line argument.
*/

class Program1 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.err.print("Enter 2 numbers as arguments!!!");
			System.exit(0);
		}

		String i = args[0];
		String j = args[1];

		int a = Integer.parseInt(i);
		int b = Integer.parseInt(j);

		int sum = a + b;
		int product = a * b;
		int quotient = a / b;
		int difference = a - b;
		int remainder = a % b;

		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Difference: " + difference);
		System.out.println("Remainder: " + remainder);
	}
}
