package generic;

/**
 * Created by arabk on 13.08.2017.
 */
public class Main {


    public static void main(String[] args) {
        Pair<String, Integer> pg= new Pair<>("Jan", 3);
        // to moglo by byc getName, getAge to nie lista tylko klasa
        System.out.println(pg.getFirst() + " " + pg.getLast());
        String name= pg.getFirst();
        int m = pg.getLast();
        pg.setFirst(name+ " Kowalski");
        pg.setLast(m+1);
        System.out.println(pg.getFirst() + " " + pg.getLast());

        Vector3D<String> v1 = new Vector3D<>("jeden","dwa","trzy");
        Vector3D<String> v3 = new Vector3D<>("jeden","dwa","trzy");
        Vector3D<Long> v2 = new Vector3D<>(1L,2L,3L);
        System.out.println(v1.getX() + v2.getX());
        //Vector3D<String>[] v = new Vector3D[2]; - tak to jest generycznie
        Vector3D[] v = new Vector3D[2];
        v[0] = v1;
        v[1] = v3;
        for (Vector3D vv: v
             ) {
            System.out.println(vv);
        }
        Box<String> b = new Box();
        b.addElement("ala");
        b.addElement("slso");
        b.removeElement(1);
        System.out.println(b.showElements());
        Box<Vector3D> vec = new Box();
        vec.addElement(v1);
        vec.addElement(v2);
        vec.addElement(v2);
       // vec.removeElement(1);
        vec.removeElement(v1);

        System.out.println(vec.showElements());
        System.out.println(vec.toString());
        //zeby bylo ladnie to lepiej jakbym dodal te same vectory
        Box<Vector3D<String>> boxVec = new Box<>();
        //mozna anonimowo
        boxVec.addElement(new Vector3D<>("j","d","t"));
        boxVec.addElement(v3);
        boxVec.addElement(v1);
        boxVec.removeElement(1);
        Box<Vector3D<String>> boxVec2 = new Box<>();
        boxVec2.addElement(v3);
        boxVec2.addElement(v1);
        Box<Vector3D<String>> boxVec3 = new Box<>();
        boxVec3.addElement(v3);
        boxVec3.addElement(v1);
        System.out.println(boxVec.showElements());
        boolean result = SimpleComparator.compare(boxVec2,boxVec3);

        System.out.println(result);
        boolean result2 = SimpleComparator.compare(boxVec,boxVec2);
        System.out.println(result2);
        // mozna wymusic dodanie Stringa pod innym adresem
        // String s1 = new String("ala")
        // wtedy s1.equals(s2)
        









    }

}
