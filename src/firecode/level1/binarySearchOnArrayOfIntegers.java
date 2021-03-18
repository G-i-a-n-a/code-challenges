package firecode.level1;

public class binarySearchOnArrayOfIntegers
{
    /*
       This is my solution for "Binary Search on Array of Integers" on Firecode.
       It passes all tests.

       Time complexity: O(log n)
       Space complexity: O(1)

       - Giana (Github: Giana - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static Boolean binarySearch(int[] arr, int n)
    {
        int ptr1 =  0;
        int ptr2 = arr.length - 1;

        while(ptr1 <= ptr2)
        {
            int mid = ((ptr2 - ptr1) / 2) + ptr1;

            if(n < arr[mid])
            {
                ptr2 = mid - 1;
            }
            else if(n > arr[mid])
            {
                ptr1 = mid + 1;
            }
            else
            {
                return true;
            }
        }

        return false;
    }
}
