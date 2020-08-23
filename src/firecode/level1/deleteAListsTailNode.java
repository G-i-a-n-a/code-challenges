package firecode.level1;

public class deleteAListsTailNode
{
    /*
       This is my solution for "Delete a List's Tail Node" on Firecode.
       It passes all tests.

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public ListNode deleteAtTail(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        // Case: null linked list or only one element
        if(curr == null || curr.next == null)
        {
            return null;
        }

        while(curr.next != null)
        {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;

        return head;
    }
}
