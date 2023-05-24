import characters.Monster;
import characters.NonMagicCharacter;
import equipment.Equipment;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {

    private Monster orc;

    @Before
    public void before(){
        orc = new Monster("Orc", 20, 5);
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(5);
        assertEquals(15, orc.getHealth());
    }

    @Test
    public void canGiveDamage(){
        assertEquals(5, orc.giveDamage());
    }
}
