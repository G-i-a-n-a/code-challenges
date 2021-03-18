package firecode.level1;

public class insertANodeAtTheEndOfALinkedList
{
    /*
       This is my solution for "Insert a Node at the End of a Linked List" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(1)

       - Giana (Github: Giana - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public ListNode insertAtTail(ListNode head, int data)
    {
        ListNode currNode = head;
        ListNode newNode = new ListNode(data);
        newNode.next = null;

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            while(currNode.next != null)
            {
                currNode = currNode.next;
            }

            currNode.next = newNode;
        }

        return head;
    }
}
