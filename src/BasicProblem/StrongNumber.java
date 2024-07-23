package BasicProblem;

import java.util.Scanner;

public class StrongNumber {
    public static int fact(int number){
        if(number==0 || number ==1 ){
            return 1;
        }else{
            return number*fact(number-1);
        }

    }

    public static boolean findStrongNumber(int n){
        int temp=0,sum=0;
        int original=n;
        while(n != 0){
            temp = n % 10;
            sum=sum+fact(temp);
            n/=10;
        }
        if(original==sum){
            return true;
        }else{
           return false;
        }


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=scanner.nextInt();
        boolean result=findStrongNumber(n);
        if(result){
            System.out.println(n+" is strong number...");
        }else{
            System.out.println(n+" is not strong number...");
        }

    }
}
