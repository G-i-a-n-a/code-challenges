package firecode.level2;

public class isThisIntegerAPalindrome
{
    /*
       This is my solution for "Is this Integer a Palindrome?" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(1)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static Boolean isIntPalindrome(int x)
    {
        int lastDigit = 0;
        int reversedInt = 0;
        int original = x;

        if(x == 0)
        {
            return true;
        }

        if(x % 10 == 0 || x < 0)
        {
            return false;
        }

        while(x != 0)
        {
            lastDigit = x % 10;
            x /= 10;

            reversedInt = (reversedInt * 10) + lastDigit;
        }

        return original == reversedInt;
    }
}
