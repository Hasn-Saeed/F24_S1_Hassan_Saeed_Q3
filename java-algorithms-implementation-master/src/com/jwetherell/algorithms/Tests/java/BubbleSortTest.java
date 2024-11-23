import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class BubbleSortTest {

    @Test
    void testSortRegularCase() {
        Integer[] input = {5, 2, 9, 1, 5, 6};
        Integer[] expected = {1, 2, 5, 5, 6, 9}; // Ascending order
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testSortOneMistake() {
        Integer[] input = {1, 3, 2, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5}; // Ascending order
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testSortStrings() {
        String[] input = {"lol", "lmao", "looooooooool", "wtf", "wthbro"};
        String[] expected = {"lmao", "lol", "looooooooool", "wtf", "wthbro"}; // Ascending order
        String[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testSortSingleElement() {
        Integer[] input = {42};
        Integer[] expected = {42};
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testSortEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }

    @Test
    void testSortWithNegativeNumbers() {
        Integer[] input = {-1, -3, -2, -5, -4};
        Integer[] expected = {-5, -4, -3, -2, -1}; // Ascending order
        Integer[] result = com.jwetherell.algorithms.sorts.BubbleSort.sort(input);
        assertArrayEquals(expected, result, Arrays.toString(result));
    }
}