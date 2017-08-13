package gra2D;

/**
 * Created by arabk on 12.08.2017.
 */
public abstract class GameObject {
    protected int x,y,height,width;

    public GameObject(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    abstract String show();
}
