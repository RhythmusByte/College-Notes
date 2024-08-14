/*
Create an interface volume with member variable 
pi and methods readdata () and dispvolume (). 
Create two classes sphere and cylinder to 
implement this interface. 
Write a Java program to find the volume.
*/

import java.util.*;

interface Volume {
    double PI = Math.PI;
    void readData();
    void dispVolume();
}

class Sphere implements Volume {
    private double radius;
    private double volume;

    public void readData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = scan.nextDouble();
    }

    public void dispVolume() {
        volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere is " + volume);
        System.out.println("\n\n--------------------------\n\n");
    }
}

class Cylinder implements Volume {
    private double radius;
    private double volume;
    private double height;

    public void readData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = scan.nextDouble();
        System.out.print("\nEnter the height of the cylinder: ");
        height = scan.nextDouble();
    }

    public void dispVolume() {
        double volume = PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder is " + volume);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Volume sphere = new Sphere();
        sphere.readData();
        sphere.dispVolume();

        Volume cylinder = new Cylinder();
        cylinder.readData();
        cylinder.dispVolume();
    } 
}
