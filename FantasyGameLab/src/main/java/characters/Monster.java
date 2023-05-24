package characters;

import behaviours.IFight;

public class Monster extends PlayableCharacter implements IFight {

    int damageValue;

    public Monster(String name, int health, int damageValue){
        super(name, health);
        this.damageValue = damageValue;
    }

    public String takeDamage(){
        return "Ow!";
    }

    public String giveDamage(){
        return "Grrr Arggh!";
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
}
