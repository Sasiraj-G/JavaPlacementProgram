package BasicProblem;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        long n=scanner.nextInt();
        try {
            long result = findFactorial(n);
            System.out.println("BasicProblem.Factorial is : " + result);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static long findFactorial(long n){
        if(n < 0){
            throw new IllegalArgumentException("Factroial is not defined for negative numbers");
        }
        else if(n == 0 || n==1){
            return 1;
        }
        else{
            return n*(findFactorial(n-1));
        }
    }
}
