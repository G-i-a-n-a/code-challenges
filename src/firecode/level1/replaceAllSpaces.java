package firecode.level1;

public class replaceAllSpaces
{
    /*
       This is my solution for "Replace all Spaces" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(n)

       - Giana (Github: Giana - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static String replace(String a, String b)
    {
        StringBuilder returnStr = new StringBuilder();

        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) == ' ')
            {
                returnStr.append(b);
            }
            else
            {
                returnStr.append(a.charAt(i));
            }
        }

        return returnStr.toString();
    }
}
