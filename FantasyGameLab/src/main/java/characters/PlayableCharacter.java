package characters;

import equipment.TreasurePouch;
import treasure.Treasure;

import java.util.HashMap;
import java.util.Map;

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

//    public void addTreasure(Treasure treasure, int amount){
//        Integer currValue;
//        if(this.treasurePouch.containsKey(treasure)) {
//            currValue = this.treasurePouch.get(treasure);
//        } else {
//            currValue = 0;
//        }
//        this.treasurePouch.put(treasure, currValue + amount);
//    }
//    public HashMap<Treasure, Integer> getTreasurePouch() {
//        return treasurePouch;
//    }
//    public int getTreasureCount(Treasure treasure){
//        return this.treasurePouch.get(treasure);
//    }

//    public int getTreasureValue(Treasure treasure){
//        return treasure.getValue();
//    }
//
//    public int getPouchValue(){
//        int totalValue = 0;
//        for (Map.Entry<Treasure, Integer> entry : this.treasurePouch.entrySet()){
//            Treasure key = entry.getKey();
//            int count = getTreasureCount(key);
//            totalValue += count * getTreasureValue(key);
//        }
//        return totalValue;
//    }

    public void stealTreasure(PlayableCharacter victim){
        if(victim.treasurePouch.getPouchValue() > 0){
            this.treasurePouch.combineTreasurePouches(victim.treasurePouch);
        }
    }

}