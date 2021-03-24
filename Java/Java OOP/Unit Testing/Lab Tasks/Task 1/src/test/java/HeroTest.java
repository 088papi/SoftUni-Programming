import org.junit.Test;
import org.mockito.Mockito;
import rpg_lab.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class HeroTest {

    @Test
    public void testHeroGainsExperienceWhenTargetIsKilled(){

        Weapon weapon = mock(Weapon.class);


        Hero hero = new Hero("JavaWizard", weapon);
        Target target = mock(Target.class);

        when(target.isDead()).thenReturn(true);
        when(target.giveExperience()).thenReturn(13);

        hero.attack(target);
        assertEquals(13, hero.getExperience());
    }


}
