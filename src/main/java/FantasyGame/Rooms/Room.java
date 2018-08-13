package FantasyGame.Rooms;

import FantasyGame.Enemies.Enemy;

import java.util.ArrayList;

public  class Room {

//    private ArrayList<Exit> direction;

    Enemy homeEnemy;
    Enemy awayEnemy;

    public Room(Enemy homeEnemy, Enemy awayEnemy) {
        this.homeEnemy = homeEnemy;
        this.awayEnemy = awayEnemy;
    }

    public Enemy fight(){
        //for loop where enemies have a go at eah other, until one is dead
        //return the winner

        while (this.homeEnemy.getHp() > 0 && this.awayEnemy.getHp() > 0){
            this.homeEnemy.attack(this.awayEnemy);
            this.awayEnemy.attack(this.homeEnemy);
        }

        return (this.homeEnemy.getHp() > 0) ? homeEnemy : awayEnemy;//just an example
    }

}