package powtorkaFig;

/**
 * Created by arabk on 12.08.2017.
 */
public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
