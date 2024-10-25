import java.util.Scanner;

public class Triangle2 {
  double sideOne;
  double sideTwo;
  double sideThree;
  
  public Triangle2(double a, double b, double c) {
    this.sideOne = a;
    this.sideTwo = b;
    this.sideThree = c;
  }
  
  public String checkType() {
    if(sideOne == sideTwo && sideTwo == sideThree) {
      return "Equilateral";
    } else if(sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
      return "Isosceles";
    } else {
      return "Scalene";
    }
  }
  
  public double area() {
    double z = (sideOne + sideTwo + sideThree) / 2;
    double area = Math.sqrt(z * (z - sideOne) * (z - sideTwo) * (z - sideThree));
    return area;
  }
  
  public Boolean validation() {
    return (sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo) && (sideThree + sideTwo > sideOne);
  }
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    System.out.print("Enter side one: ");
    double sideOne = scn.nextDouble();
    System.out.print("Enter side two: ");
    double sideTwo = scn.nextDouble();
    System.out.print("Enter side three: ");
    double sideThree = scn.nextDouble();
    
    Triangle2 triangle = new Triangle2(sideOne, sideTwo, sideThree);
    
   if(triangle.validation()) {
    String type = triangle.checkType();
    double area = triangle.area();
    
    System.out.println("Type of the triangle is " + type);
    System.out.println("Area of the triangle is " + area); 
   } else {
     System.out.println("Triangle can't be formed!!");
   }
  }
}