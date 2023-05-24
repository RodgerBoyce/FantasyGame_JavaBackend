package characters;

import equipment.Equipment;
import equipment.MythicalCreature;

public class MagicCharacter extends PlayableCharacter{

    private Equipment equipment;
    private MythicalCreature mythicalCreature;

    public MagicCharacter(String name, int health, Equipment equipment, MythicalCreature mythicalCreature){
        super(name, health);
        this.equipment = equipment;
        this.mythicalCreature = mythicalCreature;
    }

    public void impactHealth(PlayableCharacter target){
        System.out.println("Impacting health of " + target.getName());
    }

}
