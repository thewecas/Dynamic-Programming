import java.util.*;

public class GridTraveller {

    static Map<String,Long> memo=new HashMap<>();
    public static void main(String[] args) {
        System.out.println(gridTravel(18, 18));
    }

    public static Long gridTravel(int m, int n) {
        if (m == 1 && n == 1)       return (long)1;                     //base case
        if (m == 0 || n == 0)       return (long)0;                     //base case
        String k=m<n? Integer.toString(m)+","+Integer.toString(n) : Integer.toString(n) + "," + Integer.toString(m);    //converting to the string of the form "m,n",  gridTravel(m,n)=gridTravel(n,m)
        if(memo.containsKey(k))   return memo.get(k);
        memo.put(k,gridTravel(m - 1, n) + gridTravel(m, n - 1));
        return memo.get(k);

    }
}