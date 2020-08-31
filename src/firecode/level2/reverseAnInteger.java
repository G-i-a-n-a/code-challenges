package firecode.level2;

public class reverseAnInteger
{
    /*
       This is my solution for "Reverse an Integer" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(1)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static int reverseInt(int x)
    {
        int finalDigit = 0;
        int reversedNum = 0;

        while(x != 0)
        {
            finalDigit = x % 10;
            x /= 10;

            reversedNum = (reversedNum * 10) + finalDigit;
        }

        return reversedNum;
    }
}
