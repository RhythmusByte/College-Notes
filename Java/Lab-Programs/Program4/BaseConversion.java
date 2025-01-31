import java.util.*;

public class BaseConversion{
		public static void main(String[] args){
			System.out.println("Enter the integer to convert : ");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			String binary = Integer.toBinaryString(num);
			String octal = Integer.toOctalString(num);
			String hex = Integer.toHexString(num);
			System.out.println("Binary: " + binary);
			System.out.println("Octal: " + octal);
			System.out.println("Hexadecimal: " + hex);
			in.close();
		}
		
}
