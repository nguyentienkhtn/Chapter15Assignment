public class IsMemberChecking {
    /**
     The isMember method searches all or part of an
     array for value.
     @param array The array to be searched.
     @param value The value to search for.
     @param size The size of the part of the array
     being searched.
     @return If the value is found, the method returns true.
     Otherwise, it returns false.
     */

    public boolean isMember(int[] array, int value, int size)
    {
        if (size == 0)
            return false;
        else if (array[size - 1] == value)
            return true;
        else
            return isMember(array, value, size -1);
    }
}
