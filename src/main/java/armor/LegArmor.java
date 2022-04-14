package armor;

public class LegArmor extends Armor {
    private LegArmor(double durability, double k) {
        super(durability, k);
    }

    public static LegArmor create() {
        return new LegArmor(110, 12);
    }
}
