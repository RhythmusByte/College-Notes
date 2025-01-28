import java.util.Scanner;

public class VowelRemover {
  private String input;

  public VowelRemover(String input) {
    this.input = input;
  }

  public String removeVowels() {
    return input.replaceAll("(?i)[aeiou]", "");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    VowelRemover remover = new VowelRemover(str);
    System.out.println("String without vowels: " + remover.removeVowels());
  }
}
