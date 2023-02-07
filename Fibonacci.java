import java.util.*;

public class Fibonacci{
    static Map<Integer,Long> memo = new HashMap<>();        //Data structure to store fibonacci value when its calculated for the first time
    public static void main(String[] args) {
       System.out.println(fib(6));
       System.out.println(fib(7));
       System.out.println(fib(8));
       System.out.println(fib(50));
    }

    public static Long fib(int n){
        if (n<=2)                   return (long)1;         //base case
        if (memo.containsKey(n))    return memo.get(n);     //return fib(n) from memo if it's already calculated &  present
        memo.put(n,fib(n-1) + fib(n-2));                    //if not present, calculate it & add to memo
        return memo.get(n);
    }

}