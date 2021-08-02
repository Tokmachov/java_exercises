## Java generics exercises<br/>
These are randome exersices i collect over different sources i do to practiсe generics in java<br/>
### ex_01<br/>
Write a generic method to find the maximal element in the range [begin, end) of a list<br/>
[ex_01](./ex_01/Solution.java)<br/>
### ex_02<br/>
//Generic method: exchange the positions of two different elements in an array.<br/>
[ex_01](./ex_02/Solution.java)<br/>
### ex_03<br/>
//Generic method: count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).<br/>
[ex_03](./ex_03/Solution.java)<br/>
### ex_04<br/>
//1 The method for swapping elements in an array does not use generics,<br/>
//please change the method so it returns an array of the same type as provided. Hint: look at Arrays::copyOf<br/>

2 Write a method that does the same thing, but for lists.<br/>
```java
class SwapUtil {
    public static Object[] swapElements(Object[] array, int firstIndex, int secondIndex) {
        Object[] copyOfArray = new Object[array.length];
        System.arraycopy(array, 0, copyOfArray, 0, array.length);

        copyOfArray[firstIndex] = array[secondIndex];
        copyOfArray[secondIndex] = array[firstIndex];

        return copyOfArray;
    }
}
```
[ex_03](./ex_04/Solution.java)<br/>
 
