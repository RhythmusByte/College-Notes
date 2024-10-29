import java.util.*;

public class ArrayMerging {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int[] array1;
    int[] array2;
    int[] mergedArray;
    int minLen;
    
    System.out.print("Enter the length of array1: ");
    int len1 = scan.nextInt();
    System.out.print("Enter the length of array2: ");
    int len2 = scan.nextInt();
    
    array1 = new int[len1];
    array2 = new int[len2];
    
    for(int i=0;i<array1.length;i++) {
      System.out.print("Enter an element for array 1: ");
      array1[i] = scan.nextInt();
    }
    
    for(int x=0;x<array2.length;x++) {
      System.out.print("Enter an element for array 2: ");
      array2[x] = scan.nextInt();
    }
    
    minLen = Math.min(array1.length, array2.length);
    mergedArray = new int[array1.length + array2.length];
    
    for(int z=0;z < minLen;z++) {
      mergedArray[z+2] = array1[z]
    }
  }
}