// Given the sides of a triangle, write a program to check whether the triangle is 
// equilateral, isosceles or scalene and find its area.

import java.util.Scanner;

public class Main {
  private static final Scanner SCANNER = new Scanner(System.in);

  private static double readValues(String prompt) {
    System.out.print("Enter " + prompt + ": ");
    double value = SCANNER.nextDouble();
    return value;
  }

  private static boolean isEquilateral(
    double sideOne,
    double sideTwo,
    double sideThree
  ) {
    if (sideOne == sideTwo && sideOne == sideThree)
      return true;
    else
      return false;
  }

  private static boolean isIsosceles(
    double sideOne,
    double sideTwo,
    double sideThree
  ) {
    if (sideOne == sideTwo ||sideTwo == sideThree || sideOne == sideThree)
      return true;
    else
      return false; 
  }

  private static boolean isValidTriangle(
    double sideOne,
    double sideTwo,
    double sideThree
  ) {
    if (sideOne + sideTwo <= sideThree ||
        sideTwo + sideThree <= sideOne ||
        sideOne + sideThree <= sideTwo) {
      System.err.println("Triangle can't be formed");
      
      return false;
    }
    else 
      return true;
  }

  private static void findArea(
    double sideOne,
    double sideTwo,
    double sideThree
  ) {
    double s = (sideOne + sideTwo + sideThree) / 2;
    double value = Math.sqrt(s 
      * (s - sideOne) 
      * (s - sideTwo) 
      * (s - sideThree)
    );

    System.out.println("Area of the triangle is: " + value);
  }

  public static void main(String[] args) {
    double sideOne = readValues("Side One");
    double sideTwo = readValues("Side Two");
    double sideThree = readValues("Side Three");

    if(isValidTriangle(sideOne, sideTwo, sideThree)) {
      if (isEquilateral(sideOne, sideTwo, sideThree)) 
        System.out.println("Triangle is equilateral!");
      else if (isIsosceles(sideOne, sideTwo, sideThree)) 
        System.out.println("Triangle is isosceles!");
      else 
        System.out.println("Triangle is scalene!");

      findArea(sideOne, sideTwo, sideThree);
    }

    SCANNER.close();
  }
}
