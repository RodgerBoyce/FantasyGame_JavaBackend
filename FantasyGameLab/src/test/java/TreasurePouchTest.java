import equipment.TreasurePouch;
import org.junit.Before;
import org.junit.Test;
import treasure.Treasure;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TreasurePouchTest {

    TreasurePouch treasurePouchCharacter;
    TreasurePouch treasurePouchEnemy;

    @Before
    public void before(){
        treasurePouchCharacter = new TreasurePouch();
        treasurePouchEnemy = new TreasurePouch();
    }
    @Test
    public void canAddTreasure(){
        treasurePouchCharacter.addTreasure(Treasure.RUBY, 5);
        assertEquals(5, treasurePouchCharacter.getTreasureCount(Treasure.RUBY));
    }
    @Test
    public void canAddMultipleTreasures(){
        treasurePouchCharacter.addTreasure(Treasure.RUBY, 5);
        treasurePouchCharacter.addTreasure(Treasure.GOLDCOIN, 15);
        treasurePouchCharacter.addTreasure(Treasure.RUBY, 2);
        assertEquals(7, treasurePouchCharacter.getTreasureCount(Treasure.RUBY));
        assertEquals(15, treasurePouchCharacter.getTreasureCount(Treasure.GOLDCOIN));
    }

    @Test
    public void canCalculatePouchValue(){
        treasurePouchCharacter.addTreasure(Treasure.RUBY, 10);
        treasurePouchCharacter.addTreasure(Treasure.GOLDCOIN, 15);
        treasurePouchCharacter.addTreasure(Treasure.DIAMONDS, 3);
        assertEquals(95, treasurePouchCharacter.getPouchValue());
    }

    @Test
    public void canAddTwoPouches(){
        treasurePouchCharacter.addTreasure(Treasure.RUBY, 10);
        treasurePouchCharacter.addTreasure(Treasure.GOLDCOIN, 15);
        treasurePouchEnemy.addTreasure(Treasure.GOLDCOIN, 100);
        treasurePouchEnemy.addTreasure(Treasure.DIAMONDS, 10);
        treasurePouchCharacter.combineTreasurePouches(treasurePouchEnemy);
        assertEquals(265, treasurePouchCharacter.getPouchValue());
        assertEquals(0, treasurePouchEnemy.getPouchValue());
    }
}
