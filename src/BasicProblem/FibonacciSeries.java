package BasicProblem;

import java.util.Scanner;


public class FibonacciSeries {

    public static void Fibonaccei(int number){
        int a=-1,b=1,c=0;

        for (int i=1;i<=number;i++) {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }

    public static int RecurisionFibo(int num){
        if( num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }else{
            return RecurisionFibo(num-1) + RecurisionFibo(num-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=-1,b=1,c=0;
        System.out.println("Enter the number : ");
        int n=scanner.nextInt();
       //
        System.out.println("Fibonacci series up to "+n+" terms : ");
        for(int i=0;i<n;i++){
            System.out.print(RecurisionFibo(i) + " ");
        }



    }
}
