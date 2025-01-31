import java.util.*;

public class FindHcfLcm {
    
    
    int getHcf(int n1, int n2) {
        int min = (n1 < n2) ? n1 : n2;
        for (int i = min; i != 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i; 
            }
        }
        return 1;
    }
    
  
    int getLcm(int n1, int n2) {
        int hcf = getHcf(n1, n2);
        return (n1 * n2) / hcf; // Using the relation LCM * HCF = n1 * n2
    }
    
    public static void main(String[] args) {
        FindHcfLcm finder = new FindHcfLcm();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int hcf = finder.getHcf(num1, num2);
        int lcm = finder.getLcm(num1, num2);

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
        
        scanner.close();
    }
}

