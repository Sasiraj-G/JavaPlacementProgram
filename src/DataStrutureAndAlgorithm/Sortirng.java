package DataStrutureAndAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sortirng {

    public static void sorting(int arrays[],int size){
        int temp=0;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arrays[i] > arrays[j]){
                    temp=arrays[i];
                    arrays[i]=arrays[j];
                    arrays[j]=temp;
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
        for(int i=0;i<size;i++) {
            element[i] = scanner.nextInt();
        }
        sorting(element,size);
        System.out.println("Sorting array : "+ Arrays.toString(element));


    }
}
