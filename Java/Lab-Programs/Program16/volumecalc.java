import java.util.*;

 interface Volume{
    double PI=Math.PI;
    void readdata();
    void dispvolume();
}
class Sphere implements Volume {
    private double radius;
    private double volume;

   public void readdata(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the radius of the sphere:");
    radius=scanner.nextDouble();
    }

public void dispvolume(){
    volume=(4.0/3.0)*PI*Math.pow(radius,3);
    System.out.println("the volume of the sphere is:"+ volume);
}
}
class Cylinder implements Volume{
    private double radius;
    private double height;

    public void readdata(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the radius of the cylinder:");
        radius=scanner.nextDouble();
        System.out.println("enter the Height og the cylinder:");
        height=scanner.nextDouble();
        }
    
    public void dispvolume(){

        double volume=PI * Math.pow(radius, 2) * height;
        System.out.println("the volume of the cylinder :"+ volume);
    }

}

public class volumecalc{
    public static void main(String[] args) {
        Sphere sphere= new Sphere();
        sphere.readdata();
        sphere.dispvolume();
        Cylinder cylinder= new Cylinder();
        cylinder.readdata();
        cylinder.dispvolume();
    }
    
}