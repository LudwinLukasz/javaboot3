package gra2D;

/**
 * Created by arabk on 12.08.2017.
 */
public class Enemy extends GameObject {
    private int velocity;

    public Enemy(int x, int y, int height, int width, int velocity) {
        super(x, y, height, width);
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "x=" + x +
                ", y=" + y +
                ", speed=" + velocity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
    public String show() {
        return "e";
    }
}
