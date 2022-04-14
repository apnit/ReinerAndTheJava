package organ;

import armor.StomachArmor;

public class StomachOrgan extends Organ {
    private StomachOrgan(double hp) {
        super(hp, StomachArmor.create());
    }

    public static StomachOrgan create() {
        return new StomachOrgan(50);
    }
}
