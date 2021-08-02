
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] av) {
        Integer[] arr = {1, 2, 3, 4};
        Integer[] arrSwapped = SwapUtil.swapElements(arr, 0, 3);
        System.out.println(Arrays.toString(arrSwapped));

        List<Integer> swappedList = SwapUtil.swapElementsInLists(Arrays.asList(arr), 0, 3);
        System.out.println(swappedList);
    }
}

//1 The method for swapping elements in an array does not use generics,
//please change the method so it returns an array of the same type as provided. Hint: look at Arrays::copyOf

//2 Write a method that does the same thing, but for lists.

//class SwapUtil {
//    public static Object[] swapElements(Object[] array, int firstIndex, int secondIndex) {
//        Object[] copyOfArray = new Object[array.length];
//        System.arraycopy(array, 0, copyOfArray, 0, array.length);
//
//        copyOfArray[firstIndex] = array[secondIndex];
//        copyOfArray[secondIndex] = array[firstIndex];
//
//        return copyOfArray;
//    }
//}

class SwapUtil {
    //Added generic parameter to method
    //Changed Object to generic parameter T in declaration
    public static <T> T[] swapElements(T[] array, int firstIndex, int secondIndex) {
        //because generics can not be instantiated with constructor, here we use Arrays::copyOf
        T[] copyOfArray = Arrays.copyOf(array, array.length);
        copyOfArray[firstIndex] = array[secondIndex];
        copyOfArray[secondIndex] = array[firstIndex];
        return copyOfArray;
    }
    public static <T> List<T> swapElementsInLists(List<T> lst, int firstIndex, int secondIndex) {
        List<T> copyOfList = new ArrayList<>(lst);
        copyOfList.set(firstIndex, lst.get(secondIndex));
        copyOfList.set(secondIndex, lst.get(firstIndex));
        return copyOfList;
    }
}