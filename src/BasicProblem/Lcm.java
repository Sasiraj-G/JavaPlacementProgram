package BasicProblem;

import java.util.Scanner;

public class Lcm {

    public static int findLCM(int first,int second){

        int big=first > second ? first : second;
        int mul=big;
        while (true){
            if(big % first==0 && big % second==0 )
                break;
            big=big+mul;

        }

        return big;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First number : ");
        int first=scanner.nextInt();
        System.out.println("Enter Second number : ");
        int second=scanner.nextInt();
        int lcm=findLCM(first,second);
        System.out.println("LCM "+first+" and "+second+" is value "+ lcm);

    }
}

