import FantasyGame.Behaviours.IHeal;
import FantasyGame.Behaviours.IWeapon;
import FantasyGame.Enemies.Troll;
import FantasyGame.Magic.Heal;
import FantasyGame.Magic.HealType;
import FantasyGame.Players.Cleric;
import FantasyGame.Players.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Fighter fighter;
    Troll troll;
    IWeapon sword;
    IHeal herb;
    IHeal potion;

    @Before
    public void before(){
        herb = new Heal(HealType.HERB);
        potion = new Heal(HealType.POTION);
        troll = new Troll(100);
        fighter = new Fighter("Oriana", "Tiefling", 50, sword);
        cleric = new Cleric("AnnoyingElvishName", "Elf", 100, herb);
    }

    @Test
    public void hasName(){
        assertEquals("AnnoyingElvishName", cleric.getName());
    }

    @Test
    public void hasRace(){
        assertEquals("Elf", cleric.getRace());
    }

    @Test
    public void hasHp(){
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void canHeal(){
        cleric.heal(fighter);
        assertEquals(54, fighter.getHp());
    }

    @Test
    public void canSwapHeal(){
        cleric.setHeal(potion);
        cleric.heal(fighter);
        assertEquals(56, fighter.getHp());

    }
}
