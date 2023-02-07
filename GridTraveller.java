import java.util.*;

public class GridTraveller {

    static Map<String,Long> memo=new HashMap<>();
    public static void main(String[] args) {
        System.out.println(gridTraveler(1, 1));
        System.out.println(gridTraveler(2, 3));
        System.out.println(gridTraveler(3, 2));
        System.out.println(gridTraveler(3, 3));
        System.out.println(gridTraveler(18, 18));
    }

    public static Long gridTraveler(int m, int n) {
        if (m == 1 && n == 1)       return (long)1;
        if (m == 0 || n == 0)       return (long)0;
        String k=m<n? Integer.toString(m)+","+Integer.toString(n) : Integer.toString(n) + "," + Integer.toString(m);
        if(memo.containsKey(k))   return memo.get(k);
        memo.put(k,gridTraveler(m - 1, n) + gridTraveler(m, n - 1));
        return memo.get(k);

    }
}