import java.util.ArrayList;
import java.util.*;

public class HowSum {
    static Map<Integer, ArrayList<Integer>> memo= new HashMap<>();
    public static void main(String[] args) {
        //Important Note : Run the below statements one by one
        // System.out.println(howSum(7, new int[] { 2, 3 }));
        // System.out.println(howSum(7, new int[] { 5, 3, 4, 7 }));
        // System.out.println(howSum(7, new int[] { 2, 4}));
        // System.out.println(howSum(8, new int[] { 2, 3, 5 }));
        System.out.println(howSum(300, new int[] {7,14}));
    }

    public static ArrayList<Integer> howSum(int targetSum,int[] numbers ){
        if(memo.containsKey(targetSum))     return memo.get(targetSum);
        if(targetSum==0)                    return new ArrayList<Integer>();
        if(targetSum<0)                     return null;
        for(int num:numbers){
            int remainder=targetSum-num;
            try{
                ArrayList<Integer> res= howSum(remainder, numbers);
                res.add(num);
                memo.put(targetSum, res);
                return memo.get(targetSum);
            }
            catch(Exception e){} 
        }
        memo.put(targetSum, null);
        return null;
    }
}
