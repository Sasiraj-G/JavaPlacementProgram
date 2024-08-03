package StarPatterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int i,j,s;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row : ");
        int row=scanner.nextInt();
       /*
       for(i=0;i<row;i++){
            for(s=0;s<row-i-1;s++){
                System.out.print("  ");
            }
            for(j=0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        */
        int sum=1;
        for(i=0;i<row;i++){
            for(j=0;j<row+i;j++){
               if(j<row-i-1) {
                   System.out.print("  ");
               }else {
                   System.out.print("* ");
                   sum++;
               }
            }
            System.out.println();
        }


    }
}
