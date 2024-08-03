package StarPatterns;

import java.util.Scanner;

public class DownPyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i,j,s;
        System.out.println("Enter the row value : ");
        int n=scanner.nextInt();
        for(i=0;i<n;i++){
            for(s=i;s<n;s++){
                System.out.print("  ");
            }
            for(j=0;j<9-i-s;i++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
