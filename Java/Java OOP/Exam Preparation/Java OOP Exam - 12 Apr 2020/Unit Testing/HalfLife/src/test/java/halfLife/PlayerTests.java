package halfLife;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTests {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Player

    @Test
    public void testCtor() {
        Player player = new Player("Pesho", 100);
        Assert.assertEquals("Pesho", player.getUsername());
        Assert.assertEquals(100, player.getHealth());
    }

    @Test(expected = NullPointerException.class)
    public void testCtorWithNullParameters() {
        String name = null;
        int health = 100;
        Player player = new Player(name, health);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testCtorWithInvalidParameters() {
        String name = "Pesho";
        int health = -12;
        Player player = new Player(name, health);
    }

    @Test
    public void testRemoveGun() {
        Player player = new Player("Pesho", 100);
        Gun gun = new Gun("Riffle", 100);
        player.addGun(gun);

        boolean removed = player.removeGun(gun);
        Assert.assertTrue(removed);
    }

    @Test(expected = NullPointerException.class)
    public void testAddGunWhenGunIsNull() {
        Player player = new Player("Pesho", 100);
        Gun gun = null;
        player.addGun(null);

    }

    @Test
    public void testAddGun() {
        Player player = new Player("Pesho", 100);
        Gun gun = new Gun("Riffle", 100);
        player.addGun(gun);

        Assert.assertEquals(1, player.getGuns().size());


    }

    @Test(expected = IllegalStateException.class)
    public void testTakeDamageWhenHealthIs0(){
        Player player = new Player("Pesho", 0);
        player.takeDamage(10);
    }

    @Test
    public void testTakeDamage(){
        Player player = new Player("Pesho", 100);
        player.takeDamage(10);

        Assert.assertEquals(90, player.getHealth());
    }

    @Test
    public void testGetGun(){
        Player player = new Player("Pesho", 0);
       Gun gun = new Gun("Riffle", 100);
       player.addGun(gun);

       Gun gun1 = player.getGun("Riffle");

       Assert.assertEquals("Riffle",gun1.getName());
    }
}
