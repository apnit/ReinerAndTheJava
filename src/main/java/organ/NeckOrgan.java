package organ;

import armor.NeckArmor;

public class NeckOrgan extends Organ {
    private NeckOrgan(double hp) {
        super(hp, NeckArmor.create());
    }

    public static NeckOrgan create() {
        return new NeckOrgan(45);
    }
}
