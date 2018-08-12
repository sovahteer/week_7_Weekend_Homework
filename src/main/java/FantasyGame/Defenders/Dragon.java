package FantasyGame.Defenders;

import FantasyGame.Behaviours.IDefend;
import FantasyGame.Enemies.Enemy;

public class Dragon implements IDefend {

    private int hp;
    private int defenceRating; //Do I need this?

    public Dragon(int hp, int defenceRating) {
        this.hp = hp;
        this.defenceRating = defenceRating;
    }

    public int getHp(){
        return hp;
    }

    public int getDefenceRating() {
        return defenceRating;
    }

    public void defend(Enemy enemy){
        enemy.takeDamage(this.defenceRating);

    }
    // When an enemy attacks a player, the Dragon needs to take the damage instead?
}
