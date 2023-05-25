package GameLevel;

import characters.Monster;
import characters.PlayableCharacter;
import room.Room;
import treasure.Treasure;

import java.util.ArrayList;

public class GameLevel {

    private ArrayList<Room> rooms;
    private PlayableCharacter protagonist;


    public GameLevel(int roomCount){

        this.rooms = generateRooms(roomCount);
        this.protagonist = null;
    }

    private ArrayList<Room> generateRooms(int roomCount){
        ArrayList<Room> roomList = new ArrayList<>();
        for (int roomNo = 1; roomNo <= roomCount; roomNo++){
            Room room = new Room(String.format("Room %d", roomNo));
            room.fillTreasureChest();
            Monster monster = new Monster("Orc", 40, 10);
            monster.getTreasurePouch().addTreasure(Treasure.GOLDCOIN, 5);
            room.addMonster(monster);
            roomList.add(room);
        }
        return roomList;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public PlayableCharacter getProtagonist() {
        return protagonist;
    }

}
