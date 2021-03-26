package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;

public class testExtendedDatabase {

    private static final Person[] PEOPLE = new Person[]{
            new Person(1, "A"),
            new Person(2, "B"),
            new Person(3, "C"),


    };
    private p02_ExtendedDatabase.Database database;


    @Before
    public void setUpDatabase() throws OperationNotSupportedException {
        database = new Database(PEOPLE);

    }


    @Test
    public void when_correctElementsArePassed_then_createDatabaseInstance() throws OperationNotSupportedException {
        assertEquals(PEOPLE.length, database.getElements().length);
        Assert.assertArrayEquals(PEOPLE, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_elementsPassedToTheConstructorAreMoreThan16_then_exceptionIsThrown() throws OperationNotSupportedException {
        new Database(new Person[17]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_elementsPassedToConstrAreLessThan1_then_exceptionIsThrown() throws OperationNotSupportedException {
        new Database();
    }


    @Test
    public void when_validElementIsPassedToAdd_then_isAdded() throws OperationNotSupportedException {
    Person expected = new Person(4, "D");
    database.add(expected);
    Person[] databaseElements = database.getElements();;

        assertEquals(PEOPLE.length + 1, database.getElements().length);
        Person actualPerson = databaseElements[databaseElements.length-1];
        assertEquals(expected.getId(),actualPerson.getId());
        assertEquals(expected.getUsername(), actualPerson.getUsername());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_invalidElementPassedToAdd_then_exceptionIsThrown() throws OperationNotSupportedException {
        database.add(null);
    }

    // remove трябва да си донаправиш
    @Test
    public void when_remove_then_lastElementIsRemoved() throws OperationNotSupportedException {
        database.remove();
        Person[] databaseElements = database.getElements();
        assertEquals(PEOPLE.length-1, databaseElements.length);
        Person expected = PEOPLE[PEOPLE.length-2];
        Person actual = databaseElements[databaseElements.length-1];

        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getUsername(), actual.getUsername());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_elementsIsEmptyAndRemove_then_ExceptionIsThrown() throws OperationNotSupportedException {
        database = new Database(new Person(4, "G"));
        database.remove();
        database.remove();

    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_usernameNullPassedToFindByUsername_then_exceptionIsThrown() throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    @Test
    public void when_validUsernamePassedToFindByUsername_then_returnPerson() throws OperationNotSupportedException {
        Person actual = database.findByUsername("B");

        assertEquals(PEOPLE[1].getId(),actual.getId() );
        assertEquals(PEOPLE[1].getUsername(), actual.getUsername());

    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_findByUsernameOnEmptyArr_then_exceptionIsThrown() throws OperationNotSupportedException {
        database.remove();
        database.remove();
        database.remove();
        database.findByUsername("A");
    }


    @Test(expected = OperationNotSupportedException.class)
    public void when_findPersonByIdOnEmptyArr_then_exceptionIsThrown() throws OperationNotSupportedException {
        database.remove();
        database.remove();
        database.remove();
        database.findById(2);
    }

    @Test
    public void when_validIdIsPassed_then_returnPerson() throws OperationNotSupportedException {
        Person actual = database.findById(2);
        assertEquals(PEOPLE[1].getId(), actual.getId());
        assertEquals(PEOPLE[1].getUsername(), actual.getUsername());

    }
}
