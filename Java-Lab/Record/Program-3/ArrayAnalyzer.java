import java.util.Scanner;
import java.util.Arrays;

class ArrayAnalyzer {
    private final int[] arr;

    ArrayAnalyzer(Scanner sc) {
        System.out.print("Enter at least 10 numbers: ");
        arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    void analyze() {
        Arrays.sort(arr);
        int min = arr[0], max = arr[arr.length - 1], secondMax = arr[arr.length - 2];
        System.out.println("Smallest: " + min + "\nLargest: " + max + "\nSecond Largest: " + secondMax);
    }

    public static void main(String[] args) {
        new ArrayAnalyzer(new Scanner(System.in)).analyze();
    }
}
