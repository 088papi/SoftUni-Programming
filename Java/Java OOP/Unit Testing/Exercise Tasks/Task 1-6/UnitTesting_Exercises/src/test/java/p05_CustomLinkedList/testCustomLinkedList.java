package p05_CustomLinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testCustomLinkedList {

    private CustomLinkedList customLinkedList;

    @Before
    public void setUp() {
        customLinkedList = new CustomLinkedList();
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_below0IsPassedToGet_then_exceptionIsThrown() {
        customLinkedList.get(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_aboveCountIsPassedToGet_then_exceptionIsThrown() {
        customLinkedList.get(1);
    }

    @Test
    public void when_correctIsPassedToGet() {
        customLinkedList.add(1);
        Assert.assertEquals(customLinkedList.get(0), 1);
    }

    @Test
    public void when_listIsNotEmpty_then_add() {
        customLinkedList = new CustomLinkedList();
        customLinkedList.add(1);
        customLinkedList.add(2);
        customLinkedList.add(3);
        Assert.assertEquals(customLinkedList.get(1), 2);
        Assert.assertEquals(customLinkedList.get(2), 3);
    }


    @Test(expected = IllegalArgumentException.class)
    public void when_indexToSetIsBelow0_then_exceptionIsThrown() {
        customLinkedList.set(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_indexToSetIsAboveOrEqualCount_then_exceptionIsThrown() {
        customLinkedList.set(1, 1);
    }

    @Test
    public void when_indexToSetIsValid() {

        customLinkedList.add(1);
        customLinkedList.set(0, 2);

        Assert.assertEquals(customLinkedList.get(0), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_indexBelow0IsPassedToRemoveAt_then_exceptionIsThrown() {
        customLinkedList.removeAt(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_indexAboveOrEqualCountIsPassedToRemoveAt_then_exceptionIsThrown() {
        customLinkedList.removeAt(0);
    }

    @Test
    public void when_validIndexIsPassedToRemoveAt() {
        int element1 = 1;
        int element2 = 2;
        customLinkedList.add(element1);
        customLinkedList.add(element2);
        int removed = (int) customLinkedList.removeAt(1);

        Assert.assertEquals(customLinkedList.get(0), element1);
        Assert.assertEquals(removed, element2);
    }

    @Test
    public void when_validElementIsPassedToRemove(){
        int element1 = 1;
        int element2 = 2;
        customLinkedList.add(element1);
        customLinkedList.add(element2);

        int removedIndex = customLinkedList.remove(element2);

        Assert.assertEquals(1,removedIndex);
        Assert.assertEquals(customLinkedList.get(0),element1);
    }

    @Test
    public void when_invalidElementIsPassedToRemove(){
        int element1 = 1;
        int element2 = 2;
        customLinkedList.add(element1);

        int removedIndex = customLinkedList.remove(2);
        Assert.assertEquals(-1, removedIndex);
    }


    @Test
    public void when_validElementIsPassedToContains(){
        int element = 1;
        customLinkedList.add(element);
        boolean contains = customLinkedList.contains(1);

        Assert.assertTrue(contains);

    }

    @Test
    public void when_invalidElementIsPassedToContains(){
        int element = 1;
        customLinkedList.add(element);
        boolean contains = customLinkedList.contains(2);

        Assert.assertFalse(contains);

    }


}
