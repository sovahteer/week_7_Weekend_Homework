package FantasyGame;

public abstract class Player {

    private int hp;
    private String name;
    private String race;

    public Player(String name, String race, int hp) {
        this.name = name;
        this.race = race;
        this.hp = hp;
    }

    public String getName(){
        return name;
    }

    public String getRace(){
        return race;
    }

    public int getHp(){
        return hp;
    }
}
