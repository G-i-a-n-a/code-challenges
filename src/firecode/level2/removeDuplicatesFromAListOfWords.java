package firecode.level2;

public class removeDuplicatesFromAListOfWords
{
    /*
       This is my solution for "Remove Duplicates from a List of Words" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(n)

       - Giana (Github: Giana - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static ArrayList<String> removeDuplicates(List<String> input)
    {
        ArrayList<String> returnList = new ArrayList<>();
        HashSet<String> seenStrs = new HashSet<>();

        for(int i = 0; i < input.size(); i++)
        {
            if(!seenStrs.contains(input.get(i)))
            {
                seenStrs.add(input.get(i));
                returnList.add(input.get(i));
            }
        }

        Collections.sort(returnList);

        return returnList;
    }
}
