import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
//Generic method: count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
public class Solution {
    public static void main(String[] args) {
        Integer[] elements = {1, 2, 3, 4, 5, 6};
        int count = countElement(Arrays.asList(elements), (Integer i) -> i.intValue() % 2 == 0);
        System.out.println("Count of even elements is: " + count);
    }
    private static <T> int countElement(Collection<T> elements, Predicate<T> predicate) {
        int count = 0;
        for (T element : elements) {
            if (predicate.test(element)) {
                count += 1;
            }
        }
        return count;
    }
}
