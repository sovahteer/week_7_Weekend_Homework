package FantasyGame.Magic;

public enum SpellType {

    MAGICMISSILE(4),
    FIREBOLT(6),
    ELDRITCHBLAST(8);

    public final int damage;

    SpellType(int damage){ this.damage = damage;}

    public int getDamage(){
        return damage;
    }
}
