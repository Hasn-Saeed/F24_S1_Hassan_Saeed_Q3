import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void testSortIntegersAscending() {
        Integer[] input = {5, 3, 8, 6, 2};
        Integer[] expected = {2, 3, 5, 6, 8};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, "Sorting integers failed.");
    }

    @Test
    void testSortIntegersDescending() {
        Integer[] input = {5, 3, 8, 6, 2};
        Integer[] expected = {8, 6, 5, 3, 2}; // Adjust the QuickSort to reverse order after failing this test
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertNotEquals(result[0], expected[0], "Descending order should fail before fixing.");
    }

    @Test
    void testSortEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, "Sorting empty array failed.");
    }

    @Test
    void testSortSingleElement() {
        Integer[] input = {42};
        Integer[] expected = {42};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, "Sorting single element array failed.");
    }

    @Test
    void testSortStringsAscending() {
        String[] input = {"lmao", "lol", "looooooooool", "wtf", "wthbro"};
        String[] expected = {"lmao", "lol", "looooooooool", "wtf", "wthbro"};
        String[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, "Sorting strings failed.");
    }

    @Test
    void testSortAlreadySorted() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, "Sorting already sorted array failed.");
    }

    @Test
    void testSortWithDuplicates() {
        Integer[] input = {5, 3, 8, 3, 2};
        Integer[] expected = {2, 3, 3, 5, 8};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, "Sorting with duplicates failed.");
    }
}