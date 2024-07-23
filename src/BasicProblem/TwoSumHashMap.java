package BasicProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] element=new int[]{1,2,4,6,8};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the target");
        int target=scanner.nextInt();
        findTwosum(element,target);
    }
    public static Map<Integer,Integer> findTwosum(int[] element,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<element.length;i++){
            if(map.containsKey(target - element[i])){
                element[0]=i;
                element[1]=map.get(target=element[])
            }
        }
    }
}
