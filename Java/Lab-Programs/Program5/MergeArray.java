import java.util.* ;

public class MergeArray {

    int[] getArray(int size, Scanner in) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + "th element:");
            arr[i] = in.nextInt();
        }
        return arr;
    }

    int[] getMergedArray(int[] arr1, int size1, int[] arr2, int size2) {
        int[] mergedArray = new int[size1 + size2];
        for (int i = 0; i < size1 + size2; i++) {
            if (i < size1)
                mergedArray[i] = arr1[i];
            else
                mergedArray[i] = arr2[i - size1];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int fsize = in.nextInt();
        System.out.println("Enter the size of the second array: ");
        int ssize = in.nextInt();
        
        MergeArray arrayop = new MergeArray();
        int[] arr1 = arrayop.getArray(fsize, in);
        int[] arr2 = arrayop.getArray(ssize, in);
        
        int[] merged = arrayop.getMergedArray(arr1, fsize, arr2, ssize);
        
        System.out.println("The merged array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.println((i + 1) + "th element: " + merged[i]);
        }
        in.close();
    }
}
