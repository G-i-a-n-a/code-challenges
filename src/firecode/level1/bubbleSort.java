package firecode.level1;

public class bubbleSort
{
    /*
       This is my solution for "Bubble Sort" on Firecode.
       It passes all tests.

       Time complexity: O(n^2)
       Space complexity: O(1)

       - Giana (Github: Giana - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static int[] bubbleSortArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
