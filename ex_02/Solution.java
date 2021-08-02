import java.util.Arrays;
//Generic method: exchange the positions of two different elements in an array.
public class Solution {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        swapElements(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }
    private static <T> void swapElements(T[] arr, int idxSrc, int idxDst) {
        if (idxDst == idxSrc) {
            return ;
        }
        if (idxSrc < 0 || idxDst >= arr.length) {
            return ;
        }
        T tmp = arr[idxDst];
        arr[idxDst] = arr[idxSrc];
        arr[idxSrc] = tmp;
    }
}