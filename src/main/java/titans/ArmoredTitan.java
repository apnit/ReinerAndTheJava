package titans;

import organ.*;

public class ArmoredTitan {
    private FaceOrgan faceOrgan;
    private NeckOrgan neckOrgan;
    private ArmOrgan rightArmOrgan;
    private ArmOrgan leftArmOrgan;
    private ChestOrgan chestOrgan;
    private StomachOrgan stomachOrgan;
    private LegOrgan rightLegArmor;
    private LegOrgan leftLegArmor;
    private FootOrgan rightFootOrgan;
    private FootOrgan leftFootOrgan;

    private ArmoredTitan(
            FaceOrgan faceOrgan,
			NeckOrgan neckOrgan,
			ArmOrgan rightArmOrgan,
			ArmOrgan leftArmOrgan,
			ChestOrgan chestOrgan,
			StomachOrgan stomachOrgan,
			LegOrgan rightLegArmor,
			LegOrgan leftLegArmor,
			FootOrgan rightFootOrgan,
			FootOrgan leftFootOrgan) {
        this.faceOrgan = faceOrgan;
        this.neckOrgan = neckOrgan;
        this.rightArmOrgan = rightArmOrgan;
        this.leftArmOrgan = leftArmOrgan;
        this.chestOrgan = chestOrgan;
        this.stomachOrgan = stomachOrgan;
        this.rightLegArmor = rightLegArmor;
        this.leftLegArmor = leftLegArmor;
        this.rightFootOrgan = rightFootOrgan;
        this.leftFootOrgan = leftFootOrgan;
    }

    public FaceOrgan getFaceOrgan() {
        return faceOrgan;
    }

    public NeckOrgan getNeckOrgan() {
        return neckOrgan;
    }

    public ArmOrgan getRightArmOrgan() {
        return rightArmOrgan;
    }

    public ArmOrgan getLeftArmOrgan() {
        return leftArmOrgan;
    }

    public ChestOrgan getChestOrgan() {
        return chestOrgan;
    }

    public StomachOrgan getStomachOrgan() {
        return stomachOrgan;
    }

    public LegOrgan getRightLegArmor() {
        return rightLegArmor;
    }

    public LegOrgan getLeftLegArmor() {
        return leftLegArmor;
    }

    public FootOrgan getRightFootOrgan() {
        return rightFootOrgan;
    }

    public FootOrgan getLeftFootOrgan() {
        return leftFootOrgan;
    }

    public void setFaceOrgan(FaceOrgan faceOrgan) {
        this.faceOrgan = faceOrgan;
    }

    private void setNeckOrgan(NeckOrgan neckOrgan) {
        this.neckOrgan = neckOrgan;
    }

    private void setRightArmOrgan(ArmOrgan rightArmOrgan) {
        this.rightArmOrgan = rightArmOrgan;
    }

    private void setLeftArmOrgan(ArmOrgan leftArmOrgan) {
        this.leftArmOrgan = leftArmOrgan;
    }

    private void setChestOrgan(ChestOrgan chestOrgan) {
        this.chestOrgan = chestOrgan;
    }

    private void setStomachOrgan(StomachOrgan stomachOrgan) {
        this.stomachOrgan = stomachOrgan;
    }

    private void setRightLegArmor(LegOrgan rightLegArmor) {
        this.rightLegArmor = rightLegArmor;
    }

    private void setLeftLegArmor(LegOrgan leftLegArmor) {
        this.leftLegArmor = leftLegArmor;
    }

    private void setRightFootOrgan(FootOrgan rightFootOrgan) {
        this.rightFootOrgan = rightFootOrgan;
    }

    private void setLeftFootOrgan(FootOrgan leftFootOrgan) {
        this.leftFootOrgan = leftFootOrgan;
    }

    public static ArmoredTitan create() {
        return null;
    }
}
