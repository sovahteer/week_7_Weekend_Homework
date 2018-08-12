package FantasyGame.Equipment;

import FantasyGame.Behaviours.IWeapon;
import FantasyGame.Enemies.Enemy;

public class Weapon implements IWeapon {
    private WeaponType weapon;

    public Weapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public WeaponType getWeapon(){
        return this.weapon;
    }

    public void attack (Enemy enemy){ enemy.takeDamage(this.weapon.getDamage());}
}
