package DataStrutureAndAlgorithm;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void RemoveDupicateElement(int element[],int size){
        for (int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(element[i] == element[j]){
                    for(int k=j;k<size;k++){
                        element[k]=element[k+1];
                    }
                    size--;
                    j--;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size=scanner.nextInt();
        int[] element=new int[size];
        System.out.println("Enter the array element one by one : ");
        for (int i=0;i<size;i++){
            element[i]=scanner.nextInt();
        }
        RemoveDupicateElement(element,size);
        System.out.println("After Remove Duplicate : "+ Arrays.toString(element));

    }
}
