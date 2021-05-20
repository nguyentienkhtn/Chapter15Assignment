public class CharacterCounter {
    /**
     The charCount method counts the number of
     times a specified character appears in the
     portion of an array starting at a specified
     subscript.
     @param array The array being searched.
     @param start The starting subscript of the
     part of the array being searched.
     @param ch The character to search for.
     @return The number of times the character
     appears in the specified part of
     the array.
     */

    public int charCount(char[] array, int start, char ch)
    {
        int numChars = 0;

        if (start == (array.length))
            return 0;
        else
        {
            if (array[start] == ch)
                numChars = 1;
            return numChars + charCount(array, start + 1, ch);
        }
    }
}
