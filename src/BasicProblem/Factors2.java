package BasicProblem;

import java.util.Arrays;
import java.util.Scanner;

public class Factors2 {

    public static int[] findFactors(int number){
        int index=0;
        int[] array=new int[number];
        for (int i=1;i<=number;i++){
            if(number % i ==0){
                array[index++]=i;
            }
        }
        return Arrays.copyOf(array,index);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the factor number : ");
        int n= scanner.nextInt();
        int[] result=findFactors(n);
        System.out.println("The factors number is : ");
        for(int num : result){
            System.out.println(num);
        }
    }
}
