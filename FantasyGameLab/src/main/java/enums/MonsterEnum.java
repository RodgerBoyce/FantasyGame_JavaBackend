package enums;

public enum MonsterEnum {
    MONSTER1("Orcus Borkus", 75, 5),
    MONSTER2("Guffy Horribilus", 90, 10),
    MONSTER3("Gerisaurus", 45, 15),
    MONSTER4("Tobysaurus", 120, 10),
    MONSTER5("Cthulu", 50, 5);

    private final String name;
    private final int health;
    private final int damageValue;

    MonsterEnum(String name, int health, int damageValue){
        this.name = name;
        this.health = health;
        this.damageValue = damageValue;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
