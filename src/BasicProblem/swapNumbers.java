package BasicProblem;

import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b= ");
        int b=scanner.nextInt();
   /*     a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap");
        System.out.println("A : "+a + "\nB : "+b);  */

        int[] swappedValue=swapNumbers(a,b);
        a=swappedValue[0];
        b=swappedValue[1];
        System.out.println("After swapped");
        System.out.println("a = "+a);
        System.out.println("a = "+b);


    }
    public static int[] swapNumbers(int a,int b){
        a=a ^ b;
        b=a ^ b;
        a=a ^ b;

        return new int[]{a,b};

    }
}
