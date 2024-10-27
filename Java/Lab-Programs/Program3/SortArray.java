import java.util.*;

class ArrayProcessor {
  private int[] array;
  private int smallest;
  private int largest;
  private int secondLargest;
  
  public void getData() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int length = scan.nextInt();
    
    array = new int[length];
    
    if(length < 3) {
      throw new IllegalArgumentException("Length must be at least 3");
    }
    for(int i=0;i<length;i++) {
      System.out.print("Enter the element: ");
      array[i] = scan.nextInt();
    }
    scan.close();
    sortArray();
  }
  
  private void sortArray() {
    Arrays.sort(array);
    smallest = array[0];
    secondLargest = array[array.length-2];
    largest = array[array.length-1];
  }
  public int getSmallest() {
    return smallest;
  }
  
  public int getSecondLargest() {
    return secondLargest;
  }
  
  public int getLargest() {
    return largest;
  }
}

public class SortArray {
  public static void main(String[] args) {
    ArrayProcessor myArr = new ArrayProcessor();
    myArr.getData();
  
    System.out.println("Smallest: " + myArr.getSmallest());
    System.out.println("Second Largest: " + myArr.getSecondLargest());
    System.out.println("Largest: " + myArr.getLargest());
  }
}