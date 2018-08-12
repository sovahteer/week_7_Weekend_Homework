import FantasyGame.Magic.Spell;
import FantasyGame.Magic.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void before(){
        spell = new Spell(SpellType.FIREBOLT);
    }

    @Test
    public void hasSpell(){
        assertEquals(SpellType.FIREBOLT, spell.getSpell());
    }
}
