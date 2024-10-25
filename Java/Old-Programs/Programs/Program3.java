/*
Read an array of 10 or more numbers and 
write a program to find the
  a) Smallest element in the array
  b) Largest element in the array
  c) Second largest element in the array
*/

import java.util.*;

public class Program3 {
    public int[] array;

    public Program3(int[] array) {
        this.array = array;
    }

    public void sortArray() {
        Arrays.sort(array);
    }

    public int smallestNumber() {
        return array[0];
    }

    public int largestNumber() {
        return array[array.length -1];
    }

    public int secondLargest() {
        return array[array.length -2];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = scan.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements:");

        for(int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        Program3 myarr = new Program3(array);

        myarr.sortArray();
        System.out.println("Smallest number in the array is  " + myarr.smallestNumber());
        System.out.println("Largest number in this array is " + myarr.largestNumber());
        System.out.println("Second largest number in this array is " + myarr.secondLargest());
    }
}
