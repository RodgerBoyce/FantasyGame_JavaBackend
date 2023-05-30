package enums;

import characters.CreatureType;
import equipment.Equipment;
import equipment.MythicalCreature;

public enum MagicNPC {
    WALDO("WALDO", 100, Equipment.LIGHTNINGSPELL,
            "Zebedee", CreatureType.UNICORN, 5),
    MERLIN("Merlin", 100,Equipment.FIRESPELL,
            "Wings", CreatureType.DRAGON, 10),
    GANDALF("Gandalf", 140, Equipment.LIGHTNINGSPELL,
            "Bilbo", CreatureType.DRAGON, 15);

    private final String name;
    private final int health;
    private final Equipment weapon;
    private final String nameOfMC;
    private final CreatureType creatureType;
    private final int defensiveValOfMC;

    MagicNPC(String name, int health, Equipment weapon,
                String nameOfMC, CreatureType creatureType, int defence){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.nameOfMC = nameOfMC;
        this.creatureType = creatureType;
        this.defensiveValOfMC = defence;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Equipment getWeapon() {
        return weapon;
    }

    public String getNameOfMC() {
        return nameOfMC;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public int getDefensiveValOfMC() {
        return defensiveValOfMC;
    }
}
