import java.util.*;

public class Fibonacci{
    static Map<Integer,Long> memo = new HashMap<>();
    public static void main(String[] args) {
       System.out.println(fib(6));
       System.out.println(fib(7));
       System.out.println(fib(8));
       System.out.println(fib(50));
    }

    public static Long fib(int n){
        if (n<=2)                   return (long)1;
        if (memo.containsKey(n))    return memo.get(n);
        memo.put(n,fib(n-1) + fib(n-2));
        return memo.get(n);
    }

}