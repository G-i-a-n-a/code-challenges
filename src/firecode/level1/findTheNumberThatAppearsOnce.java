package firecode.level1;

public class findTheNumberThatAppearsOnce
{
    /*
       This is my solution for "Find the Number that Appears Once" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(n)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static int singleNumber(int[] A)
    {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < A.length; i++)
        {
            if(!numMap.containsKey(A[i]))
            {
                numMap.put(A[i], 1);
            }
            else
            {
                int count = numMap.get(A[i]);
                count++;
                numMap.put(A[i], count);
            }
        }

        for(int i = 0; i < A.length; i++)
        {
            if(numMap.get(A[i]) == 1)
            {
                return A[i];
            }
        }

        return -1;
    }
}
