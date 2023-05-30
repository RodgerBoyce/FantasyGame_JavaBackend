package characters;

import behaviours.IFight;

public class Monster extends PlayableCharacter implements IFight {

    int damageValue;

    public Monster(String name, int health, int damageValue){
        super(name, health);
        this.damageValue = damageValue;
    }

    public void takeDamage(int damageAmount){
        this.setHealth(this.getHealth() - damageAmount);
    }



    public int giveDamage(){
        return getDamageValue();
    }

    private int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
}
