package characters;

import behaviours.Equipable;
import behaviours.IFight;
import equipment.Equipment;

public class NonMagicCharacter extends PlayableCharacter implements Equipable, IFight {

    private Equipment equipment;

    public NonMagicCharacter(String name, int health, Equipment equipment){
        super(name, health);
        this.equipment = equipment;
    }

    public int getImpactScore(){
        return 0;
    }

    public void takeDamage(int damageAmount){
        this.setHealth(this.getHealth() - damageAmount);
    }

    public int giveDamage(){
        return this.equipment.getHealthImpact();
    }
}
