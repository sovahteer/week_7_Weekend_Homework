package FantasyGame.Players;

import FantasyGame.Behaviours.IDefend;
import FantasyGame.Behaviours.ISpell;

public class Wizard extends Mage implements ISpell, IDefend {

    public Wizard(String name, String race, int hp, ISpell spell) {
        super(name, race, hp, spell);
    }
}
