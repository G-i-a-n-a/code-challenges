package firecode.level1;

public class findTheFirstNonDuplicateCharacterInAString
{
    /*
       This is my solution for "Find the First Non Duplicate Character in a String" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(n)

       - Giana (Github: Giana - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static Character firstNonRepeatedCharacter(String str)
    {
        HashMap<Character, Integer> seenChars = new HashMap<>();

        for(int i = 0; i < str.length(); i++)
        {
            if(seenChars.containsKey(str.charAt(i)))
            {
                int count = seenChars.get(str.charAt(i));
                count++;
                seenChars.put(str.charAt(i), count);
            }
            else
            {
                seenChars.put(str.charAt(i), 1);
            }
        }

        for(int i = 0; i < str.length(); i++)
        {
            if(seenChars.get(str.charAt(i)) == 1)
            {
                return str.charAt(i);
            }
        }

        return null;
    }
}
