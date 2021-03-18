package codesignal;

import java.util.HashSet;

public class sudoku2
{
    /*
    This is my solution for "sudoku2" on CodeSignal.
    It passes all tests, as well as hidden tests.

    - Giana (Github: Giana - Website: Giana.dev)
    */

    int length = 9;   // Known length of rows/columns

    //  Checks a given row
    boolean checkRow(char[][] grid, int row)
    {
        HashSet<Character> vals = new HashSet<>();   // Holds seen chars (which aren't '.')

        // Iterate for length of row
        for(int i = 0; i < length; i++)
        {
            // vals contains value; not a valid row
            if(vals.contains(grid[i][row]))
            {
                return false;
            }
            // Value isn't a '.'
            else if(grid[i][row] != '.')
            {
                vals.add(grid[i][row]);   // Add value to vals (to say it's been seen)
            }
        }

        // Valid row
        return true;
    }

    // Checks a given column
    boolean checkColumn(char[][] grid, int column)
    {
        HashSet<Character> vals = new HashSet<>();   // Holds seen chars (which aren't '.')

        // Iterate for length of column
        for(int i = 0; i < length; i++)
        {
            // vals contains value; not a valid column
            if(vals.contains(grid[column][i]))
            {
                return false;
            }
            // Value isn't a '.'
            else if(grid[column][i] != '.')
            {
                vals.add(grid[column][i]);   // Add value to vals (to say it's been seen)
            }
        }

        // Valid column
        return true;
    }

    // Checks a given subgrid
    boolean checkSubgrid(char[][] grid, int x, int y)
    {
        HashSet<Character> vals = new HashSet<>();   // Holds seen chars (which aren't '.')

        int subLength = 3;   // Known length of subgrid

        // Iterate for height of subgrid
        for(int i = x; i < x + subLength; i++)
        {
            // Iterate for width of subgrid
            for(int j = y; j < y + subLength; j++)
            {
                // vals contains value; not a valid subgrid
                if(vals.contains(grid[i][j]))
                {
                    return false;
                }
                // Value isn't a '.'
                else if(grid[i][j] != '.')
                {
                    vals.add(grid[i][j]);   // Add value to vals (to say it's been seen)
                }
            }
        }

        // Valid subgrid
        return true;
    }

    boolean sudoku2Answer(char[][] grid)
    {
        // Iterate for length of rows/columns
        for(int i = 0; i < length; i++)
        {
            // Not a valid row or column; so not a valid puzzle
            if(!checkRow(grid, i) || !checkColumn(grid, i))
            {
                return false;
            }
        }

        // Iterate for height of subgrid
        for(int i = 0; i < length; i += 3)
        {
            // Iterate for width of subgrid
            for(int j = 0; j < length; j += 3)
            {
                // Not a valid subgrid; so not a valid puzzle
                if(!checkSubgrid(grid, i, j))
                {
                    return false;
                }
            }
        }

        // Valid puzzle
        return true;
    }
}
