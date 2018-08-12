import FantasyGame.Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll(20);
    }

    @Test
    public void hasHp(){
        assertEquals(20, troll.getHp());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(8);
        assertEquals(12, troll.getHp());
    }
}
