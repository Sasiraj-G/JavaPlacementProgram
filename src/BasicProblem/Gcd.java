package BasicProblem;

import java.util.Scanner;

public class Gcd {

    public static int findGCD(int first,int second){
        int gcd=0;
        for(int i=1;i<=first && i<=second;i++){
            if(first % i ==0 && second % i ==0){
                gcd=i;

            }
        }
        return gcd;

    }

    public static int EuclidenAlgorith(int first,int second){
        if(first == 0)
            return second;
        EuclidenAlgorith(second%first,first);
        return first;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first=scanner.nextInt();
        System.out.println("Enter the second number : ");
        int second=scanner.nextInt();
        int gcd=findGCD(first,second);
        System.out.println("GCD Value Is : "+gcd);

    }
}
