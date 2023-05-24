package equipment;

import characters.CreatureType;

public class MythicalCreature {

    private String name;
    private CreatureType creatureType;
    private int defenseValue;

    public MythicalCreature(String name, CreatureType creatureType, int defenseValue){
        this.name = name;
        this.creatureType = creatureType;
        this.defenseValue = defenseValue;
    }

    public String getName() {
        return name;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(CreatureType creatureType) {
        this.creatureType = creatureType;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }
}
