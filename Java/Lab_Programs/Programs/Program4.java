/*k
Create an interface volume with member variable 
pi and methods readdata () and dispvolume (). 
Create two classes sphere and cylinder to 
implement this interface. 
Write a Java program to find the volume.
*/

import java.util.Scanner;

interface Volume {
    double PI = Math.PI;
    void readData();
    void dispVolume();
}

class Sphere implements Volume {
    private double radius;
    
    public void readData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = scan.nextDouble();
    }
    
    public void dispVolume() {
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere is " + volume);
    }
}

class Cylinder implements Volume {
    private double radius;
    private double height;
    
    public void readData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = scan.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        height = scan.nextDouble();
    }
    
    public void dispVolume() {
        double volume = PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder is " + volume);
    }
}

public class Program4 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Volume sphere = new Sphere();
                    sphere.readData();
                    sphere.dispVolume();
                    break;
                case 2:
                    Volume cylinder = new Cylinder();
                    cylinder.readData();
                    cylinder.dispVolume();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        scan.close();
    }

    private static void displayMenu() {
        System.out.println("\nFind the Volume\n---------------\n");
        System.out.println("\t1. Sphere");
        System.out.println("\t2. Cylinder");
        System.out.println("\t3. Exit");
        System.out.print("\nEnter your choice: ");
    }
}
