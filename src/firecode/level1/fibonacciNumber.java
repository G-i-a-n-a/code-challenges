package firecode.level1;

public class fibonacciNumber
{
    /*
       This is my solution for "Fibonacci Number" on Firecode.
       It passes all tests.

       Time complexity: O(2^n)
       Space complexity: O(n)

       - Giana (Github: Giana - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static int fib(int n)
    {
        if(n <= 1)
        {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
