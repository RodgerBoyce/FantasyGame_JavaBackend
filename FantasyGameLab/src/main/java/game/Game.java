package game;

import characters.MagicCharacter;
import characters.Monster;
import characters.NonMagicCharacter;
import characters.PlayableCharacter;
import enums.MagicNPC;
import enums.NonMagicNPC;
import enums.MonsterEnum;
import equipment.MythicalCreature;
import room.Room;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private ArrayList<Room> rooms = new ArrayList<>();
    private NonMagicCharacter protagonist;

    public Game(NonMagicCharacter protagonist, int roomCount) {
        for (int i = 0; i < roomCount; i++){
            Room room = new Room("Room " + i + 1);
            room.addMonster(generateMonster());
            generateCharacters(room);
            this.rooms.add(room);
        }
        this.protagonist = protagonist;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room getRoomByID(int roomNumber){
        return rooms.get(roomNumber);
    }
    public NonMagicCharacter getProtagonist() {
        return protagonist;
    }

    private void generateCharacters(Room room){
        ArrayList<PlayableCharacter> characterList = new ArrayList<>();
        int playerCount = generateRandom(2);
        PlayableCharacter characterInRoom;
        for (int i = 0; i < playerCount; i++){
            if (generateRandom(2) == 1) {
                characterInRoom = getRandomNonMagicCharacter();
            } else {
                characterInRoom = getRandomMagicCharacter();
            }
            room.addCharacter(characterInRoom);
        }
    }

    private int generateRandom(int max){
        return (int) (Math.random() * (max + 1));
    }

    private Monster generateMonster(){
        MonsterEnum monsterEnum =  MonsterEnum.values()[new Random().nextInt(MonsterEnum.values().length)];
        Monster monster = new Monster(monsterEnum.getName(),
                monsterEnum.getHealth(), monsterEnum.getDamageValue());
        return monster;
    }
    private NonMagicCharacter getRandomNonMagicCharacter(){
        NonMagicNPC nonMagicNPC = NonMagicNPC.values()[new Random().nextInt(NonMagicNPC.values().length)];
        NonMagicCharacter charToBuild;
        charToBuild = new NonMagicCharacter(nonMagicNPC.getName(),
                nonMagicNPC.getHealth(), nonMagicNPC.getWeapon());
        return charToBuild;
    }
    private MagicCharacter getRandomMagicCharacter(){
        MagicNPC magicNPC = MagicNPC.values()[new Random().nextInt(MagicNPC.values().length)];
        MagicCharacter charToBuild;
        MythicalCreature mythicalCreature = new MythicalCreature(
                magicNPC.getNameOfMC(), magicNPC.getCreatureType(), magicNPC.getDefensiveValOfMC());
        charToBuild = new MagicCharacter(magicNPC.getName(),
                magicNPC.getHealth(), magicNPC.getWeapon(), mythicalCreature);
        return charToBuild;
    }
}
