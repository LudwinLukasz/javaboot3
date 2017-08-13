package powtorkaFig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 12.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,6);
        Triangle t1 = new Triangle(4,6);
        Figure r2 = new Rectangle(1,2);
        Figure t2 = new Triangle(5,4);
        final int MAX_SIZE = 2;
        Figure[] fig = new Figure[MAX_SIZE];
        fig[0] = r2;
        fig[1] = t2;

        Figure[] figures = {r1,t1};

        System.out.println(r1.getArea());
        System.out.println(t1.getArea());
        System.out.println(r2.getArea());
        System.out.println(t2.getArea());
        for (Figure f:fig
             ) {
            System.out.println( "Area: " + f.getArea());
        }
// za pomoca List - interfejs
        // ArrayList implementuje List podobniejsza do tablicy nowa tablica kopiowana ze starej
        // LinkedList za pomoca wskaznikow referencji a->b->c ... ->null

        List<Figure> figa = new ArrayList<>();
        figa.add(t1);
        figa.add(r1);
        figa.add(r2);
        for (Figure f: figa
             ) {
            System.out.println("Lista: " + f.getArea());

        }
        System.out.println(figa);

    }
}
