package p03_IteratorTest;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class testListIterator {


    @Test (expected = OperationNotSupportedException.class)
    public void when_nullIsPassedToConstructor_then_exceptionIsThrown() throws OperationNotSupportedException {
      new ListIterator(null);
    }


    @Test
    public void when_validElementsArePassedToCtor_then_moveReturnsCorrectBoolean() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("where", "when", "how");
    Assert.assertTrue(listIterator.move());
    Assert.assertTrue(listIterator.move());
    Assert.assertFalse(listIterator.move());
    }

    @Test
    public void testHasNext() throws OperationNotSupportedException {
// същото като горния обаче вместо мове викаш хеснекст
        ListIterator listIterator = new ListIterator("where", "when", "how");
        Assert.assertTrue(listIterator.hasNext());
        Assert.assertTrue(listIterator.hasNext());

    }




    @Test(expected = IllegalStateException.class)
    public void when_empty_then_exceptionIsThrown() throws OperationNotSupportedException {
        new ListIterator().print();
    }

    @Test
    public void when_notEmpty_then_print() throws OperationNotSupportedException {

        String[] elements = new String[]{"where", "when", "how"};
        ListIterator listIterator = new ListIterator(elements);
        for (int i = 0;listIterator.hasNext();listIterator.move(), i++){
            Assert.assertEquals(elements[i] ,listIterator.print());
        }
    }

}
