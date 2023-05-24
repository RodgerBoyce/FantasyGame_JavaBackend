package characters;

import treasure.Treasure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class PlayableCharacter {

    private String name;
    private int health;
    private HashMap<Treasure, Integer> treasurePouch;
    public PlayableCharacter(String name, int health){
        this.name = name;
        this.health = health;
        this.treasurePouch = new HashMap<>();
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

    public void addTreasure(Treasure treasure, int amount){
        Integer currValue;
        if(this.treasurePouch.containsKey(treasure)) {
            currValue = this.treasurePouch.get(treasure);
        } else {
            currValue = 0;
        }
        this.treasurePouch.put(treasure, currValue + amount);
    }
    public HashMap<Treasure, Integer> getTreasurePouch() {
        return treasurePouch;
    }
    public int getTreasureAmount(Treasure treasure){
        return this.treasurePouch.get(treasure);
    }

//    public int getPouchValue(){
//        int totalValue;
//        for (Set<Map.Entry<Treasure, Integer>> : this.treasurePouch.entrySet()){
//
//        }
//    }
}