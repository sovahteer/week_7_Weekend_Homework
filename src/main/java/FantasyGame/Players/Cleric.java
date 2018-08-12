package FantasyGame.Players;

import FantasyGame.Behaviours.IHeal;
import FantasyGame.Player;

public class Cleric extends Player implements IHeal {

    private IHeal heal;

    public Cleric(String name, String race, int hp, IHeal heal) {
        super(name, race, hp);
        this.heal = heal;
    }

    public void setHeal(IHeal heal){
        this.heal = heal;
    }

    public void heal(Player player){
        this.heal.heal(player);
    }
}
