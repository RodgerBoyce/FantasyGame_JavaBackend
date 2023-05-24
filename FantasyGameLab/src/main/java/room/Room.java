package room;

import characters.Monster;
import characters.PlayableCharacter;

import java.util.ArrayList;

public class Room{
    private String roomName;
    private ArrayList<PlayableCharacter> characters;
    private Monster monster;

    public Room(String name){
        this.roomName = name;
        this.characters = new ArrayList<>();
        this.monster = null;
    }

    public void addMonster(Monster monster){
        this.monster = monster;
    }

    public Monster getMonster() {
        return monster;
    }

    public void addCharacter(PlayableCharacter character){
        this.characters.add(character);
    }

    public String getRoomName() {
        return roomName;
    }

    public ArrayList<PlayableCharacter> getCharacters() {
        return characters;
    }
}
