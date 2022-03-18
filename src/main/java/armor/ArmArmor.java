package armor;

public class ArmArmor extends Armor {
    private ArmArmor(double durability, double k) {
        super(durability, k);
    }
    
    public static ArmArmor create() {
        return new ArmArmor(-1, -1);
    }
}
