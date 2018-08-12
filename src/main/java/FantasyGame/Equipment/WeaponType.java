package FantasyGame.Equipment;

import FantasyGame.Behaviours.IWeapon;
import FantasyGame.Enemies.Enemy;

public enum WeaponType {

    SWORD(8),
    AXE(10),
    CLUB(6),
    BOW(8);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
