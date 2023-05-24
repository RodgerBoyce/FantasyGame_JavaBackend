package characters;

import behaviours.Equipable;
import behaviours.IFight;
import equipment.Equipment;
import equipment.MythicalCreature;

public class MagicCharacter extends PlayableCharacter implements IFight, Equipable {

    private Equipment equipment;
    private MythicalCreature mythicalCreature;

    public MagicCharacter(String name, int health, Equipment equipment, MythicalCreature mythicalCreature){
        super(name, health);
        this.equipment = equipment;
        this.mythicalCreature = mythicalCreature;
    }

    public int getImpactScore(){
        return 0;
    }
    public void takeDamage(int damageAmount){
        this.setHealth(this.getHealth() - damageAmount + this.mythicalCreature.getDefenseValue());
    }

    public int giveDamage(){
        return this.equipment.getHealthImpact();
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }
    public Equipment getEquipment() {
        return equipment;
    }

    public void switchEquipment(Equipment newEquipment){
        this.equipment = newEquipment;
    }
}
