package generic;

import java.util.*;

/**
 * Created by arabk on 13.08.2017.
 */
public class MainTabletoList {

    public static void main(String[] args) {
        String [] tab = {"ala","ma","kota"};
        List<String> lista = new ArrayList<>();
        TableToList.fromArrayToCollection(tab,lista);
        System.out.println(lista);

        Long [] t= {1L,2L,3L,4L,2L};
        Set<Long> set = new HashSet<>();
        TableToList.fromArrayToCollection(t,set);
        // w zbiorze nie ma porzadku i powtorzen
        System.out.println(set);


    }
}
