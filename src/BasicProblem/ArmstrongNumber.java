package BasicProblem;

import java.util.Scanner;


public class ArmstrongNumber {
    public static int findPower(int base,int power){
        int val=1;
        while(power > 0){
            val*=base;
            power--;
        }
        return val;

    }

    public static boolean FindArmstrongNumber(int num){
        int count=0,sum=0,rem;
        int check=num;
        for(int i=num;i>0;i/=10)
            count++;
        while (num>0){
            sum+=findPower(num%10,count);
            num/=10;
        }
        if(check == sum)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        boolean result=FindArmstrongNumber(num);
        if(result){
            System.out.println(num +" is Armstrong Number...");
        }
        else{
            System.out.println(num+" not Armstrong Number ....");
        }


    }
}
