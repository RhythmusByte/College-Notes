import java.util.Arrays;

public class MergeArrays {
  private int[] array1 = {1, 4, 7, 8};
  private int[] array2 = {6, 5, 2, 3};
  private int[] mergedArray = new int[array1.length + array2.length];

  private void mergeArrays() {
    int i = 0, j = 0, k = 0;
    while (i < array1.length && j < array2.length) {
      mergedArray[k++] = array1[i++];
      mergedArray[k++] = array2[j++];
    }

    while (i < array1.length) {
      mergedArray[k++] = array1[i++];
    }

    while (j < array2.length) {
      mergedArray[k++] = array2[j++];
    }
  }

  public static void main(String[] args) {
    MergeArrays arr = new MergeArrays();
    arr.mergeArrays();
    System.out.println("Array 1: " + Arrays.toString(arr.array1));
    System.out.println("Array 2: " + Arrays.toString(arr.array2));
    System.out.println("Merged Array: " + Arrays.toString(arr.mergedArray));
  }
}
