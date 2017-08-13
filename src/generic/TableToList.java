package generic;

import java.util.Collection;
import java.util.List;

/**
 * Created by arabk on 13.08.2017.
 */
public class TableToList {
    // mozna tabele sobie zrobic final na wszelki wyp zeby byla read only
    // Collection to i lista i hash itp
    public static <T> void fromArrayToCollection(final T [] array, Collection<T> collection) {
        for (T element: array
             ) {
            collection.add(element);
        }

    }
}
