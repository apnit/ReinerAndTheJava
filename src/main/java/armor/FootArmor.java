package armor;

public class FootArmor extends Armor {
    private FootArmor(double durability, double k) {
        super(durability, k);
    }

    public static FootArmor create() {
        return new FootArmor(-1, -1);
    }
}
