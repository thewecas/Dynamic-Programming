import java.util.*;

public class BestSum {
    static Map<Integer, List<Integer>> memo = new HashMap<>();

    public static void main(String[] args) {
        // System.out.println(bestSum(7, new int[] { 5, 3, 4, 7 }));
        // System.out.println(bestSum(8,new int[]{2,3,5}));
        System.out.println(bestSum(8, new int[]{1,4,5}));
        // System.out.println(bestSum(100, new int[] {1,2,5,25}));

    }

    public static List<Integer> bestSum(int targetSum, int[] numbers) {
        if(memo.containsKey(targetSum))     return memo.get(targetSum);
        if(targetSum<0)     return null;
        if(targetSum==0)    return new ArrayList<Integer>();
        List<Integer> shortestCombination=null;
        for(int num:numbers){
            int remainder=targetSum-num;
            List<Integer> combination = bestSum(remainder, numbers);
            if(combination!=null){
                combination.add(num);
                if(shortestCombination==null || combination.size()<shortestCombination.size())
                    shortestCombination=combination;
            }
        }
        memo.put(targetSum,shortestCombination);
        // System.out.println(memo);
        // return memo.get(targetSum);
        return shortestCombination;
    }

}
