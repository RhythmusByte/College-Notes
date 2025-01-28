class Volume {
  public double volume(double side) {
    return side * side * side;
  }

  public double volume(double length, double width, double height) {
    return length * width * height;
  }

  public double volume(double radius, double height) {
    return Math.PI * radius * radius * height;
  }

  public static void main(String[] args) {
    Volume v = new Volume();

    System.out.println("Volume of Cube: " + v.volume(3));
    System.out.println("Volume of Rectangular Box: " + v.volume(2, 4, 5));
    System.out.println("Volume of Cylinder: " + v.volume(3, 7));
  }
}
