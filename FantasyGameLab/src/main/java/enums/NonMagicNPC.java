package enums;

import equipment.Equipment;

public enum NonMagicNPC {
    CLAIRE("Claire", 100, Equipment.AXE),
    RODGER("Rodger", 100,Equipment.SWORD);

    private final String name;
    private final int health;
    private final Equipment weapon;

    NonMagicNPC(String name, int health, Equipment weapon){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
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
}
