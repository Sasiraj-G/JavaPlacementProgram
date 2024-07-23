package BasicProblem;

import java.util.Scanner;

public class LSB {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=scanner.nextInt();
        int booleans=1;
        if((a & booleans) == 0){
            System.out.println("BasicProblem.LSB IS SET ");
            System.out.println("Even number");
        }else{
            System.out.println("BasicProblem.LSB not set");
            System.out.println("ODD number");
        }
    }
}
