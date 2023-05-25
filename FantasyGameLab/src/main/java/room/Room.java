package room;

import behaviours.IFight;
import characters.Monster;
import characters.PlayableCharacter;
import equipment.TreasurePouch;
import treasure.Treasure;

import java.util.ArrayList;

public class Room{
    private String roomName;
    private ArrayList<PlayableCharacter> characters;
    private TreasurePouch treasureChest;
    private Monster monster;
    private Boolean completed;

    public Room(String name){
        this.roomName = name;
        this.characters = new ArrayList<>();
        this.treasureChest = new TreasurePouch();
        this.monster = null;
        this.completed = false;
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
    public Boolean getCompleted() {
        return completed;
    }
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
    public String getRoomName() {
        return roomName;
    }

    public ArrayList<PlayableCharacter> getCharacters() {
        return characters;
    }

    public String fight(PlayableCharacter player1, PlayableCharacter player2){
        int giverOfDamage;
        PlayableCharacter winner;
        if((player1 instanceof IFight) && (player2 instanceof IFight)) {
            while (player1.getHealth() > 0 && player2.getHealth() > 0) {
                giverOfDamage = (int) (Math.random() * 3); //choice of 1 or 2, so give 3
                System.out.printf("Player1 health %d : player2 health %d \n",
                        player1.getHealth(), player2.getHealth());
                if (giverOfDamage == 1) {
                    fightRound((IFight) player1, (IFight)player2);
                } else {
                    fightRound((IFight) player2, (IFight) player1);
                }
            }
            if (player1.getHealth() > 0) {
                winner = player1;
            } else {
                winner = player2;
            }
//            return "Character " + player1.getName() + " won!";
            return "Character " + winner.getName() + " won!";
        } else {
            return "One of these Characters can't fight! Try again!";
        }
    }

    private void fightRound(IFight giver, IFight taker){
        int damageToBeInflicted = giver.giveDamage();
        System.out.println("Pain inflicted: " + damageToBeInflicted);
        taker.takeDamage(damageToBeInflicted);
    }

    public void fillTreasureChest(){
        this.treasureChest.addTreasure(Treasure.RUBY, 5);
        this.treasureChest.addTreasure(Treasure.GOLDCOIN, 5);
        this.treasureChest.addTreasure(Treasure.DIAMONDS, 5);
    }

    public TreasurePouch getTreasureChest() {
        return treasureChest;
    }
}
