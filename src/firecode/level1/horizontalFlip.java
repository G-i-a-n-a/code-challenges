package firecode.level1;

public class horizontalFlip
{
    /*
       This is my solution for "Horizontal Flip" on Firecode.
       It passes all tests.

       Time complexity: O(m * n)
       Space complexity: O(1)

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
    */
    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static void flipHorizontalAxis(int[][] matrix)
    {
        int height = matrix.length;
        int width = matrix[0].length;

        for(int i = 0; i < height / 2; i++)
        {
            for(int j = 0; j < width; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i + height - 1][j];
                matrix[i + height - 1][j] = temp;
            }
        }
    }
}
