package DataStrutureAndAlgorithm.LeetCodeQ;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int number[],int target){
        int arr[]=new int[2];
        HashMap<Integer,Integer> element=new HashMap<Integer,Integer>();
        for(int i=0;i<number.length;i++) {
            if (element.containsKey(target - number[i])){
                arr[1]=number[i];
                arr[0]=target-number[i];
                return arr;
            }
            element.put(number[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] number=new int[]{1,3,8,9,5};
        int target=14;
        int[] res=twoSum(number,target);
        for(int i:res){
            System.out.println(i);
        }

    }
}
