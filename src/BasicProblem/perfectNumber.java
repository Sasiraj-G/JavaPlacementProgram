package BasicProblem;

import java.util.Scanner;

public class perfectNumber {

    public static boolean perfect(int number){
        int sum=0;
        for(int i=1;i<6;i++){
            if(number % i ==0 ){
                sum+=i;
            }
        }
        if(number == sum){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=scanner.nextInt();
        boolean result=perfect(n);
        if(result){
            System.out.println(n+ " is perfect Number....");
        }else{
            System.out.println(n+" Not perfect Numbre ......");
        }


    }
}
