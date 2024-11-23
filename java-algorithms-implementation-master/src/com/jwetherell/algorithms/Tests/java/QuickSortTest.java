import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void testRandomIntegers() { // Test random order of numbers, expected ascending order
        Integer[] input = {5, 3, 8, 6, 2};
        Integer[] expected = {2, 3, 5, 6, 8};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testOneMistake(){ // One mistake in order
        Integer[] input = {1, 2, 4, 3, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testAlphabets(){ // Test alphabets
        String[] input = {"A", "C", "D", "E", "B"};
        String[] expected = {"A", "B", "C", "D", "E"};
        String[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testEmptyArray() { // Test case 1 - empty array
        Integer[] input = {};
        Integer[] expected = {};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testSingleElement() { // Test case 2 - single element array
        Integer[] input = {42};
        Integer[] expected = {42};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testAlreadySorted() { // Should pass test
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testWithDuplicates() { // All integers with same value
        Integer[] input = {2, 2, 2, 2, 2};
        Integer[] expected = {2, 2, 2, 2, 2};
        com.jwetherell.algorithms.sorts.QuickSort.resetSwapCount(); // Check if swapping is happening
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, Arrays.toString(result));
        assertEquals(0, com.jwetherell.algorithms.sorts.QuickSort.getSwapCount());
    }

    @Test
    void testWithNegativeNumbers() { // Negative integer test in worst possible order
        Integer[] input = {-1, -2, -3, -4, -5};
        Integer[] expected = {-5, -4, -3, -2, -1}; // Ascending order
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testSingleNegativeNumber() { // Test with single negative
        Integer[] input = {1, 2, 3, 4, -5};
        Integer[] expected = {-5, 1, 2, 3, 4};
        Integer[] result = com.jwetherell.algorithms.sorts.QuickSort.sort(com.jwetherell.algorithms.sorts.QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }
}