package BasicProblem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Decimal Number : ");
        int decimal=scanner.nextInt();
        FindDTB(decimal);


    }
    public static void FindDTB(int decimal){
        int[] stroe=new int[decimal];
        int index=0;
        while(decimal > 0){
         stroe[index]=decimal % 2;
         decimal/=2;
         index++;
        }
        for(int i=index-1;i>=0;i--){
            System.out.print(stroe[i]+" ");

        }

    }
}
