import characters.Monster;
import characters.NonMagicCharacter;
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
    }
    @Test
    public void canAddMonster(){
        room.addMonster(monster);
        Monster tempMonster = room.getMonster();
        assertEquals("Gerisaurus", tempMonster.getName());
    }

}
