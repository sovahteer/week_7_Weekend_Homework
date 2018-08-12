import FantasyGame.Behaviours.IWeapon;
import FantasyGame.Enemies.Enemy;
import FantasyGame.Enemies.Troll;
import FantasyGame.Equipment.Weapon;
import FantasyGame.Players.Fighter;
import FantasyGame.Equipment.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter;
    IWeapon sword;
    IWeapon bow;
    Enemy enemy;

    @Before
    public void before(){
        sword = new Weapon(WeaponType.SWORD);
        bow = new Weapon(WeaponType.BOW);
        fighter = new Fighter( "Fernando", "'Human'", 20, sword );
        enemy = new Troll(20);
    }

    @Test
    public void hasName(){
        assertEquals("Fernando", fighter.getName());
    }

    @Test
    public void hasRace(){
        assertEquals("'Human'", fighter.getRace());
    }

    @Test
    public void hasHp(){
        assertEquals(20, fighter.getHp());
    }

    @Test
    public void canSwapWeapon(){
        fighter.setWeapon(bow);
        fighter.attack(enemy);
        assertEquals(12, enemy.getHp());
    }

    @Test
    public void canAttack(){
        fighter.attack(enemy);
        assertEquals(12, enemy.getHp());
    }
}
