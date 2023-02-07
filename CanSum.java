import java.util.*;


public class CanSum {
    static Map<Integer, Boolean> memo=new HashMap<>();
    public static void main(String[] args) {
        // Important Note : Run the below statements one by one
        // System.out.println(canSum(7, new int[] { 2, 3 }));
        // System.out.println(canSum(7, new int[] { 5, 3, 4, 7 }));
        // System.out.println(canSum(7, new int[] { 2, 4}));
        // System.out.println(canSum(8, new int[] { 2, 3, 5 }));
        System.out.println(canSum(300, new int[] { 7, 14 }));
    }

    public static boolean canSum(int targetSum, int[] numbers){
        if (memo.containsKey(targetSum))    return memo.get(targetSum);
        if(targetSum==0)                    return true;
        if(targetSum<0)                     return false;
        for(int num:numbers){
            int remainder=targetSum-num;
            if(canSum(remainder, numbers))    {
                memo.put(targetSum,true);
                return true;
            }            
        }
        return false;
    }
}
