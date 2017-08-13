package powtorkaFig;

/**
 * Created by arabk on 12.08.2017.
 */
public abstract class Figure {
    protected double a;
    protected double b;
    //protected Figure[] figures;
    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }
    // nie potrzeba tu argumentow bo a i b dostepne sa w klasie
    public abstract double getArea();

    @Override
    public String toString() {
        return "Figure{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
