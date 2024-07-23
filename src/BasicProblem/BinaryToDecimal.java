package BasicProblem;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Binary number : ");
        int binary=scanner.nextInt();
        int result=FindBinaryToDecimal(binary);
        System.out.println(binary +" binary number to decimal : "+result);

    }
    public static int findPower(int base,int exp){
        int mul=1;
        while(exp>0){
            mul=mul*base;
            exp--;
        }
        return mul;
    }
    public static int FindBinaryToDecimal(int binary){
        int i=0,rem=0,sum=0;
        while(binary > 0){
            rem=binary % 10;
            sum=sum+rem*findPower(2,i);
            i++;
            binary/=10;
        }
        return sum;
    }

}
