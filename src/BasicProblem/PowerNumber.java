package BasicProblem;

import java.util.Scanner;

public class PowerNumber {

    public static long FindPower(int base,int exp){
        int result=1;
        while(exp != 0){
            result=result*base;
            exp--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the base number : ");
        int base=scanner.nextInt();
        System.out.println("Enter the exponent number : ");
        int exp=scanner.nextInt();
       long result=FindPower(base,exp);
        System.out.println("The result : "+result);


    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class Main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
            }

            int a=10,b=18,c=0;
            c=a^b;
            System.out.println(c);
        }
    }
}
