package firecode.level1;

public class findTheMiddleOfAListInASinglePass
{
    /*
       This is my solution for "Find the Middle of a List in a Single Pass" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(1)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public ListNode findMiddleNode(ListNode head)
    {
        int fastPos = 0;
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null)
        {
            if(fastPos >= 2 && fastPos % 2 == 0)
            {
                slowPtr = slowPtr.next;
            }

            fastPtr = fastPtr.next;
            fastPos++;
        }

        return slowPtr;
    }
}
