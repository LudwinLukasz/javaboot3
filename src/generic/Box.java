package generic;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabk on 13.08.2017.
 */
public class Box<T> {

    private List<T> array = new ArrayList<>();

    public void addElement(T element) {
        array.add(element);
    }
    public void removeElement(int i) {
        array.remove(i);
    }
// zeby dzialalo jak trzeba to klasa T powinna miec zdefinowana funkcje equals
    // bo remove szuka i porownuje elementy do usuniecia wiec musi miec jak porownac
    public void removeElement(T o) {
        array.remove(o);
    }

    public String showElements() {
        String out="";
        for (T elem: array
             ) {
            out += elem.toString() + " ";

        }
        return out;
    }

    @Override
    public String toString() {
        return "Box{" +
                "array=" + array +
                '}';
    }

    public T getElement(int i) {
        return array.get(i);
    }
public int getSize() {
        return array.size();
}

}
