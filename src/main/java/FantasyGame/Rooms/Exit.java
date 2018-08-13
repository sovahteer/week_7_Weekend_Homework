package FantasyGame.Rooms;

public enum Exit {

    NORTH("North"),
    EAST("East"),
    SOUTH("South"),
    WEST("West");

    private final String direction;

    Exit(String direction) {
        this.direction = direction;
    }

    public String getDirection(){
        return direction;
    }
}
