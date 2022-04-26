package armor;

public class ChestArmor extends Armor {
    private ChestArmor(double durability, double k) {
        super(durability, k);
    }

    public static ChestArmor create() {
        return new ChestArmor(115, 12.2);
    }
}
