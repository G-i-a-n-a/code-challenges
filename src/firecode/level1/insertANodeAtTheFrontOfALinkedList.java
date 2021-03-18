package firecode.level1;

public class insertANodeAtTheFrontOfALinkedList
{
    /*
       This is my solution for "Insert a Node at the Front of a Linked List" on Firecode.
       It passes all tests.

       Time complexity: O(1)
       Space complexity: O(1)

       - Giana (Github: Giana - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public ListNode insertAtHead(ListNode head, int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = head;

        return newNode;
    }
}
