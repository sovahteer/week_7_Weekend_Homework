package FantasyGame.Players;

import FantasyGame.Behaviours.IDefend;
import FantasyGame.Behaviours.ISpell;
import FantasyGame.Enemies.Enemy;
import FantasyGame.Player;

public abstract class Mage extends Player {

    private ISpell spell;
    private IDefend defender;

    public Mage(String name, String race, int hp, ISpell spell) {
        super(name, race, hp);
        this.spell = spell;
        this.defender = defender;
    }

    public void setSpell(ISpell spell){
        this.spell = spell;
    }

    public void setDefender(IDefend defender){
        this.defender = defender;
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }

    public void defend(Enemy enemy){
        this.defender.defend(enemy);
    }
}
