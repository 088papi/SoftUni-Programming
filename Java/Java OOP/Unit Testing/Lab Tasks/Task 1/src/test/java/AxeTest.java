import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

import static org.junit.Assert.*;

public class AxeTest {

    public static final int ATTACK = 10;
    public static final int DURABILITY = 100;

    private Axe axe;
    private Dummy dummy;

    @Before
    public void setUp(){
        this.axe = createAxe(ATTACK, DURABILITY);
        this.dummy = createDummy();
    }


    @Test
    public void testAxeConstructorShouldSetAttackAndDurability() {
        assertEquals(ATTACK, axe.getAttackPoints());
        assertEquals(DURABILITY, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAxeAttackShouldFailIfAxeHasZeroDurability() {
        Axe axe = new Axe(ATTACK, 0);
        axe.attack(dummy);
    }

    @Test
    public void testAxeLosesSingleDurabilityPointWhenAttackingADummy() {
        axe.attack(dummy);
        assertEquals(DURABILITY - 1, axe.getDurabilityPoints());
    }

    private Axe createAxe(int attack, int durability) {
        return new Axe(attack, durability);
    }
    private Dummy createDummy() {
        return new Dummy(100, 100);
    }
}
