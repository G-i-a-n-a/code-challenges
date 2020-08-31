package firecode.level2;

public class mergeTwoSortedArrays
{
    /*
       This is my solution for "Merge Two Sorted Arrays" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(n)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static int[] merge(int[] arrLeft, int[] arrRight)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] resultArr = new int[arrLeft.length + arrRight.length];

        while(i < arrLeft.length && j < arrRight.length)
        {
            if(arrLeft[i] < arrRight[j])
            {
                resultArr[k++] = arrLeft[i++];
            }
            else
            {
                resultArr[k++] = arrRight[j++];
            }
        }

        while(i < arrLeft.length)
        {
            resultArr[k++] = arrLeft[i++];
        }

        while(j < arrRight.length)
        {
            resultArr[k++] = arrRight[j++];
        }

        return resultArr;
    }
}
