package organ;

import armor.ArmArmor;

public class ArmOrgan extends Organ {
    private ArmOrgan(double hp) {
        super(hp, ArmArmor.create());
    }
    
    public static ArmOrgan create() {
        return new ArmOrgan(80);
    }
}
