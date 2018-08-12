package FantasyGame.Players;

import FantasyGame.Behaviours.IWeapon;
import FantasyGame.Enemies.Enemy;
import FantasyGame.Player;

public abstract class MeleeOrRanged extends Player {

    private IWeapon weapon;

    public MeleeOrRanged(String name, String race, int hp, IWeapon weapon) {
        super(name, race, hp);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon){ this.weapon = weapon; }

    public void attack(Enemy enemy){ this.weapon.attack(enemy); }
}


