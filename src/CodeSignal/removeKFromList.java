package CodeSignal;

public class removeKFromList
{
    /*
    This is my solution for "removeKFromList" on CodeSignal.
    It passes all tests, as well as hidden tests.

    - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // Singly-linked lists are already defined with this interface:
    // class ListNode<T> {
    //   ListNode(T x) {
    //     value = x;
    //   }
    //   T value;
    //   ListNode<T> next;
    // }
    //

    ListNode<Integer> removeKFromListAnswer(ListNode<Integer> l, int k)
    {
        ListNode<Integer> tempHead = new ListNode<>(null);   // Holds a new temporary head
        tempHead.next = l;                                   // Assign the new temporary head

        ListNode<Integer> pred = tempHead;                   // Predecessor to current node
        ListNode<Integer> curr = l;                          // Current node

        // While current node isn't null
        while(curr != null)
        {
            // Current node is to be deleted
            if(curr.value == k)
            {
                pred.next = curr.next;   // Cut off curr

                curr = curr.next;        // Reassign curr
            }
            // Current node isn't to be deleted
            else
            {
                // Reassign roles
                pred = curr;
                curr = curr.next;
            }
        }

        // Return the actual head
        return tempHead.next;
    }
}
