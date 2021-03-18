package firecode.level2;

public class findTheSizeOfTheBinaryTree
{
    /*
       This is my solution for "Find the size of the Binary Tree" on Firecode.
       It passes all tests.

       Time complexity: O(n)
       Space complexity: O(n)

       - Giana (Github: Giana - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public int size(TreeNode root)
    {
        Stack<TreeNode> nodeStack = new Stack<>();
        int treeSize = 0;

        if(root == null)
        {
            return 0;
        }

        nodeStack.push(root);

        while(!nodeStack.isEmpty())
        {
            TreeNode currNode = nodeStack.pop();
            treeSize++;

            if(currNode.left != null)
            {
                nodeStack.push(currNode.left);
            }

            if(currNode.right != null)
            {
                nodeStack.push(currNode.right);
            }
        }

        return treeSize;
    }
}
