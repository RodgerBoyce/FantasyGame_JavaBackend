package equipment;

public enum Equipment {
    SWORD(EquipmentType.STANDARD, 10),
    CLUB(EquipmentType.STANDARD, 5),
    AXE(EquipmentType.STANDARD, 15),
    FIRESPELL(EquipmentType.MAGIC,10),
    LIGHTNINGSPELL(EquipmentType.MAGIC, 5),
    HEALINGPOTION(EquipmentType.HEALING, 10),
    HEALINGBANDAGE(EquipmentType.HEALING, 5);

    private final EquipmentType equipmentType;
    private final int healthImpact;

    Equipment(EquipmentType equipmentType, int healthImpact){
        this.equipmentType = equipmentType;
        this.healthImpact = healthImpact;
    }
    public int getHealthImpact() {
        return healthImpact;
    }
    public EquipmentType getEquipmentType() {
        return equipmentType;
    }
}
