package FantasyGame.Enemies;

public abstract class Enemy {

    private int hp;

    public Enemy(int hp) {
        this.hp = hp;

    }

    public int getHp(){
        return hp;
    }

    public int takeDamage(int damage){
         this.hp -= damage;
         return hp;
    }
}
