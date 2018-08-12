package FantasyGame.Magic;

import FantasyGame.Behaviours.IHeal;
import FantasyGame.Player;

public class Heal implements IHeal {

    private HealType heal;

    public Heal(HealType heal) {
        this.heal = heal;
    }

    public HealType getHeal(){
        return this.heal;
    }

    public void heal(Player player){
        player.restoreHp(this.heal.getRestore());
    }
}
