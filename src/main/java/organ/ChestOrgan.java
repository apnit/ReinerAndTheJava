package organ;

import armor.ChestArmor;

public class ChestOrgan extends Organ {
    private ChestOrgan(double hp) {
        super(hp, ChestArmor.create());
    }

    public static ChestOrgan create() {
        return new ChestOrgan(210);
    }
}
