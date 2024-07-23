package BasicProblem;

import java.util.Scanner;

public class ReverseStrin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name=scanner.nextLine();
//       String rev= ReverseString(name);
//        System.out.println(rev);
        char[] input=name.toCharArray();

        StringBuilder sb=new StringBuilder();
        for(int i=input.length-1;i>=0;i--){
            sb.append(input[i]);
        }
        System.out.println("Reverse String : "+sb.toString());

    }
    public static String ReverseString(String name){
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        return rev;

    }
}
