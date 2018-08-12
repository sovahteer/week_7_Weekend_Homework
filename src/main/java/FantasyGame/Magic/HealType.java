package FantasyGame.Magic;

public enum HealType {
    HERB(4),
    POTION(6);

    public final int restore;

    HealType(int restore){
        this.restore = restore;
    }

    public int getRestore(){
        return restore;
    }
}
