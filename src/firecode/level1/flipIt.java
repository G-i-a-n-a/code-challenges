package firecode.level1;

public class flipIt
{
    /*
       This is my solution for "Flip it!" on Firecode.
       It passes all tests.

       Time complexity: O(m * n)
       Space complexity: O(1)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */

    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static void flipItVerticalAxis(int[][] matrix)
    {
        int height = matrix.length;
        int width = matrix[0].length;

        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width / 2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][width - 1 - j];
                matrix[i][width - 1 - j] = temp;
            }
        }
    }
}
