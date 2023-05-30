package characters;

import equipment.TreasurePouch;


public abstract class PlayableCharacter {

    private String name;
    private int health;
    private TreasurePouch treasurePouch;
    public PlayableCharacter(String name, int health){
        this.name = name;
        this.health = health;
        this.treasurePouch = null;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void stealTreasure(PlayableCharacter victim){
        if(victim.treasurePouch.getPouchValue() > 0){
            this.treasurePouch.combineTreasurePouches(victim.treasurePouch);
        }
    }

}