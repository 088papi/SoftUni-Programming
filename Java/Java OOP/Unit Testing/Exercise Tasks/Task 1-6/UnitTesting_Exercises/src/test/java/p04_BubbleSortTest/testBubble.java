package p04_BubbleSortTest;

import org.junit.Assert;
import org.junit.Test;

public class testBubble {
    @Test
    public void when_notSortedArraysIsPassed_then_arraySortedAsc() {
        int[] arr = new int[]{5, -2, 13, 20, -8, 2};
        Bubble.sort(arr);
        int[] expectedArray = new int[]{-8, -2, 2, 5, 13, 20};
        Assert.assertEquals(arr.length, expectedArray.length);
        Assert.assertArrayEquals(expectedArray, arr);
    }

    @Test
    public void when_sortedArrayIsPassed_then_returnSameArray(){
        int[] arr = new int[]{5, -2, 13, 20, -8, 2};
        Bubble.sort(arr);
        int[] expected = new int[]{5, -2, 13, 20, -8, 2};
        Assert.assertArrayEquals(arr, expected);
    }

    @Test
    public void when_emptyArrayIsPassed_then_returnEmptyArray(){
        int[] array = new int[]{};
        Bubble.sort(array);
        Assert.assertEquals(array.length, 0);
    }

}
