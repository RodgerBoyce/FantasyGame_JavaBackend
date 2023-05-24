import characters.NonMagicCharacter;
import equipment.Equipment;
import org.junit.Before;
import org.junit.Test;
import treasure.Treasure;

import static org.junit.Assert.assertEquals;

public class NonMagicTest {

    private NonMagicCharacter nonMagicCharacter;
    @Before
    public void before(){
        nonMagicCharacter = new NonMagicCharacter("Arthur", 50, Equipment.SWORD);

    }
    @Test
    public void charHasNameAndHealth(){
        assertEquals("Arthur", nonMagicCharacter.getName());
        assertEquals(50, nonMagicCharacter.getHealth());
    }

    @Test
    public void canBeDamaged(){
        nonMagicCharacter.takeDamage(10);
        assertEquals(40, nonMagicCharacter.getHealth());
    }

    @Test
    public void canAddTreasure(){
        nonMagicCharacter.addTreasure(Treasure.RUBY, 5);
        assertEquals(5, nonMagicCharacter.getTreasureAmount(Treasure.RUBY));
    }
    @Test
    public void canAddMultipleTreasures(){
        nonMagicCharacter.addTreasure(Treasure.RUBY, 5);
        nonMagicCharacter.addTreasure(Treasure.GOLDCOIN, 15);
        nonMagicCharacter.addTreasure(Treasure.RUBY, 2);
        assertEquals(7, nonMagicCharacter.getTreasureAmount(Treasure.RUBY));
        assertEquals(15, nonMagicCharacter.getTreasureAmount(Treasure.GOLDCOIN));
    }
}
