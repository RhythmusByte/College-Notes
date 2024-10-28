import java.util.*;

class Conversion {
  int num;
  String binary;
  String octal;
  String hex;
  
  public Conversion(int num) {
    this.num = num;
  }
  
  public String toBinary() {
    binary = Integer.toBinaryString(num);
    return binary;
  }
  
  public String toOctal() {
    octal = Integer.toOctalString(num);
    return octal;
  }
  
  public String toHex() {
    hex = Integer.toHexString(num);
    return hex;
  }
}

public class Convertion {
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   Boolean run = true;
   
   while(run) {
     System.out.print("\nBase Convertor\n\t1. Binary\n\t2. Octal\n\t3. Hexadecimal\n\t4. Exit\n\nEnter the number of your choice: ");
     int choice = scan.nextInt();
     
     System.out.print("Enter a number to convert: ");
     int num = scan.nextInt();
     
     Conversion baseConverter = new Conversion(num); 
     
     if(choice == 1) {
       System.out.println("Binary = " + baseConverter.toBinary());
     } else if(choice == 2) {
       System.out.println("Octal = " + baseConverter.toOctal());
     } else if(choice == 3) {
       System.out.println("Hexadecimal = " + baseConverter.toHex());
     } else if(choice == 4) {
       run = false;
     } else {
       throw new IllegalArgumentException("Invalid Input!!");
     }
   }
 }
}