/*
Given the sides of a triangle, write a 
program to check whether the triangle is 
equilateral, isosceles or scalene and find its area.
*/

import java.util.*;

public class Triangle
{
	public double side1;
	public double side2;
	public double side3;
	
	public Triangle(double side1, double side2, double side3) {
	    
	    if(validTriangle(side1, side2, side3)) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }
	    else {
	        throw new IllegalArgumentException("Can't form a valid triangle!!!");
	    }
	}
	
	public boolean validTriangle(double a, double b, double c) {
	    return (a + b > c) && (b + c > a) && (a + c > b);
	}
	
	public String checkType() {
	    if(side1 == side2 && side2 == side3) {
	        return "Equilateral";
	    }
	    else if(side1 == side2 || side2 == side3 || side1 == side3) {
	        return "Isosceles";
	    }
	    else {
	        return "Scalene";
	    }
	}
	
	public double findArea() {
	    double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter side a: ");
	    double side1 = scan.nextDouble();
	    System.out.println("Enter side b: ");
	    double side2 = scan.nextDouble();
	    System.out.println("Enter side c: ");
	    double side3 = scan.nextDouble();
	    
	    Triangle triangle = new Triangle(side1, side2, side3);
	    String type = triangle.checkType();
	    double area = triangle.findArea();
	    
	    System.out.println("Triangle type is " + type);
	    System.out.println("Area of triangle is " + area);
	}
}
