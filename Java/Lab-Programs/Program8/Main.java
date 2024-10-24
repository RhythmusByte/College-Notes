import java.util.*;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = in.nextInt();
        NumberManipulation n = new NumberManipulation(num);
        System.out.println("Reverse :" + n.reverse());
        System.out.println("Sum :" + n.sum());
        in.close();
    }
}

class NumberManipulation{
    int num;
    public NumberManipulation(int n){
        this.num = n; 
    }
    int reverse() {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            rev = (rev * 10) + lastDigit;
            temp /= 10;
        }
        return rev;
    } 

    int sum() {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;
            temp /= 10;
        }
        return sum;
    }
}