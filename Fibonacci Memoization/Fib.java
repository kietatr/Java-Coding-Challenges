import java.util.*;

public class Fib{
    static long fib(int n, HashMap<String, Long> memo)
    {
        String key = Integer.toString(n);
        if (memo.containsKey(key)) return memo.get(key);

        if (n <= 2) return 1;
        long value = fib(n - 1, memo) + fib(n - 2, memo);

        memo.put(key, value);
        return value;
    }

    static long fib(int n)
    {
        HashMap<String, Long> memo = new HashMap<>();
        return fib(n, memo);
    }

    ///////////////

    // Using bottom-up approach
    static long fib2(int n)
    {
        int[] F = new int[n+1];

        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= n; i++)
        {
            F[i] = F[i-1] + F[i-2];
        }
        return F[n];
    }

    public static void main(String[] args){
        System.out.println(fib(2)); // 1 
        System.out.println(fib(5)); // 5
        System.out.println(fib(7)); // 13
        System.out.println(fib(14)); // 377
        System.out.println(fib(30)); // 832040
        System.out.println(fib(50)); // 12586269025
        System.out.println(fib(80)); // 23416728348467685
    }  
}  