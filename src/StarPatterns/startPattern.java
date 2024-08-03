package StarPatterns;

import java.util.Scanner;

public class startPattern {
    public static void main(String[] args) {
        int sum=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        for (int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}
