package viceCity.models.players;

public class MainPlayer extends BasePlayer {

    public static int INITIAL_LIFE_POINTS = 100;
    public static String NAME = "Tommy Vercetti";

    public MainPlayer() {
        super(NAME, INITIAL_LIFE_POINTS);
    }
}
