package firecode.level1;

public class deleteAListsHeadNode
{
    /*
       This is my solution for "Delete a List's Head Node" on Firecode.
       It passes all tests.

       Time complexity: O(1)
       Space complexity: O(1)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public ListNode deleteAtHead(ListNode head)
    {
        ListNode newHead;

        if(head == null)
        {
            return null;
        }
        else
        {
            newHead = head.next;
            head.next = null;
        }

        return newHead;
    }
}
