public class Calculator{

    public static void main(String[] args){
        if (args.length!=2){
            System.out.println("please input Exactly two values");
				System.exit(0);
        }

        int num1=Integer.parseInt(args[0]); 
        int num2=Integer.parseInt(args[1]);

        int sum= num1 + num2;
        int difference=num1 - num2;
        int product= num1 * num2;
        int qoutient=num1 / num2;
        int remainder= num1 % num2;

        System.out.println("Sum of the two number is :" + sum);
        System.out.println("difference of the two number is :" + difference);
        System.out.println("product of the two number is :" + product);
        System.out.println("qoutient of the two number is :" + qoutient);
        System.out.println("remainder of the two number is :" + remainder);
    }
}
