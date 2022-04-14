package armor;

public class StomachArmor extends Armor {
    private StomachArmor(double durability, double k) {
        super(durability, k);
    }

    public static StomachArmor create() {
        return new StomachArmor(100, 11.2);
    }
}
