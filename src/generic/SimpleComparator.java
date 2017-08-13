package generic;

/**
 * Created by arabk on 13.08.2017.
 */
public class SimpleComparator {

    public static <T> boolean compare(Box<T> b1, Box<T> b2) {
        // porownac b1 z b2 true jesli wszystkie elementy sa rowne
        if (b1.getSize() != b2.getSize()) {
            return false;
        }
    for (int i = 0; i< b1.getSize();i++) {
        if (! b1.getElement(i).equals(b2.getElement(i))) return false;
    }
        return true;
    }

}
