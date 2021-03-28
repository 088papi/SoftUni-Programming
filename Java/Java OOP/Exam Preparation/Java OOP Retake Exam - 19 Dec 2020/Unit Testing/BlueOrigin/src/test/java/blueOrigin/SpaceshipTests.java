package blueOrigin;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SpaceshipTests {

    private Spaceship spaceship;

    @Test
    public void testConstructorWithValidElements() {
        String name = "George";
        int capacity = 1;

        spaceship = new Spaceship(name, capacity);

        Assert.assertEquals(1, spaceship.getCapacity());
        Assert.assertEquals("George", spaceship.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullElement(){
        String name = null;
        int capacity = 1;

        spaceship = new Spaceship(null, capacity);
    }



    @Test(expected = NullPointerException.class)
    public void testConstructorWithEmptyElement(){
        String name = "";
        int capacity = 1;
        spaceship = new Spaceship(name,capacity);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCapacityBelowZero(){
        String name = "George";
        int capacity = -2;

        spaceship = new Spaceship(name,capacity);
    }

    @Test
    public void testAddWithValidParameters(){
        String name = "George";
        int capacity = 2;

        spaceship = new Spaceship(name,capacity);
        Astronaut astronaut = new Astronaut("Sara", 13.0);
        spaceship.add(astronaut);

        Assert.assertEquals(1, spaceship.getCount());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAddWithWhenCapacityIsFull(){
        String name = "George";
        int capacity = 1;

        spaceship = new Spaceship(name,capacity);
        Astronaut astronaut = new Astronaut("Sara", 13.0);
        Astronaut astronaut2 = new Astronaut("Sara2", 13.0);
        spaceship.add(astronaut);
        spaceship.add(astronaut2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddWithWhenAstronautAlreadyExists(){
        String name = "George";
        int capacity = 3;

        spaceship = new Spaceship(name,capacity);
        Astronaut astronaut = new Astronaut("Sara", 13.0);
        Astronaut astronaut2 = new Astronaut("Sara", 8.0);
        spaceship.add(astronaut);
        spaceship.add(astronaut2);
    }

    @Test
    public void testRemoveWithWhenAstronautAlreadyExists(){

        String name = "George";
        int capacity = 3;

        spaceship = new Spaceship(name,capacity);
        Astronaut astronaut = new Astronaut("Sara", 13.0);
        Astronaut astronaut2 = new Astronaut("Sarah", 8.0);
        spaceship.add(astronaut);
        spaceship.add(astronaut2);

        boolean remove = spaceship.remove("Sara");
        Assert.assertTrue(remove);

    }



}
