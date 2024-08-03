package StarPatterns;

import java.util.Scanner;

public class boxStar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=1;
        System.out.println("Enter the how many lines : ");
        int line=scanner.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line;j++){
                if(i==1 || i==line || j==1 || j==line )
                    System.out.print("* ");
                else
                    System.out.print("  ");


            }
            System.out.println();
        }
    }
}
