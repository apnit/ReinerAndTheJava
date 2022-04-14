package organ;

import armor.Armor;
import interfaces.Damageable;

public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    public double getHp() {
        return hp;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public boolean takeDamage(double force) {
        if(armor.getDurability()<=0){
            this.hp -= force;
        }
        else{
            hp -= (force*calcResist(armor.getDurability()))/100;
            armor.takeDamage(force);
        }
        hp = Math.round(hp*10)/10;
        if(hp<=0)
            return true;
        else
            return false;
    }

    private double calcResist(double x) {
        return (100 - (x/2));
    }
}
