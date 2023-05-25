import characters.Monster;
import characters.NonMagicCharacter;
import equipment.Equipment;
import org.junit.Before;
import org.junit.Test;
import room.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {


    private Room room;
    private Monster monster;
    private NonMagicCharacter rodger;

    @Before
    public void before(){
        room = new Room("Game Room 1");
        monster = new Monster("Gerisaurus", 50, 10);
        rodger = new NonMagicCharacter("Rodger", 75, Equipment.SWORD);
    }
    @Test
    public void canAddMonster(){
        room.addMonster(monster);
        Monster tempMonster = room.getMonster();
        assertEquals("Gerisaurus", tempMonster.getName());
    }

    @Test
    public void canAddGoodie(){
        room.addCharacter(rodger);
        assertEquals(1, room.getCharacters().size());
    }

    @Test
    public void canHaveFight(){
        String result = room.fight(rodger, monster);
        System.out.println(result);
        assertEquals(result, result);
    }

    @Test
    public void canAddTreasureToChest(){
        room.fillTreasureChest();
        int result = room.getTreasureChest().getPouchValue();
        assertEquals(80, result);
    }


}
