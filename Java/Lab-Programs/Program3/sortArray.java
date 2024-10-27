import java.util.*;

public class sortArray {
  public static void main(String[] args) {
    Scanner scan =  new Scanner(System.in);
    
    System.out.print("Enter the length of the array: ");
    int len = scan.nextInt();
    
    int[] array = new int[len];
    
    for(int i=0;i<len;i++) {
      System.out.print("Enter the element: ");
      array[i] = scan.nextInt();
    }
    
    Arrays.sort(array);
    
    int smallest = array[0];
    int secondLargest = array[len-2];
    int largest = array[len-1];
    
    System.out.println("Largest number in the array is " + largest);
    System.out.println("Second largest number in the array is " + secondLargest);
    System.out.println("Smallest number in the array is " + smallest);
  }
}