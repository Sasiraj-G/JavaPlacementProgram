package BasicProblem;

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year=scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 ==0){
                    System.out.println(year + " is leaf year");
                }else {
                    System.out.println(year + " not is leaf year");
                }
            }else{
                    System.out.println(year + " leaf year");
                }
        }else{
            System.out.println(year + " not leaf year");
        }
    }
}
