import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class BubbleSortTest {

    @Test
    void testRandomIntegers() { //1, 2, 5, 5, 6, 9 sent to bubblesort, expected ascending order
        Integer[] input = {5, 2, 9, 1, 5, 6};
        Integer[] expected = {1, 2, 5, 5, 6, 9}; // Ascending order
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testOneMistake() { // One mistake in input array
        Integer[] input = {1, 3, 2, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5}; // Ascending order
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testAlphabets() { // Sent alphabets for this test
        String[] input = {"A", "E", "D", "B", "C"};
        String[] expected = {"A", "B", "C", "D", "E"}; // Ascending order
        String[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testSingleElement() { // Single integer test, this should pass. Test case - ensuring the testing is working
        Integer[] input = {42};
        Integer[] expected = {42};
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testEmptyArray() { // Empty array, this should also pass.
        Integer[] input = {};
        Integer[] expected = {};
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testAlreadySorted() { // Should pass test
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testWithNegativeNumbers() { // Negative integer test
        Integer[] input = {-1, -3, -2, -5, -4};
        Integer[] expected = {-5, -4, -3, -2, -1}; // Ascending order
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testWithDuplicates() { // All integers with same value - edge case
        Integer[] input = {2, 2, 2, 2, 2};
        Integer[] expected = {2, 2, 2, 2, 2};
        com.jwetherell.algorithms.sorts.BubbleSort.resetSwapCount(); // Check if swapping is happening
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertEquals(0, com.jwetherell.algorithms.sorts.BubbleSort.getSwapCount());
    }
}