package firecode.level1;

public class uniqueCharsInAString
{
    /*
       This is my solution for "Unique Chars in a String" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(n)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static boolean areAllCharactersUnique(String str)
    {
        HashSet<Character> seen = new HashSet<>();

        if(str == null || str.length() <= 1)
        {
            return true;
        }

        for(int i = 0; i < str.length(); i++)
        {
            if(!seen.contains(str.charAt(i)))
            {
                seen.add(str.charAt(i));
            }
            else
            {
                return false;
            }
        }

        return true;
    }
}
