package organ;

import armor.FootArmor;

public class FootOrgan extends Organ{
    private FootOrgan(double hp) {
        super(hp, FootArmor.create());
    }

    public static FootOrgan create() {
        return new FootOrgan(-1);
    }
}
