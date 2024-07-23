package BasicProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=scanner.nextInt();
        List<Integer> factors=factor(n);
        System.out.println(factors);
        for(int num : factors){
            System.out.println(num);
        }

    }
    public static List<Integer> factor(int n){
        List<Integer> factors=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n % i==0){
                factors.add(i);
            }
        }
        return factors;
    }
}
