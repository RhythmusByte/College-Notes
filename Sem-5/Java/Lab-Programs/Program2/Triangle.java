
import java.util.*;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String checkType() {
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Isosceles";
        }
        else {
            return "Scalene";
        }
    }

    public double Area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side one: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the side two: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the side three: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        String type = triangle.checkType();
        double area = triangle.Area();

        System.out.println("The triangle is " + type);
        System.out.println("The area of the triangle is " + area);

    }
}
