package gra2D;

/**
 * Created by arabk on 12.08.2017.
 */
public class Player extends GameObject {
    static final int vel = 10;
    private String name;

    public Player(int x, int y, int height, int width, String name) {
        super(x, y, height, width);
        this.name = name;
    }

    public static int getVel() {
        return vel;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "x=" + x +
                ", y=" + y +
                ", height=" + height +
                ", width=" + width +
                ", speed=" + vel +
                ", name='" + name + '\'' +
                '}';
    }
    public String show() {
        return "p";
    }
}
