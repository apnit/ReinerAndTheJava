package armor;

public class FaceArmor extends Armor {
    private FaceArmor(double durability, double k) {
        super(durability, k);
    }

    public static FaceArmor create() {
        return new FaceArmor(60, 1.8);
    }
}
