package organ;

import armor.FaceArmor;

public class FaceOrgan extends Organ {
    private FaceOrgan(double hp) {
        super(hp, FaceArmor.create());
    }

    public static FaceOrgan create() {
        return new FaceOrgan(30);
    }
}
