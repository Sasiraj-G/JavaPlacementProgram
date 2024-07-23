package BasicProblem;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        int result=sumOfDigit(num);

        System.out.println("The sum of digit is : "+result);
    }
    public static int sumOfDigit(int num){
        int sum=0;
        while(num != 0){
            sum=sum+(num%10);
            num/=10;
        }
        return sum;

    }
}
