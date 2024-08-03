package DataStrutureAndAlgorithm;

import java.util.Scanner;

public class SearchElelement {
    public static int SearchElelement(int arrays[],int size,int search){
        for(int i=0;i<size;i++){
            if(arrays[i] == search){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size=scanner.nextInt();
        int[] arrays=new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            arrays[i]=scanner.nextInt();
        }
        System.out.println("Enter the Search number : ");
        int search=scanner.nextInt();
        int index=SearchElelement(arrays,size,search);
        if(index == -1){
            System.out.println("Element  not found !");
        }else {
            System.out.println(search+" number is index position is "+index);
        }
    }

}
