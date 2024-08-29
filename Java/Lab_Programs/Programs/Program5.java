import java.util.*;

public class BaseConverter {
    private int num;

    public BaseConverter(int num) {
        this.num = num;
    }

    public String toBinary() {
        return Integer.toBinaryString(num);
    }

    public String toOctal() {
        return Integer.toOctalString(num);
    }

    public String toHexadecimal() {
        return Integer.toHexString(num).toUpperCase();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choice;

        System.out.print("Enter a number to convert: ");
        int num = scan.nextInt();

        BaseConverter converter = new BaseConverter(num);

        do {
            System.out.println("Choose one option");
            System.out.println("1.\tTo Binary");
            System.out.println("2.\tTo Octal");
            System.out.println("3.\tTo Hexadecimal");
            System.out.println("4.\tExit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Binary : " + converter.toBinary() + "\n");
                    break;

                case 2:
                    System.out.println("Octal : " + converter.toOctal() + "\n");
                    break;

                case 3:
                    System.out.println("Hexadecimal : " + converter.toHexadecimal() + "\n");
                    break;

                case 4:
                    System.out.println("Exiting...\n");
                    break;

                default:
                    System.err.println("Invalid Option!!!\n");
                    break;
            }
        } while (choice != 4);
    }
}
