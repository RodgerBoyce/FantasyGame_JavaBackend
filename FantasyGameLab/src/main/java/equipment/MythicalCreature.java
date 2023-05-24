package equipment;

import characters.CreatureType;

public class MythicalCreature {

    private String name;
    private CreatureType creatureType;
    int defenseValue;

    public MythicalCreature(String name, CreatureType creatureType, int defenseValue){
        this.name = name;
        this.creatureType = creatureType;
        this.defenseValue = defenseValue;
    }

    public String getName() {
        return name;
    }
}
