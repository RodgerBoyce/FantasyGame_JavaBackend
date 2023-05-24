package characters;

import behaviours.Equipable;
import equipment.Equipment;

public class NonMagicCharacter extends PlayableCharacter implements Equipable {

    private Equipment equipment;

    public NonMagicCharacter(String name, int health, Equipment equipment){
        super(name, health);
        this.equipment = equipment;
    }

    public void impactHealth(PlayableCharacter target){
        System.out.println("Impacting health of " + target.getName());
    }

}
