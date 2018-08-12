import FantasyGame.Defenders.Dragon;
import FantasyGame.Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Troll troll;

    @Before
    public void before(){
        dragon = new Dragon(100, 40);
        troll = new Troll(100);
    }

    @Test
    public void hasHp(){
        assertEquals(100, dragon.getHp());
    }

    @Test
    public void canDefend(){
        dragon.defend(troll);
        assertEquals(60, troll.getHp());
    }

}
