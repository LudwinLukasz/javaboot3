package powtorkaFig;

/**
 * Created by arabk on 12.08.2017.
 */
public class Triangle extends Figure {
    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return 0.5*a*b;
    }
}
