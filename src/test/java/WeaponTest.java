import FantasyGame.Equipment.Weapon;
import FantasyGame.Equipment.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon(WeaponType.SWORD);
    }

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.SWORD, weapon.getWeaponType());
    }
}
