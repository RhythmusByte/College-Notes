class Complex {
  double real, imag;

  public Complex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public Complex add(Complex other) {
    return new Complex(real + other.real, imag + other.imag);
  }

  public void display() {
    System.out.println(real + " + " + imag + "i");
  }
}

public class ComplexSum {
  public static void main(String[] args) {
    Complex num1 = new Complex(3, 2);
    Complex num2 = new Complex(1, 7);
    Complex sum = num1.add(num2);
    sum.display();
  }
}
