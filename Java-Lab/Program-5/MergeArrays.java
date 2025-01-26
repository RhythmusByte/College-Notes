import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
    
        int[] array1 = {1, 3, 5, 7};
  int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {

        int[] mergedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        Arrays.sort(mergedArray);

        return mergedArray;
    }
}
