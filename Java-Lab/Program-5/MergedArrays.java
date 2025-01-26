import java.util.Arrays;

public class MergedArrays {
  private int[] array1 = {1, 3, 5, 7};
  private int[] array2 = {2, 4, 6, 8};
  private int[] mergedArray = new int[array1.length + array2.length];

  public MergedArrays() {
    mergeArrays();
    printMessage();
  }

  private void mergeArrays() {
    for (int i = 0; i < array1.length; i++) {
      mergedArray[i] = array1[i];
    }
    for (int i = 0; i < array2.length; i++) {
      mergedArray[array1.length + i] = array2[i]; 
    }
    Arrays.sort(mergedArray);
  }

  private void printMessage() {
    System.out.println("Array 1: " + Arrays.toString(array1));
    System.out.println("Array 2: " + Arrays.toString(array2));
    System.out.println("Merged Array: " + Arrays.toString(mergedArray));
  }

  public static void main(String[] args) {
    new MergedArrays();
  }
}
