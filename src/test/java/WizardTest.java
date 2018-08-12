import FantasyGame.Behaviours.ISpell;
import FantasyGame.Defenders.Dragon;
import FantasyGame.Enemies.Troll;
import FantasyGame.Magic.Spell;
import FantasyGame.Magic.SpellType;
import FantasyGame.Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    ISpell firebolt;
    ISpell magicMissile;
    ISpell eldritchBlast;
    Dragon dragon;
    Troll troll;

    @Before
    public void before(){
        firebolt = new Spell(SpellType.FIREBOLT);
        magicMissile = new Spell(SpellType.MAGICMISSILE);
        eldritchBlast = new Spell(SpellType.ELDRITCHBLAST);
        dragon = new Dragon(100, 40);
        troll = new Troll(100);
        wizard = new Wizard ("Ulysses", "Human", 100, magicMissile);
    }

    @Test
    public void hasName(){
        assertEquals("Ulysses", wizard.getName());
    }

    @Test
    public void hasRace(){
        assertEquals("Human", wizard.getRace());
    }

    @Test
    public void hasHp() {
        assertEquals(100, wizard.getHp());
    }

    @Test
    public void canCast(){
        wizard.cast(troll);
        assertEquals(96, troll.getHp());
    }

    @Test
    public void canSwapSpell(){
        wizard.setSpell(magicMissile);
        wizard.cast(troll);
        assertEquals(96, troll.getHp());
    }

    @Test
    public void canSetDefender(){
        wizard.setDefender(dragon);
        wizard.defend(troll);
        assertEquals(60, troll.getHp());

    }
}
