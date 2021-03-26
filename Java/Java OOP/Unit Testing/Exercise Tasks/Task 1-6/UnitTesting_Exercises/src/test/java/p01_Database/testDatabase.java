package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.naming.OperationNotSupportedException;


public class testDatabase {
    private static final Integer[] ELEMENTS = new Integer[]{4, 6, 19, 32, 5};
    private Database database;


    @Before
    public void setUpDatabase() throws OperationNotSupportedException {
        database = new Database(ELEMENTS);

    }

    @Test
    public void when_correctElementsArePassed_then_createDatabaseInstance() throws OperationNotSupportedException {
        Assertions.assertEquals(ELEMENTS.length, database.getElements().length);
        Assertions.assertArrayEquals(ELEMENTS, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_elementsPassedToTheConstructorAreMoreThan16_then_exceptionIsThrown() throws OperationNotSupportedException {
        Database database = new Database(new Integer[17]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_elementsPassedToConstrAreLessThan1_then_exceptionIsThrown() throws OperationNotSupportedException {
        new Database();
    }

    @Test
    public void when_validElementIsPassedToAdd_then_isAdded() throws OperationNotSupportedException {
        int element = 15;
        database.add(element);

        Assertions.assertEquals(ELEMENTS.length + 1, database.getElements().length);
        Assert.assertEquals(Integer.valueOf(element), database.getElements()[database.getElements().length - 1]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_invalidElementPassedToAdd_then_exceptionIsThrown() throws OperationNotSupportedException {

        database.add(null);
    }


     @Test
     public void when_remove_then_lastElementIsRemoved() throws OperationNotSupportedException {
        database.remove();
        Assert.assertEquals(ELEMENTS.length-1, database.getElements().length);
        Assert.assertEquals(ELEMENTS[ELEMENTS.length-2] , database.getElements()[database.getElements().length-1]);

     }


    @Test(expected = OperationNotSupportedException.class)
    public void when_elementsIsEmptyAndRemove_then_ExceptionIsThrown() throws OperationNotSupportedException {
        database = new Database(new Integer[1]);
        database.remove();
        database.remove();
    }


}
