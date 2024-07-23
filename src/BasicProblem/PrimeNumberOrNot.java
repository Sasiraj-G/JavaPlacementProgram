package BasicProblem;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=scanner.nextInt();
        PrimeNumber(num);


    }
    public static void PrimeNumber(int num){
        int flag=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                flag++;
            }
        }
        if(flag == 1){
            System.out.println(num+" is Prime number");
        }
        else{
            System.out.println(num+" not prime number");
        }


    }
}
