// Write a Java Program to remove all vowels from a string 

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("String after removing vowels: " + removeVowels(str));
    }

    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}