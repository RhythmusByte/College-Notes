import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String1: ");
        String a = in.nextLine();
        System.out.println("Enter the String2: ");
        String b = in.nextLine();

        Anagram am = new Anagram();
        if (am.isAnagram(a, b))
            System.out.println("It Is An Anagram");
        else
            System.out.println("It Is Not An Anagram");
        
        in.close();
    }
}

class Anagram {
    boolean isAnagram(String a, String b) {
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();
        
        if (a.length() != b.length()) 
            return false;

        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }
}
