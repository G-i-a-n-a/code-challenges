package firecode.level1;

public class findTheMissingNumberInASetOfNumbersFrom1To10
{
    /*
       This is my solution for "Find the Missing Number in a Set of Numbers from 1 to 10" on Firecode.
       It passes all tests.

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static int findMissingNumber(int[] arr)
    {
        int n = arr.length + 1;
        int actual = 0;
        int expected = n * (n + 1) / 2;

        for(int i = 0; i < arr.length; i++)
        {
            actual += arr[i];
        }

        return expected - actual;
    }
}
