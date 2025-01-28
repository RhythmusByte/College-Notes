import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
  private String str1, str2;

  public AnagramChecker(String str1, String str2) {
    this.str1 = str1.toLowerCase();
    this.str2 = str2.toLowerCase();
  }

  public boolean isAnagram() {
    if (str1.length() != str2.length()) return false;
    char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first string: ");
    String str1 = scanner.nextLine();
    System.out.print("Enter second string: ");
    String str2 = scanner.nextLine();

    AnagramChecker checker = new AnagramChecker(str1, str2);
    System.out.println(checker.isAnagram() ? "The strings are anagrams." : "The strings are not anagrams.");
  }
}
