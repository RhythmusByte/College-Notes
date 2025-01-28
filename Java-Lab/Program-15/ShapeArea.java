abstract class Shape {
  abstract double area();
}

abstract class TwoDim extends Shape {}
abstract class ThreeDim extends Shape {}

class Square extends TwoDim {
  double side;
  Square(double side) { this.side = side; }
  double area() { return side * side; }
}

class Triangle extends TwoDim {
  double base, height;
  Triangle(double base, double height) { this.base = base; this.height = height; }
  double area() { return 0.5 * base * height; }
}

class Sphere extends ThreeDim {
  double radius;
  Sphere(double radius) { this.radius = radius; }
  double area() { return 4 * Math.PI * radius * radius; }
}

class Cube extends ThreeDim {
  double side;
  Cube(double side) { this.side = side; }
  double area() { return 6 * side * side; }
}

public class ShapeArea {
  public static void main(String[] args) {
    Shape s1 = new Square(4);
    Shape s2 = new Triangle(5, 6);
    Shape s3 = new Sphere(3);
    Shape s4 = new Cube(2);

    System.out.println(s1.area());
    System.out.println(s2.area());
    System.out.println(s3.area());
    System.out.println(s4.area());
  }
}
