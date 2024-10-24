import java.util.*;
public class sort
{
public static void main(String[] args)
{
    Scanner scanner=new Scanner(System.in);
    System.out.println("How many elements you want to enter:");
    int size=scanner.nextInt();
    int[] myarr=new int[size];
    System.out.println("Enter the elements");
    for(int i=0;i<size;i++){
        myarr [i]=scanner.nextInt();
    }
    Arrays.sort(myarr);
    System.out.println("The Smallest Number in this Array:" +myarr[0]);
    System.out.println("The Largest Number in this Array:" +myarr[size-1]);
    System.out.println("The Second Largest Number in thi Array:" +myarr[size-2]);


}


}