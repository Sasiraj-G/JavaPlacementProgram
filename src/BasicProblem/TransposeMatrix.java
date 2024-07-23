package BasicProblem;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] matrix=new int[10][10];
        int[][] transpose=new int[10][10];
        System.out.println("Enter the row and column");
        int row=scanner.nextInt();
        int column=scanner.nextInt();
        System.out.println("Enter the row and column elements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Print original Matrix :  ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose matrix :  ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                transpose[j][i]=matrix[i][j];

        }

        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }


    }
}
