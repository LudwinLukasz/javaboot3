package gra2D;

/**
 * Created by arabk on 12.08.2017.
 */
public class Wall extends GameObject {
    private Colour colour;

    public Wall(int x, int y, int height, int width, Colour colour) {
        super(x, y, height, width);
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "x=" + x +
                ", y=" + y +
                ", height=" + height +
                ", width=" + width +
                ", colour=" + colour +
                '}';
    }

    public String show() {
        switch (colour) {
            case RED: return "r";
            case BLACK: return "b";
            default: return "g";
        }
    }
}
