package armor;

public class NeckArmor extends Armor {
    private NeckArmor(double durability, double k) {
        super(durability, k);
    }

    public static NeckArmor create() {
        return new NeckArmor(-1, -1);
    }
}
