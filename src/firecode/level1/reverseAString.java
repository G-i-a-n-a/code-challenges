package firecode.level1;

public class reverseAString
{
    /*
       This is my solution for "Reverse a string" on Firecode.
       It passes all tests.

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */
    
    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static String reverseString(String str)
    {
        StringBuilder reversed = new StringBuilder();

        if(str == null)
        {
            return null;
        }

        if(str.isEmpty() || str.length() == 1)
        {
            return str;
        }

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
