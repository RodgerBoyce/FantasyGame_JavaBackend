import characters.CreatureType;
import characters.MagicCharacter;
import equipment.Equipment;
import equipment.MythicalCreature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MagicCharTest {
    private MagicCharacter magicCharacter;
    private MythicalCreature mythicalCreature;
    @Before
    public void before(){
        mythicalCreature = new MythicalCreature("Happy", CreatureType.DRAGON, 5);
        magicCharacter = new MagicCharacter("Wenjing", 50, Equipment.FIRESPELL, mythicalCreature);

    }
    @Test
    public void charHasNameAndHealthAndCreature(){
        assertEquals("Wenjing", magicCharacter.getName());
        assertEquals(50, magicCharacter.getHealth());
        assertEquals("Happy", magicCharacter.getMythicalCreature().getName());
    }

    @Test
    public void canSwapEquipment(){
        assertEquals(10, magicCharacter.getEquipment().getHealthImpact());
        magicCharacter.switchEquipment(Equipment.LIGHTNINGSPELL);
        assertEquals(5, magicCharacter.getEquipment().getHealthImpact());
        }

    @Test
    public void canBeDamaged(){
        magicCharacter.takeDamage(10);
        assertEquals(45, magicCharacter.getHealth());
    }
    }
