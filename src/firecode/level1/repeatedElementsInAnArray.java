package firecode.level1;

public class repeatedElementsInAnArray
{
    /*
       This is my solution for "Repeated Elements in an Array" on Firecode.
       It passes all tests.

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static String duplicate(int[] numbers)
    {
        HashSet<Integer> seenNums = new HashSet<>();
        ArrayList<Integer> duplicateNums = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++)
        {
            if(!seenNums.contains(numbers[i]))
            {
                seenNums.add(numbers[i]);
            }
            else
            {
                duplicateNums.add(numbers[i]);
            }
        }

        Collections.sort(duplicateNums);

        return duplicateNums.toString();
    }
}
