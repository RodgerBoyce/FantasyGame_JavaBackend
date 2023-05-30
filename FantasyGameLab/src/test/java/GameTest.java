import characters.MagicCharacter;
import characters.NonMagicCharacter;
import characters.PlayableCharacter;
import enums.MagicNPC;
import equipment.Equipment;
import game.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private NonMagicCharacter protagonist;

    @Before
    public void before(){
        protagonist = new NonMagicCharacter("Claire", 100, Equipment.AXE);
        game = new Game(protagonist, 3);
    }

    @Test
    public void canCreateMultipleRooms(){
        assertEquals(3, game.getRooms().size());
    }

    @Test
    public void canGetRoomName(){
        assertEquals("Room 01", game.getRoomByID(0).getRoomName());
    }

    @Test
    public void canGetDifferentMonsters(){
        System.out.println(game.getRoomByID(0).getMonster().getName());
        System.out.println(game.getRoomByID(1).getMonster().getName());
        System.out.println(game.getRoomByID(2).getMonster().getName());
    }
    @Test
    public void canGetDifferentCharacters(){
        int charCount = game.getRoomByID(0).getCharacters().size();
        System.out.println(game.getRoomByID(0).getCharacterByID(charCount-1).getName());
        charCount = game.getRoomByID(1).getCharacters().size();
//        System.out.println(game.getRoomByID(1).getCharacters().size());
        System.out.println(game.getRoomByID(1).getCharacterByID(charCount-1).getName());
        System.out.println(game.getRoomByID(2).getCharacters().size());
        PlayableCharacter room2Char0 = game.getRoomByID(2).getCharacterByID(0);
        if (room2Char0 instanceof NonMagicCharacter){
            NonMagicCharacter NMC = (NonMagicCharacter) room2Char0;
            System.out.println(NMC.getName() + " has a "
                    + NMC.getEquipment());
        } else {
            MagicCharacter MC = (MagicCharacter) room2Char0;
            System.out.println(MC.getName() + " has a " +
                    MC.getEquipment());
        }
    }



}
