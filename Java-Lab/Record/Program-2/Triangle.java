import java.util.Scanner;

class Triangle {
    private final double a, b, c;

    Triangle(Scanner sc) {
        System.out.print("Enter three sides: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }

    void analyze() {
        String type = (a == b && b == c) ? "Equilateral" : (a == b || b == c || a == c) ? "Isosceles" : "Scalene";
        double s = (a + b + c) / 2, area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Type: " + type + "\nArea: " + area);
    }

    public static void main(String[] args) {
        new Triangle(new Scanner(System.in)).analyze();
    }
}
