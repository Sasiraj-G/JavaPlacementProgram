package BasicProblem;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=scanner.nextInt();
        int result=reverseNumber(n);
        System.out.println("The reverse number is "+ result);

    }
    public static int reverseNumber(int n){
        int rev=0;
        while (n>0){
           rev=rev*10+(n%10);
            n/=10;
        }
        return rev;

    }
}
