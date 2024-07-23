package BasicProblem;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String word=scanner.nextLine();
        if(Palindrome(word)){
            System.out.println("Given string is a palindrome");
        }else {
            System.out.println("Given string is not palindrome");
        }

    }
    public static boolean Palindrome(String word){

        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
