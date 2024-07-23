package BasicProblem;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] sum=new int[]{1,2,4,5,6,4,9,8};
        System.out.println("Enter the number : ");
        int n=scanner.nextInt();
        System.out.println(twoSum(n,sum));

    }
    public static int[] twoSum(int n,int[] sum){
        for(int i=0;i<sum.length-1;i++){
            for(int j=i+1;j<sum.length-1;j++){
                if(sum[j] == n-sum[i]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
