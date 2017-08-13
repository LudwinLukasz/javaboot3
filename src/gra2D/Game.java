package gra2D;

/**
 * Created by arabk on 12.08.2017.
 */
public class Game {
    private final int H = 3;
    private final int W = 2;

    Enemy e1 = new Enemy(1, 2, 3, 4, 5);
    Wall w1 = new Wall(2, 5, 6, 2, Colour.BLACK);
    Wall w2 = new Wall(2, 5, 6, 2, Colour.GREEN);
    Wall w3 = new Wall(2, 5, 6, 2, Colour.RED);
    Player p1 = new Player(2, 5, 1, 3, "ala");

    GameObject[][] game = new GameObject[4][5];
}
