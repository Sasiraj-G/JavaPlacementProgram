package BasicProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=scanner.nextInt();
        System.out.println(fizzbuzz(n));

    }
    public static List<String> fizzbuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean divisable3 = (i % 3 == 0);
            boolean divisable5 = (i % 5 == 0);
            if (divisable3 && divisable5) {
                answer.add("fizz buzz");
            } else if (divisable3) {
                answer.add("fizz");
            } else if (divisable5) {
                answer.add("buzz");

            } else {
                answer.add(Integer.toString(i));
            }
        }
        return answer;

          }
}
