
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Dummy;

import static org.junit.Assert.*;


public class DummyTest {
    private static final int HEALTH = 10;
    private static final int EXPERIENCE = 13;

    private Dummy aliveDummy;
    private Dummy deadDummy;

    @Before
    public void setUp(){
        this.aliveDummy = new Dummy(HEALTH, EXPERIENCE);
        this.deadDummy = new Dummy(0,EXPERIENCE);
    }
    @Test
    public void testDummyShouldLoseHealthWhenAttacked(){
        aliveDummy.takeAttack(3);
        assertEquals(HEALTH-3, aliveDummy.getHealth());
    }
    @Test(expected = IllegalStateException.class)
    public void testDeadDummyWhenAttacked(){
        deadDummy.takeAttack(3);
    }

    @Test
    public void testDeadDummyGivesExp(){

        int actualExp = deadDummy.giveExperience();
        assertEquals(EXPERIENCE, actualExp);
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyDoesNotGiveExp(){
        aliveDummy.giveExperience();
    }
}
