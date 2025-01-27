import java.util.Arrays;

public class MergeArrays {
    private int[] array1 = {19, 32, 45, 27};
    private int[] array2 = {23, 14, 60, 81};
    private int[] mergedArray = new int[array1.length + array2.length];

    public MergeArrays() {
        mergeArrays();
        printMessage();
    }

    private void mergeArrays() {
        int i = 0, j = 0, k = 0;

        // Merge the arrays while keeping the order
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // If there are any elements left in array1
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        // If there are any elements left in array2
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }
    }

    private void printMessage() {
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static void main(String[] args) {
        new MergeArrays();
    }
}
