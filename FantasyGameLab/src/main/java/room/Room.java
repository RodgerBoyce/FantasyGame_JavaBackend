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

    public String fight(PlayableCharacter player1, PlayableCharacter player2){
        Boolean play1isGiver;
        PlayableCharacter winner;
        while (player1.getHealth() > 0 && player2.getHealth() > 0){
            if (play1isGiver){
                fightRound(player1, player2);
            } else {
                fightRound(player2, player1);
            }
        }
        if (player1.getHealth() == 0) {
            winner = player2;
        } else {
            winner = player1;
        }
        return "Character " + winner.getName() + " won!";
    }

    private void fightRound(PlayableCharacter giver, PlayableCharacter taker){
        int damageToBeInflicted = giver.giveDamage();
        taker.takeDamage(damageToBeInflicted);
    }

}
