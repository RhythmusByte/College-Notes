import java.util.Scanner;
import java.util.Arrays;

public class ArrayAnalysis {
  private static final Scanner SCANNER = new Scanner(System.in);

  private byte size = 10;
  private int[] array = new int[size];

  public ArrayAnalysis() {
    readValues();
    smallestElement();
    secondLargest();
    largestElement();
  }

  private void readValues() {
    for (int i = 0; i < size; i++) {
      System.out.print("Enter the element: ");
      array[i] = SCANNER.nextInt();
    }
    Arrays.sort(array);
  }

  private void smallestElement() {
    System.out.println("Smallest Element: " + array[0]);
  }

  private void secondLargest() {
    System.out.println("Second Largest Element: " + array[array.length - 2]);
  }

  private void largestElement() {
    System.out.println("Largest Element: " + array[array.length - 1]);
  }
  
  public static void main(String[] args) {
    var array = new ArrayAnalysis();
  }
}
