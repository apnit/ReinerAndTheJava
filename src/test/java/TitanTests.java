import org.junit.jupiter.api.Test;
import titans.ArmoredTitan;

public class TitanTests {
    public static void main(String[] args) {
        ArmoredTitan Reiner = ArmoredTitan.create();
        System.out.println(Reiner.getFaceOrgan().getHp());
        Reiner.getFaceOrgan().takeDamage(20);
        System.out.println(Reiner.getFaceOrgan().getHp());

    }
}
