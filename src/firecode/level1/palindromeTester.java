package firecode.level1;

public class palindromeTester
{
    /*
       This is my solution for "Palindrome Tester" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(1)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static boolean isStringPalindrome(String str)
    {
        int ptr1 = 0;
        int ptr2 = 0;

        if(str == null || str.length() <= 1)
        {
            return true;
        }

        ptr2 = str.length() - 1;

        while(ptr1 < ptr2)
        {
            if(str.charAt(ptr1++) != str.charAt(ptr2--))
            {
                return false;
            }
        }

        return true;
    }
}
