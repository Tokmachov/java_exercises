import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//Write a generic method to find the maximal element in the range [begin, end) of a list

public class Solution {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Integer max = findMaximalElementInRange(elements, 0, elements.size() - 1);
        System.out.println("Max element is: " + max);
    }

    private static <T extends Comparable<T>> T findMaximalElementInRange(List<T> elements, int idxStart, int idxEnd) {
        if (idxStart <= 0 && idxStart > elements.size() - 1) {
            throw new IllegalArgumentException();
        }
        if (idxEnd <= 0 && idxEnd > elements.size() - 1) {
            throw new IllegalArgumentException();
        }
        if (idxStart > idxEnd) {
            throw new IllegalArgumentException();
        }
        T maxElement = elements.get(0);
        for (T element : elements) {
            if (element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }
        return maxElement;
    }
}