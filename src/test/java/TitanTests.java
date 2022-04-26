import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import titans.ArmoredTitan;

/**
 * Testing Reiner Brun (ArmoredTitan)
 * First we make sure the data is read correctly from the config.json file
 * Tests 1 and 2  are for data validation HP_Test(){for organ} and Durability_Test(){for armored}
 * Tests 3 and 4 are related to the status of the armor (is armor destroy or not ?)
 * Tests 5 and 6 are related to the status of the organ (is armor organ or not ?)
 * Tests 7,8,9 is 3 scenario for testing titan hp and durability by damaging
 * Test 7 (scenario1) damage to organ ,destroy armor and organ together
 * Test 8 (scenario2) damage to organ ,keep armor and organ together
 * Test 9 (scenario3) damage to armor ,keep organ , destroy armor
 **/
public class TitanTests {
    //1
    @Test
    public void HP_Test(){
        ArmoredTitan Reiner = ArmoredTitan.create();
        assertEquals(30,Reiner.getFaceOrgan().getHp());
        assertEquals(210,Reiner.getChestOrgan().getHp());
        assertEquals(80,Reiner.getLeftArmOrgan().getHp());
        assertEquals(80,Reiner.getRightArmOrgan().getHp());
        assertEquals(45,Reiner.getLeftFootOrgan().getHp());
        assertEquals(45,Reiner.getRightFootOrgan().getHp());
        assertEquals(45,Reiner.getNeckOrgan().getHp());
        assertEquals(50,Reiner.getStomachOrgan().getHp());
        assertEquals(55,Reiner.getLeftLegArmor().getHp());
        assertEquals(55,Reiner.getLeftLegArmor().getHp());
    }
    //2
    @Test
    public void Durability_Test(){
        ArmoredTitan Reiner = ArmoredTitan.create();
        assertEquals(60,Reiner.getFaceOrgan().getArmor().getDurability());
        assertEquals(115,Reiner.getChestOrgan().getArmor().getDurability());
        assertEquals(75,Reiner.getLeftArmOrgan().getArmor().getDurability());
        assertEquals(75,Reiner.getRightArmOrgan().getArmor().getDurability());
        assertEquals(76.3,Reiner.getLeftFootOrgan().getArmor().getDurability());
        assertEquals(76.3,Reiner.getRightFootOrgan().getArmor().getDurability());
        assertEquals(50,Reiner.getNeckOrgan().getArmor().getDurability());
        assertEquals(100,Reiner.getStomachOrgan().getArmor().getDurability());
        assertEquals(110,Reiner.getLeftLegArmor().getArmor().getDurability());
        assertEquals(110,Reiner.getLeftLegArmor().getArmor().getDurability());
    }
    //3
    @Test
    public void Armored_Destroy(){
        ArmoredTitan Reiner = ArmoredTitan.create();
        /** Keep Armors **/
        assertTrue(Reiner.getFaceOrgan().getArmor().takeDamage(1000));
        assertTrue(Reiner.getLeftLegArmor().getArmor().takeDamage(1350));
        assertTrue(Reiner.getRightLegArmor().getArmor().takeDamage(4205));
        assertTrue(Reiner.getChestOrgan().getArmor().takeDamage(5000));
        assertTrue(Reiner.getLeftArmOrgan().getArmor().takeDamage(6132));
        assertTrue(Reiner.getRightArmOrgan().getArmor().takeDamage(3050));
        assertTrue(Reiner.getNeckOrgan().getArmor().takeDamage(905));
        assertTrue(Reiner.getLeftFootOrgan().getArmor().takeDamage(6127));
        assertTrue(Reiner.getRightFootOrgan().getArmor().takeDamage(1290));
        assertTrue(Reiner.getStomachOrgan().getArmor().takeDamage(8210));
    }
    //4
    @Test
    public void Armored_Keep(){
        ArmoredTitan Reiner = ArmoredTitan.create();
        /** Keep Armors **/
        assertFalse(Reiner.getFaceOrgan().getArmor().takeDamage(10));
        assertFalse(Reiner.getLeftLegArmor().getArmor().takeDamage(150));
        assertFalse(Reiner.getRightLegArmor().getArmor().takeDamage(425));
        assertFalse(Reiner.getChestOrgan().getArmor().takeDamage(700));
        assertFalse(Reiner.getLeftArmOrgan().getArmor().takeDamage(115));
        assertFalse(Reiner.getRightArmOrgan().getArmor().takeDamage(200));
        assertFalse(Reiner.getNeckOrgan().getArmor().takeDamage(95));
        assertFalse(Reiner.getLeftFootOrgan().getArmor().takeDamage(67));
        assertFalse(Reiner.getRightFootOrgan().getArmor().takeDamage(206));
        assertFalse(Reiner.getStomachOrgan().getArmor().takeDamage(354));
    }
    //5
    @Test
    public void Organ_Destroy(){
        ArmoredTitan Reiner = ArmoredTitan.create();
        /** Keep Armors **/
        assertTrue(Reiner.getFaceOrgan().takeDamage(350));
        assertTrue(Reiner.getLeftLegArmor().takeDamage(150));
        assertTrue(Reiner.getRightLegArmor().takeDamage(425));
        assertTrue(Reiner.getChestOrgan().takeDamage(700));
        assertTrue(Reiner.getLeftArmOrgan().takeDamage(652));
        assertTrue(Reiner.getRightArmOrgan().takeDamage(365));
        assertTrue(Reiner.getNeckOrgan().takeDamage(95));
        assertTrue(Reiner.getLeftFootOrgan().takeDamage(367));
        assertTrue(Reiner.getRightFootOrgan().takeDamage(698));
        assertTrue(Reiner.getStomachOrgan().takeDamage(478));
    }
    //6
    @Test
    public void Organ_Keep(){
        ArmoredTitan Reiner = ArmoredTitan.create();
        /** Keep Armors **/
        assertFalse(Reiner.getFaceOrgan().takeDamage(10));
        assertFalse(Reiner.getLeftLegArmor().takeDamage(35));
        assertFalse(Reiner.getRightLegArmor().takeDamage(45));
        assertFalse(Reiner.getChestOrgan().takeDamage(64));
        assertFalse(Reiner.getLeftArmOrgan().takeDamage(70));
        assertFalse(Reiner.getRightArmOrgan().takeDamage(56));
        assertFalse(Reiner.getNeckOrgan().takeDamage(18));
        assertFalse(Reiner.getLeftFootOrgan().takeDamage(28));
        assertFalse(Reiner.getRightFootOrgan().takeDamage(10));
        assertFalse(Reiner.getStomachOrgan().takeDamage(36));
    }
    //7
    @Test
    public void Scenario1(){
        /// Damage To : Organ  ,  OrganStatus : Destroy   ,  ArmoredStatus: Destroy
        ArmoredTitan Reiner = ArmoredTitan.create();
        assertEquals(210,Reiner.getChestOrgan().getHp());
        assertEquals(115,Reiner.getChestOrgan().getArmor().getDurability());
        assertEquals(true,Reiner.getChestOrgan().takeDamage(3000));// Damage to ChestOrgan
        assertEquals(0,Reiner.getChestOrgan().getArmor().getDurability()); // Destroy ChestArmor
    }
    //8
    @Test
    public void Scenario2(){
        /// Damage To : Organ  ,  OrganStatus : Keep   ,  ArmoredStatus: Keep
        ArmoredTitan Reiner = ArmoredTitan.create();
        assertEquals(45,Reiner.getNeckOrgan().getHp());
        assertEquals(50,Reiner.getNeckOrgan().getArmor().getDurability());
        assertEquals(false,Reiner.getNeckOrgan().takeDamage(50)); // Damage to NeckOrgan
        assertEquals(27,Reiner.getNeckOrgan().getArmor().getDurability()); // keep NeckArmor
    }
    //9
    @Test
    public void Scenario3(){
        /// Damage To : Armored  ,  OrganStatus : Keep   ,  ArmoredStatus: Destroy
        ArmoredTitan Reiner = ArmoredTitan.create();
        assertEquals(50,Reiner.getStomachOrgan().getHp());
        assertEquals(100,Reiner.getStomachOrgan().getArmor().getDurability());
        assertEquals(true,Reiner.getStomachOrgan().getArmor().takeDamage(1250)); // Damage to StomachArmor
        assertEquals(0,Reiner.getStomachOrgan().getArmor().getDurability()); // Destroy StomachArmor
    }
}


