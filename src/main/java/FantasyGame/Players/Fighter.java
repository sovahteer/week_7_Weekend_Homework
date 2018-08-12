package FantasyGame.Players;

import FantasyGame.Behaviours.IWeapon;

public class Fighter extends MeleeOrRanged implements IWeapon {

    public Fighter(String name, String race, int hp, IWeapon weapon) {
        super(name, race, hp, weapon);
    }
}