package CodeSignal;

public class isCryptSolution
{
    /*
       This is my solution for "isCryptSolution" on CodeSignal.
       It passes all tests, as well as hidden tests.

       - Giana (Github: G-i-a-n-a - Website: Giana.dev)
     */
    static boolean isCryptSolutionAnswer(String[] crypt, char[][] solution)
    {
        long a, b, c;                      // longs for equation (a + b = c)
        String[] catArr = new String[3];   // Holds Strings to hold ints during concatenation
        int[] beginArr = new int[3];       // Holds ints to mark beginning of each string in intArr
        int[] intArr = new int[42];        // Holds single digits translated from crypt
        int displacement = 0;              // Keeps track of where in intArr we are

        // Iterate for 3 strings
        for(int i = 0; i < 3; i++)
        {
            int count = 0;                                // # of deciphered chars
            char[] currString = crypt[i].toCharArray();   // Current string as char[]
            int toDecipher = currString.length;           // # of chars to decipher

            // While we haven't yet deciphered all chars
            while(count < toDecipher)
            {
                // Iterate for height of solution
                for(int j = 0; j < solution.length; j++)
                {
                    // Char in current spot in solution is char in current string
                    if(solution[j][0] == currString[count])
                    {
                        // Add solution int to intArr
                        int intVal = Character.getNumericValue(solution[j][1]);
                        intArr[count + displacement] = intVal;

                        // First deciphered
                        if(count == 0)
                        {
                            // Save where this int begins
                            beginArr[i] = count + displacement;

                            // There's a leading 0
                            if(toDecipher != 1 && intVal == 0)
                            {
                                return false;
                            }
                        }

                        // Deciphered one; increase count and start again
                        count++;
                        break;
                    }
                }
            }
            // Add to displacement to alter correct place in intArr
            displacement += toDecipher;
        }

        displacement = 0;   // Reset displacement

        // Iterate for 3 ints
        for(int i = 0; i < 3; i++)
        {
            int currLength = crypt[i].length();   // Current "int"'s length

            // Add first "int" to catArr (for proper concatenation in below for loop)
            catArr[i] = Integer.toString(intArr[displacement]);

            // Iterate for length of current "int" - 1
            for(int j = displacement + 1; j < displacement + currLength; j++)
            {
                catArr[i] += Integer.toString(intArr[j]);   // Concatenate
            }

            // Add to displacement to alter correct place in catArr
            displacement += currLength;
        }

        // Turn Strings into longs
        a = Long.parseLong(catArr[0]);
        b = Long.parseLong(catArr[1]);
        c = Long.parseLong(catArr[2]);

        // Check equation
        if((a + b == c))
        {
            return true;
        }

        return false;
    }
}