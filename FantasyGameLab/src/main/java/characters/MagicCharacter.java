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

    public String takeDamage(){
        return "Tis but a scratch!!";
    }

    public String giveDamage(){
        return "I'm going to batter lumps out you!!";
    }
}
