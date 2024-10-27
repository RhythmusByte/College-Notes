import java.util.*;

public class arraySorting {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the length of the array: ");
    int lengthOfArray = scan.nextInt();
    
    if(lengthOfArray < 3) {
      throw new IllegalArgumentException("Length of the array must be at least 3!!");
    }
    
    int[] array = new int[lengthOfArray];
    
    for(int i=0; i<lengthOfArray; i++) {
      System.out.print("Enter the element: ");
      array[i] = scan.nextInt();
    }
    
    Arrays.sort(array);
    int smallest = array[0];
    int secondLargest = array[lengthOfArray-2];
    int largest = array[lengthOfArray-1];
    
    System.out.println("Smallest number in the array is: " + smallest);
    System.out.println("Second largest number in the array is: " + secondLargest);
    System.out.println("Largest number in the array is: " + largest);
  }
}