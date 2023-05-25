package equipment;

import treasure.Treasure;

import java.util.HashMap;
import java.util.Map;

public class TreasurePouch {
    private HashMap<Treasure, Integer> treasurePouch;

    public TreasurePouch(){
        this.treasurePouch = new HashMap<Treasure, Integer>();
    }

    public HashMap<Treasure, Integer> getEntireTreasurePouch() {
        return treasurePouch;
    }
    public void setTreasurePouch(HashMap<Treasure, Integer> treasurePouch) {
        this.treasurePouch = treasurePouch;
    }

    public void setPouchValueToEmpty(Treasure treasure){
        this.treasurePouch.put(treasure, 0);
    }

    public void addTreasure(Treasure treasure, Integer quantity){
        Integer currValue;
        if(this.treasurePouch.containsKey(treasure)) {
            currValue = this.treasurePouch.get(treasure);
        } else {
            currValue = 0;
        }
        this.treasurePouch.put(treasure, currValue + quantity);
    }

    public int getTreasureCount(Treasure treasure){
        return this.treasurePouch.get(treasure);
    }

    public int getTreasureValue(Treasure treasure){
        return treasure.getValue();
    }

    public int getPouchValue(){
        int totalValue = 0;
        for (Map.Entry<Treasure, Integer> entry : this.treasurePouch.entrySet()){
            Treasure key = entry.getKey();
            int count = getTreasureCount(key);
            totalValue += count * getTreasureValue(key);
        }
        return totalValue;
    }

    public TreasurePouch combineTreasurePouches(TreasurePouch treasureToAdd){
        for (Map.Entry<Treasure, Integer> entry : treasureToAdd.getEntireTreasurePouch().entrySet()){
            this.addTreasure(entry.getKey(), entry.getValue());
            treasureToAdd.setPouchValueToEmpty(entry.getKey());
        }
        return this;
    }
}
