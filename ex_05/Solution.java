//In this exercise, your task is to implement copy method (it is present in Collections by the way)
// that's able to copy the items from a source list into a destination list. Use wildcards with the appropriate bounds!
//Hint: you have to copy the items from one of the lists into another list (so there are read and write operations accordingly).

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] av) {
        Integer[] ints = {1, 2, 3, 4, 5, 6, 7};
        List<Number> nums = new ArrayList<>();
        copyList(Arrays.asList(ints), nums);
        for (Number n : nums) {
            System.out.print(n + " ");
        }
    }
    public static <T> void copyList(List<? extends T> srcLst, List<? super T> dstLst) {
        dstLst.clear();
        for (T element : srcLst) {
            dstLst.add(element);
        }
    }
}
