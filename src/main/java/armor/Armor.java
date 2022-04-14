package armor;

import interfaces.Damageable;

public abstract class Armor implements Damageable {
    protected double durability;
    protected double k;

    public Armor(double durability, double k) {
        this.durability = durability;
        this.k = k;
    }

    public double getDurability() {
        return durability;
    }

    public double getK() {
        return k;
    }

    @Override
    public boolean takeDamage(double force) {
        double damageSize = force/this.k;
        this.durability -= damageSize;
        if (this.durability<=0)
            return true;
        else
            return false;
    }
}
