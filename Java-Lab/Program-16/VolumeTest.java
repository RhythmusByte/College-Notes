interface Volume {
  double pi = 3.14159;
  void readdata();
  void dispvolume();
}

class Sphere implements Volume {
  double radius;

  public void readdata() { radius = 3; }
  public void dispvolume() { System.out.println("Volume of Sphere: " + (4.0 / 3.0) * pi * Math.pow(radius, 3)); }
}

class Cylinder implements Volume {
  double radius, height;

  public void readdata() { radius = 3; height = 5; }
  public void dispvolume() { System.out.println("Volume of Cylinder: " + pi * Math.pow(radius, 2) * height); }
}

public class VolumeTest {
  public static void main(String[] args) {
    Volume v1 = new Sphere();
    Volume v2 = new Cylinder();

    v1.readdata();
    v1.dispvolume();

    v2.readdata();
    v2.dispvolume();
  }
}
